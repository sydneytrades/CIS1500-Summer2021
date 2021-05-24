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

        // chain of if else if else if... are mutually exclusion - one and only one will run
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

        // logical and
        // true && true == true
        // true && false == false
        // false && true == false
        // false && false == false
        // logical or
        // true || true == true
        // true || false == true
        // false || true == true
        // false || false == false
        // NOT mutually exclusive - be careful with the if blocks
        if (someNumber >= 1_000_000_000) {
            System.out.println("Your number is in the billions");
        }
        if (someNumber < 1_000_000_000 && someNumber >= 100_000_000) {
            System.out.println("Your number is in the hundred millions");
        }
        if (someNumber < 100_000_000 && someNumber >= 10_000_000) {
            System.out.println("Your number is in the ten millions");
        }
        if (someNumber < 10_000_000 && someNumber >= 1_000_000) {
            System.out.println("Your number is in the millions");
        }
        if (someNumber < 1_000_000 && someNumber >= 100_000) {
            System.out.println("Your number is in the hundred thousands");
        }
        if (someNumber < 100_000 && someNumber >= 10_000) {
            System.out.println("Your number is in the ten thousands");
        }
        if (someNumber < 10_000 && someNumber >= 1_000) {
            System.out.println("Your number is in the thousands");
        }
        if (someNumber < 1_000 && someNumber >= 100) {
            System.out.println("Your number is in the hundreds");
        }
        if (someNumber < 100 && someNumber >= 10) {
            System.out.println("Your number is in the tens");
        } // you can't have a default because there are no else blocks
        if (someNumber < 10 && someNumber >= 1) {
            System.out.println("Your number is in the tens");
        }

        System.out.println("What's the temperature outside?");
        int temperature = Integer.parseInt(keyboard.nextLine());
        // farenhiet == sad
        if (temperature < 32) {
            System.out.println("Bring your winter coat");
        } else if (temperature < 50) {
            System.out.println("Bring your jacket");
        } else {
            System.out.println("you're fine in a t-shirt");
        }

        System.out.println("What's the weather like? (rain, snow, sun)");
        String weather = keyboard.nextLine();

        // don't use == for strings -- it doesn't work =(
        if (weather == "rain") {
            System.out.println("bring an umbrella");
        } else if (weather == "snow") {
            System.out.println("Bring your gloves");
        } else {
            System.out.println("it's a nice day!");
        }

        // when comparing strings, use equalsIgnoreCase or equals, whichever you need
        if (weather.equalsIgnoreCase("rain")) {
            System.out.println("bring your umbrella!");
        } else if (weather.equalsIgnoreCase("snow")) {
            System.out.println("bring your gloves!");
        } else {
            System.out.println("bring your suncreeen!");
        }

        if (weather.equalsIgnoreCase("rain")) {
            // only exists inside the curly braces it was declared in
            String item = "umbrella";
        } else if (weather.equalsIgnoreCase("snow")) {
            String item = "gloves";
        } else {
            String item = "sunscreen";
        }
        //System.out.println("bring your " + item + "!");

        String item;
        if (weather.equalsIgnoreCase("rain")) {
            item = "umbrella";
        } else if (weather.equalsIgnoreCase("snow")) {
            item = "gloves";
        } else {
            item = "sunscreen";
        }
        System.out.println("bring your " + item + "!");

        String anotherItem;
        // can't switch using equalsIgnoreCase
        switch (weather.toLowerCase()) {
            case "rain":
                anotherItem = "umbrella";
                break;
            case "snow":
                anotherItem = "gloves";
                break;
            default:
                anotherItem = "sunscreen";
            // no break needed, the switch is already done
        }

        System.out.println("Enter how much money you have for lunch: ");
        double lunchMoney = Double.parseDouble(keyboard.nextLine());

        String lunchChoice;
        if (lunchMoney >= 5.00) {
            lunchChoice = "Burger King";
        } else {
            lunchChoice = "Ramen Noodles";
        }

        System.out.println("lunch today is: " + lunchChoice);

        // ternary expression or condional operator
        String otherLunchChoice = lunchMoney < 5.00 ? "Ramen Noodles" : "Burger King";
        System.out.println("lunch today is: " + otherLunchChoice);

        System.out.println(String.format("Lunch today is: %s", otherLunchChoice));

        System.out.println(
                "You have $" + lunchMoney + " for lunch, so lunch today is: " + otherLunchChoice);

        // no new line character =(
        System.out.printf("You have $%.2f for lunch, so lunch today is: %s\n",
                         lunchMoney, otherLunchChoice);
        
        System.out.println(
                String.format("You have $%.2f for lunch, so lunch today is: %s",
                         lunchMoney, otherLunchChoice));
    }

}
