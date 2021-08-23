package project1;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to my amazing college planning tool!");
        
        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        
        System.out.println(name + ", how many total credits are required for your degree?");
        int totalCreditsRequired = Integer.parseInt(keyboard.nextLine());
        
        System.out.println(name + ", how many credits have you completed?");
        int creditsCompleted = Integer.parseInt(keyboard.nextLine());
        
        double creditsRemaining = totalCreditsRequired - creditsCompleted;
        
        System.out.println(name + ", how many credits do you take each semester?");
        int averageCreditsPerSemester = Integer.parseInt(keyboard.nextLine());
        
        System.out.println(name + ", how much does each credit cost?");
        int costPerCredit = Integer.parseInt(keyboard.nextLine());
        
        int semestersRemaining = (int)Math.ceil(creditsRemaining / averageCreditsPerSemester );
        
        System.out.println("You need to take " + semestersRemaining + " more semesters");
        System.out.println("The cost of the remaining credits is: $" 
                + costPerCredit*creditsRemaining);
    }

}
