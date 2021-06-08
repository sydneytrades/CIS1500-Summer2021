package chapter4.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Chapter4Files {

    public static void main(String[] args) throws IOException {
        // open files, read/write files, close files

        PrintWriter outputFile = new PrintWriter("c:\\test\\testFile.txt"); // overwrites the file
        outputFile.println("Hello world!");
        outputFile.println("I can make files now!");
        outputFile.println("What should we put in here?");
        outputFile.close();

        File inputFile = new File("c:/test/testFile.txt");
        Scanner fileReader = new Scanner(inputFile); // scanner can read files too!
        while (fileReader.hasNext()) {
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of a file to read");
        String fileName = keyboard.nextLine();

        File usersFile = new File(fileName);

        if (usersFile.exists()) {
            System.out.println("Reading " + usersFile.getAbsolutePath());
            fileReader = new Scanner(usersFile); // scanner can read files too!
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } else {
            System.out.println(usersFile.getAbsolutePath() + " doesn't exist!");
        }

        System.out.println("Enter the name of a file to write to: ");
        fileName = keyboard.nextLine();

        System.out.println("Do you want to overwrite or append to the file? ( o/a )");
        String mode = keyboard.nextLine();
        PrintWriter customFileWriter;
        if (mode.equalsIgnoreCase("o")) {
            customFileWriter = new PrintWriter(fileName);
        } else {
            FileWriter fileWriter = new FileWriter(fileName, true);
            customFileWriter = new PrintWriter(fileWriter);
        }

        String input = "";
        while (!input.equalsIgnoreCase("QUIT")) {

            System.out.println("What should we write to the file or QUIT to stop?");
            input = keyboard.nextLine();
            if (!input.equalsIgnoreCase("QUIT")) {
                customFileWriter.println(input);
            }
        }
        customFileWriter.close();

    }

}
