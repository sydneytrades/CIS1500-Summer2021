package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Project2 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        String mode = askForShopOrManageMode();

        if (mode.equalsIgnoreCase("manage")) {
            String itemName = askForItemNameOrStop();

            while (!itemName.equalsIgnoreCase("stop")) {
                getPriceForItemAndWriteToFile(itemName);
                itemName = askForItemNameOrStop();
            }
        } else if (mode.equalsIgnoreCase("shop")) {
            double totalCost = 0;

            String itemName = askForItemNameOrCheckout();

            while (!itemName.equalsIgnoreCase("checkout")) {
                totalCost += getPriceOfItemIfItExists(itemName);
                itemName = askForItemNameOrCheckout();
            }

            checkOut(totalCost);
        }
    }

    public static double getPriceOfItemIfItExists(String itemName) throws FileNotFoundException {
        File itemFile = new File(itemName + ".txt");

        if (itemFile.exists()) {
            Scanner fileReader = new Scanner(itemFile);
            double cost = Double.parseDouble(fileReader.nextLine());
            System.out.println(itemName + " costs: $" + cost);
            return cost;
        } else {
            System.out.println("You can't buy a " + itemName);
            return 0;
        }
    }

    public static void checkOut(double totalCost) {
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Enter a credit card number please");
        String creditCardNumber = keyboard.nextLine();
        Random random = new Random();
        System.out.println("Your confirmation number is: " + 
                (random.nextInt(1_000_000) + 1_000_000));
    }

    public static void getPriceForItemAndWriteToFile(String itemName) throws FileNotFoundException {
        PrintWriter fileWriter = new PrintWriter(itemName + ".txt");

        System.out.println("Enter the price for " + itemName);
        double price = Double.parseDouble(keyboard.nextLine());

        fileWriter.println(price);
        fileWriter.close();
    }

    public static String askForItemNameOrCheckout() {
        System.out.println("Please enter the name of an item or CHECKOUT to checkout");
        String input = keyboard.nextLine();
        return input;
    }

    public static String askForItemNameOrStop() {
        System.out.println("Please enter the name of an item or STOP to stop entering items");
        String input = keyboard.nextLine();
        return input;
        // return keyboard.nextLine(); - we saved 1 line, yay?!?
    }

    public static String askForShopOrManageMode() {
        String input = "";

        while (!input.equalsIgnoreCase("shop") && !input.equalsIgnoreCase("manage")) {
            System.out.println("Do you want to (Shop) or (Manage) items?");
            input = keyboard.nextLine();
        }

        return input;
    }

}
