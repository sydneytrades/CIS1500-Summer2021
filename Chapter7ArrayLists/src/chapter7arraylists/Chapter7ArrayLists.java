package chapter7arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter7ArrayLists {

    public static void main(String[] args) {
        // can't use primitive types, must use the wrappers
        ArrayList<Integer> scores = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a score or -1 to stop");
        int score = Integer.parseInt(keyboard.nextLine());
        
        while (score != -1) {
            scores.add(score);
            System.out.println("Enter a score or -1 to stop");
            score = Integer.parseInt(keyboard.nextLine());
        }

        score = 0;
        while (score != -1) {
            System.out.println("Enter a score or -1 to stop");
            score = Integer.parseInt(keyboard.nextLine());

            if (score != -1) {
                scores.add(score);
            }
        }

        System.out.println("Highest: " + findHighest(scores));
        System.out.println("Lowest: " + findLowest(scores));
        System.out.println("Average: " + findAverage(scores));

    }

    public static int findHighest(ArrayList<Integer> values) {
        int highest = values.get(0);

        for (int index = 1; index < values.size(); index++) {
            if (values.get(index) > highest) {
                highest = values.get(index);
            }
        }

        return highest;
    }

    public static int findLowest(ArrayList<Integer> values) {
        int lowest = values.get(0);

        for (int index = 1; index < values.size(); index++) {
            if (values.get(index) < lowest) {
                lowest = values.get(index);
            }
        }

        return lowest;
    }

    public static double findAverage(ArrayList<Integer> values) {
        double total = 0;

        for (int value : values) {
            total += value;
        }

        double average = total / values.size();

        return average;
    }

}
