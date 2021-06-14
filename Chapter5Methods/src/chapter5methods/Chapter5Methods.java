package chapter5methods;

import java.util.Scanner;

public class Chapter5Methods {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String choice = menu();

        if (choice.equalsIgnoreCase("manage")) {
            manageItemsForSaleAndSetPrices();
        }
        else if (choice.equalsIgnoreCase("shop")){
            shopForItems();
        }
        
        methodAExampleMethodsCallingMethods();
        
        int first = 42;
        int second = 99;
        
        System.out.println(addNumbers(first, second));
        
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
    
    // primitive types  like int and double are passed by value ( copies )
    public static int addNumbers(int firstNumber, int secondNumber){
        firstNumber += 10;
        secondNumber -= 10;
        return firstNumber + secondNumber;
    }
    
    public static void manageItemsForSaleAndSetPrices(){
        String itemName = promptForItemName();
            double price = promptForPrice(itemName);
            double anotherPrice = promptForPrice(promptForItemName());
    }
    
    public static void shopForItems(){
        System.out.println("Shop for items...");
    }

    public static void methodAExampleMethodsCallingMethods() {
        System.out.println("A");
        methodB();
    }

    public static void methodB() {
        System.out.println("B");
        methodC();
    }

    public static void methodC() {
        System.out.println("C");
    }

    public static String menu() {
        String choice = "";

        while (!choice.equalsIgnoreCase("shop") && !choice.equalsIgnoreCase("manage")) {
            System.out.println("Do you want to Shop or Manage");
            choice = keyboard.nextLine();
        }

        return choice;
    }

    public static double promptForPrice(String itemName) {
        //Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the price of " + itemName);
        double price = Double.parseDouble(keyboard.nextLine());
        
        itemName = "Apples";

        return price;
    }

    public static String promptForItemName() {
        System.out.println("Enter the name of an item:");
        return keyboard.nextLine();
    }

}
