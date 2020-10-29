package FitnessAsistant;

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to FitnessAssistant!!!");
        kayittanAl();

        String a = s.nextLine();
        Account x = new Account();
        if(a.equals("1")){
            if(x.vke().equals("Skinny"))
                new Cardio();
            else if(x.vke().equals("Normal"))
                new Strength();
            else
                new Crossfit();
        }
        else if(a.equals("2")){
            System.out.println("We have 3 fitness program...\n" +
                    "1. Carido\n" +
                    "2. Strength\n" +
                    "3.Crossfit\n" +
                    "Press 1 for the first, 2 for the 2nd and 3 for the third.");
            String p = s.nextLine();
            if(p.equals("1"))
                new Cardio();
            else if(p.equals("2"))
                new Strength();
            else if(p.equals("3"))
                new Crossfit();
            else
                System.out.println("Invalid input. Please try again");
        }
    }


    public static void kayittanAl() {
        File file = new File("account.txt");
        Scanner s = new Scanner(System.in);
        if (file.exists()) {

            System.out.print("You have a saved account do you want to use ? (yes ya da no)");
            String cevap = s.nextLine();
            if (cevap.equals("yes")) {
                try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("account.txt"))) {
                    String a1 = (String) in.readObject();
                    System.out.println(a1);
                } catch (FileNotFoundException e) {
                    System.out.println("Dosya Bulunamadı");
                } catch (IOException e) {
                    System.out.println("Dosya Açılırken Hata Oluştu");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println("If you want to do Reccomended program press 1 or press 2 to choose another program");
            }
            else if(cevap.equals("no")){
                System.out.println("You have to use an account to join system. Please create an account");
                System.out.println("*****************************************************");
                new Account().crtAccount();
                System.out.println("If you want to do Reccomended program press 1 or press 2 to choose another program");
            }
            else
                System.out.println("Wrong input.Try Again");

        }
        else
        {
            System.out.println("You dont have an account. Please create one.");
            System.out.println("******************************************************");
            new Account().crtAccount();
            System.out.println("If you want to do Reccomended program press 1 or press 2 to choose another program");
        }
    }
}
