package misc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Misc {

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner keyboard = new Scanner(System.in);

        int value = -1;

        while (true) {
            try {
                value = Integer.parseInt(keyboard.nextLine());
                break; // stops the loop
            } catch (NumberFormatException ex) {
                System.out.println("Please enter only digits");
            }
        }

        System.out.println("Your number times 10 is: " + (value * 10));
        
        
        System.out.println("Enter the name of a file to write to");
        String fileName = keyboard.nextLine();
        
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.println(value);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Can't write to that file name");
        }
        
        

        System.out.println("This is the end of the program");

    }

}
