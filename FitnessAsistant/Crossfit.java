package FitnessAsistant;

import java.util.Scanner;

public class Crossfit extends Hareketler {
    Scanner s = new Scanner(System.in);
    public Crossfit(){
        System.out.println("Crossfit Program is for both improving your muscle conditon and power with your bodyweight");
        System.out.println("You have 3 exercise which are Squat,Pullup and Pushup");
        System.out.println("Please select the amount of every exercise");
        System.out.println("Squat ");
        setSquat(s.nextInt());
        System.out.println("Pullup: ");
        setPullup(s.nextInt());
        System.out.println("Pushup ");
        setPushup(s.nextInt());
        System.out.println("Your Program Schecdule\n" +
                "Squat "+ getSquat()+"\n" +
                "Pullup "+ getPullup()+"\n" +
                "Pushup "+getPushup());
        System.out.println("Have a nice day");
    }
}
