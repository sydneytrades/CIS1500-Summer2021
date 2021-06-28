package midtermreview;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MidtermReview {

    public static void main(String[] args) throws FileNotFoundException {
        // a loop that prompts a user to enter numeric values until 
        // they enter a sentinel value to stop the loop.

        Scanner keyboard = new Scanner(System.in);

        int number = 0;
        while (number != -1) {
            System.out.println("Enter a number or -1 to stop");
            number = Integer.parseInt(keyboard.nextLine());
        }

        // Prompt the user to enter the name of a file, 
        // create a file with that name and prompt the user 5 times 
        // to enter their favorite classes, 
        // write them to the file 1 line per class
        System.out.println("Enter the name for a file");
        String fileName = keyboard.nextLine();

        PrintWriter outputFile = new PrintWriter(fileName);

        for (int classNumber = 0; classNumber < 5; classNumber++) {
            System.out.println("Enter the name of one of your favorite classes");
            String className = keyboard.nextLine();
            outputFile.println(className);
        }

        outputFile.close();
        
        System.out.println(simonSays());

    }

    /*
            Write a method simonSays that prompts the user to enter a command, 
            ensure the command startswith "simon says" ( use a validation loop ), 
            then return the string command
     */
    
    public static String simonSays() {
        Scanner keyboard = new Scanner(System.in);

        String command = "";

        while (!command.startsWith("Simon says")) {

            System.out.println("Enter a Simon says command");
            command = keyboard.nextLine();

        }

        return command;

    }

}
