package com.pluralsight;

// Imports the scanner, so I can write input into the terminal
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // New scanner to get input from the keyboard / terminal
        // We can use this scanner multiple times to get input
        Scanner scanner = new Scanner(System.in);

        // Using print to ask the user a question
        System.out.println("Enter your first name: ");

        // Get answer / input from the user
        // Tells the computer to read the next line for what the user typed
        String firstname = scanner.nextLine();

        // Ask the user for their last name
        System.out.println("Enter your last name:");

        // Capture the users input (last name)
        String lastname = scanner.nextLine();

        // Print out what the name of the user
        System.out.printf("Your name is %s %s.%n",firstname,lastname);
    }
}