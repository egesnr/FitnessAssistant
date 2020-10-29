package FitnessAsistant;

import java.io.*;
import java.util.Scanner;

public class Account implements Serializable {
    Scanner s = new Scanner(System.in);
    private String name;
    private String surname;
    private double height;
    private int weight;
    private int index;
    public String Recommended;
    double a;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public void crtAccount(){
        System.out.println("Write Your Name");
        setName(s.nextLine());
        System.out.println("Write your Surname");
        setSurname(s.nextLine());
        System.out.println("Write your height");
        setHeight(s.nextDouble());
        System.out.println("Write your weight");
        setWeight(s.nextInt());
        if(vke().equals("Skinny"))
            Recommended = "Reccomended Program is Cardio";
        else if (vke().equals("Normal"))
            Recommended = "Reccomended Program is Crossfit";
        else if(vke().equals("Fat"))
            Recommended = "Reccomended Program is Powering";
        System.out.println("Account has been created\n" +
                "Name: "+getName()+"\n" +
                "Surname: "+getSurname()+"\n" +
                "Height: "+getHeight()+"\n" +
                "Weight: "+getWeight()+"\n" +
                "Body Mass Index: "+ a+" "+vke());
        System.out.println(Recommended);
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("account.txt"))){
            out.writeObject(toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Your account has succesfully  been  saved");


    }
    public String vke(){
        a = getWeight()/(getHeight()*getHeight());
        if(a<20)
            return "Skinny";
        else if(a<25)
            return "Normal";
        else
            return "Fat";

    }

    @Override
    public String toString() {
        return "Account: \n" +
                "Name: "+getName()+"\n" +
                "Surname: "+ getSurname()+"\n"+
                "Height: "+getHeight()+"\n"+
                "Weight: "+getWeight()+"\n"+
                "Boddy Mass Index: "+a+" Body Type is: "+vke()+"\n" +
                Recommended;
    }
}
