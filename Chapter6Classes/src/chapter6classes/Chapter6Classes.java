
package chapter6classes;

import java.util.Random;
import java.util.Scanner;

public class Chapter6Classes {
    
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        Random random = new Random();
        
        Double.parseDouble("10.5");
        
        Mug trailsEdgeMug = new Mug();
        trailsEdgeMug.setColor("silver");
        
        System.out.println("My mug is " + trailsEdgeMug.getColor());
        
        Mug disneyMug = new Mug();
        disneyMug.setColor("blue");
        System.out.println("My mug is " + disneyMug.getColor());
        
        System.out.println("Enter the name of your student");
        String name = keyboard.nextLine();
        
        Student firstStudent = new Student(name);
        //firstStudent.setName(name); - use the constructor instead
        
        getGradesForStudent(firstStudent);
        
        // overloaded constructor, it has a different set of parameters
        Student secondStudent = new Student(name, 100, 100, 100, 100);
        
    }
    
    public static void getGradesForStudent(Student student){
        System.out.println("Enter the score for project 1 for " + student.getName());
        int score1 = Integer.parseInt(keyboard.nextLine());
        student.setProject1Grade(score1);
        
        System.out.println("Enter the score for project 2 for " + student.getName());
        int score2 = Integer.parseInt(keyboard.nextLine());
        student.setProject2Grade(score2);
        
        System.out.println("Enter the score for project 3 for " + student.getName());
        int score3 = Integer.parseInt(keyboard.nextLine());
        student.setProject3Grade(score3);
        
        System.out.println("Enter the score for the final project for " + student.getName());
        int finalScore = Integer.parseInt(keyboard.nextLine());
        student.setFinalProjectGrade(finalScore);
        
        System.out.println("The final grade for " + 
                student.getName() + " is: " + student.getOverallGrade());
    }
    
}
