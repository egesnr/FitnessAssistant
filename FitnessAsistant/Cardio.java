package FitnessAsistant;

import java.util.Scanner;

public class Cardio extends Hareketler {
    Scanner s = new Scanner(System.in);
    public Cardio() {

        System.out.println("Cardio Program is for getting lost weights");
        System.out.println("You have 3 exercise which are Running,Cycling and Rowing");
        System.out.println("Please select the amount of every exercise");
        System.out.println("Running: ");
        setRunning(s.nextInt());
        System.out.println("Cycling: ");
        setBycycle(s.nextInt());
        System.out.println("Rowing: ");
        setRowing(s.nextInt());
        System.out.println("Your Program Schecdule\n" +
                "Runnig "+ getRunning()+"\n" +
                "Cycling "+ getBycycle()+"\n" +
                "Rowing "+getRowing());
        System.out.println("Have a nice day");


    }


}
