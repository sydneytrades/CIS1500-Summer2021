package chapter4;

import java.util.Random;
import java.util.Scanner;

public class Chapter4 {

    public static void main(String[] args) {
        int number = 10;
        number = 42;

        number = number + 10;

        number += 10;

        number += 1;

        number++; // increment operation - adds 1

        ++number;  // prefix increment

        System.out.println("The current value of number is: " + number);

        System.out.println("The current value of number is: " + number++);

        System.out.println("The current value of number is: " + ++number);

        number--; // decrement

        int numberOfGuesses = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many guesses do you want?");
        int maxGuesses = Integer.parseInt(keyboard.nextLine());

        Random random = new Random(); // this is not for cryptographic stuff
        int randomNumber = random.nextInt(100) + 1; // 0-99 randomly + 1 gives 1-100

        while (numberOfGuesses++ < maxGuesses) {
            System.out.println("Guess a number 1-100?");
            int guess = Integer.parseInt(keyboard.nextLine());

            if (guess == randomNumber) {
                System.out.println("You got it right!");
            } else if (guess < randomNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high!");
            }
        }

        int x = 10;
        while (x >= 0) {
            System.out.println(x--);
        }

        // start it at a an 'invalid' number so the loops runs
        int usersNumber = 0;

        while (usersNumber < 1 || usersNumber > 10) {
            System.out.println("Enter a number 1-10");
            usersNumber = Integer.parseInt(keyboard.nextLine());
        }

        int usersNumberDoLoop;
        do {
            System.out.println("Enter a number 1-10");
            usersNumberDoLoop = Integer.parseInt(keyboard.nextLine());
        } while (usersNumberDoLoop < 1 || usersNumberDoLoop > 10); // I hate this semi colon

        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("y")) {

            int computerThrow = random.nextInt(3);

            String computerChoice;

            if (computerThrow == 0) {
                computerChoice = "rock";
            } else if (computerThrow == 1) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }
            String choice = "";

            while (!choice.equalsIgnoreCase("rock")
                    && !choice.equalsIgnoreCase("paper")
                    && !choice.equalsIgnoreCase("scissors")) {
                System.out.println("Rock, paper, or scissors?");
                choice = keyboard.nextLine();
            }

            if ((choice.equalsIgnoreCase("paper") && computerChoice.equals("rock"))
                    || (choice.equalsIgnoreCase("rock") && computerChoice.equals("scissors"))
                    || (choice.equalsIgnoreCase("sciossors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else if (choice.equalsIgnoreCase(computerChoice)) {
                System.out.println("You tie!");;
            } else {
                System.out.println("you lose!");
            }
            System.out.println("Do you want to play again? ( y/n )");
            playAgain = keyboard.nextLine();
        }

        // initialize; condition; update
        for (int rows = 0; rows < 10; rows++) {
            for (int star = 0; star <= rows; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // infinite loop
//        for(;;){
//            System.out.println("YOLO");
//        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("i: " + i + " - j: " + j);
            }
        }

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    // println is 'slow'
                    //System.out.println(String.format("%02d:%02d:%02d",
                    //        hour, minute, second));
                }
            }
        }

        int total = 0;

        for (int value = 1; value <= 10; value++) {
            System.out.println("Please enter the " + value + " value:");
            total += Integer.parseInt(keyboard.nextLine());
        }

        System.out.println("The total of those is: " + total);

        int totalSales = 0;
        int receipt;
        do {
            System.out.println("Enter the receipt total or 0 to stop: ");
            receipt = Integer.parseInt(keyboard.nextLine());
            totalSales += receipt;
        } while (receipt != 0); // 0 is our sentinel value that means stop, it's not a normal value

        System.out.println("Total sales for those receipts: $" + totalSales);

        for (int someNumber = 0; someNumber <= 100; someNumber++) {
            if (someNumber % 2 == 1) {
                continue; // stop the loop body, go update/check condition
            }

            System.out.println(someNumber);
            if (someNumber == 10) {
                break; // totally stops the loop
            }
        }
    }

}
