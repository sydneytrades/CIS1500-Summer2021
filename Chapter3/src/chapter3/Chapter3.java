package chapter3;

import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello, what is your favorite number 10-99?");

        int favoriteNumber = Integer.parseInt(keyboard.nextLine());

        System.out.println("Your favorite number is : " + favoriteNumber);

        int magicNumber = favoriteNumber * 9;

        // integer division drops the decimal reminder
        int hundredsPlace = magicNumber / 100;
        int tensPlace = magicNumber % 100 / 10;
        int onesPlace = magicNumber % 10;

        System.out.println(hundredsPlace + "" + tensPlace + "" + onesPlace);

        int sumOfDigits = hundredsPlace + tensPlace + onesPlace;

        int sumTensPlace = sumOfDigits / 10;
        int sumOnesPlace = sumOfDigits % 10;

        boolean thisIsTrue = true;

        System.out.println("I bet our magic math gives us 9");

        System.out.println(sumTensPlace + sumOnesPlace);

        System.out.println("Enter a number, and we will tell you if it is even or odd");

        int someNumber = Integer.parseInt(keyboard.nextLine());

        // if requires a boolean or boolean expression to check
        if (someNumber % 2 != 1) { // someNumber % 2 == 0
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number is odd!");
        }

        if ('E' < 'R') {
            System.out.println("E is less than R");
        } else {
            System.out.println("E is NOT less than R");
        }

        if (someNumber >= 10) {
            if (someNumber >= 100) {
                if (someNumber >= 1_000) {
                    if (someNumber >= 10_000) {
                        if (someNumber >= 100_000) {
                            if (someNumber >= 1_000_000) {
                                if (someNumber >= 10_000_000) {
                                    if (someNumber >= 100_000_000) {
                                        if (someNumber >= 1_000_000_000) {
                                            System.out.println("Your number is in the billions");
                                        } else {
                                            System.out.println("Your number is in the hundred millions");
                                        }
                                    } else {
                                        System.out.println("Your number is in the ten millions");
                                    }
                                } else {
                                    System.out.println("Your number is in the millions");
                                }
                            } else {
                                System.out.println("Your number is in the hundred thousands");
                            }
                        } else {
                            System.out.println("Your number is in the ten thousands");
                        }
                    } else {
                        System.out.println("Your number is in the thousands");
                    }
                } else {
                    System.out.println("Your number is in the hundreds");
                }
            } else {
                System.out.println("Your number is in the tens");
            }
        } else {
            System.out.println("Your number is in the ones");
        }

        if (someNumber >= 1_000_000_000) {
            System.out.println("Your number is in the billions");
        } else if (someNumber >= 100_000_000) {
            System.out.println("Your nubmer is in the hundred millions");
        } else if (someNumber >= 10_000_000) {
            System.out.println("Your nubmer is in the ten millions");
        } else if (someNumber >= 1_000_000) {
            System.out.println("Your nubmer is in the millions");
        } else if (someNumber >= 100_000) {
            System.out.println("Your nubmer is in the hundred thousands");
        } else if (someNumber >= 10_000) {
            System.out.println("Your nubmer is in the ten thousands");
        } else if (someNumber >= 1_000) {
            System.out.println("Your nubmer is in the thousands");
        } else if (someNumber >= 100) {
            System.out.println("Your nubmer is in the hundreds");
        } else if (someNumber >= 10) {
            System.out.println("Your nubmer is in the tens");
        } else {
            System.out.println("Your nubmer is in the ones");
        }

    }

}
