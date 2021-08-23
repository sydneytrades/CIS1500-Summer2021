package chapter7arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter7Arrays {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many scores do you have to enter?");
        int numberOfScores = Integer.parseInt(keyboard.nextLine());
        
        int[] scores = new int[numberOfScores];
        
        for (int index = 0; index < scores.length; index++) {
            System.out.println("Enter score # " + index);
            scores[index] = Integer.parseInt(keyboard.nextLine());
        }
        
        System.out.println(Arrays.toString(scores));

        // assume the first number is the largest, until we know otherwise
        int highestScore = scores[0];

        // check the rest of the array and see if you find anything bigger
        for (int index = 1; index < scores.length; index++) {
            if (scores[index] > highestScore) {
                highestScore = scores[index];
            }
        }
        
        System.out.println("The highest score is: " + highestScore);
        
        int lowestScore = scores[0];
        for (int index = 1; index < scores.length; index++) {
            if (scores[index] < lowestScore) {
                lowestScore = scores[index];
            }
        }
        
        System.out.println("The lowest score is: " + lowestScore);
        
        double total = 0;

        // enhanced for loop - read only loop
        for (int score : scores) {
            total += score;
        }
        
        int[] copyOfScores = copyArray(scores);
        
        copyOfScores[0] = 105;
        
        double average = total / scores.length;
        System.out.println("The average score is: " + average);
        
        System.out.println("Highest: " + findHighest(scores));
        System.out.println("Lowest: " + findLowest(scores));
        System.out.println("Average: " + findAverage(scores));
        
    }
    
    public static int findHighest(int[] values) {
        int highest = values[0];
        
        for (int index = 1; index < values.length; index++) {
            if (values[index] > highest) {
                highest = values[index];
            }
        }
        
        return highest;
    }
    
    public static int findLowest(int[] values) {
        int lowest = values[0];
        
        for (int index = 1; index < values.length; index++) {
            if (values[index] < lowest) {
                lowest = values[index];
            }
        }
        
        return lowest;
    }
    
    public static double findAverage(int[] values) {
        double total = 0;
        
        for (int value : values) {
            total += value;
        }
        
        double average = total / values.length;
        
        return average;
    }
    
    public static int[] copyArray(int[] values){
        int[] newValues = new int[values.length];
        
        for ( int index = 0; index < values.length; index++ ){
            newValues[index] = values[index];
        }
        
        return newValues;
    }
    
}
