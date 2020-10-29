package FitnessAsistant;

import java.util.Scanner;

public class Strength extends Hareketler {
    Scanner s = new Scanner(System.in);
    public Strength(){
        System.out.println("Strength Program is for getting your muscles stronger");
        System.out.println("You have 3 exercise which are BenchPress,BarbellRow and BarbellCurl");
        System.out.println("Please select the amount of every exercise");
        System.out.println("BenchPress: ");
        setBenchpress(s.nextInt());
        System.out.println("BarbellRow: ");
        setBarbellRow(s.nextInt());
        System.out.println("BarbellCurl ");
        setBarbellCurl(s.nextInt());
        System.out.println("Your Program Schecdule\n" +
                "Runnig "+ getBenchpress()+"\n" +
                "Cycling "+ getBarbellRow()+"\n" +
                "Rowing "+getBarbellCurl());
        System.out.println("Have a nice day");

    }
}
