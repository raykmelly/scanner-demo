package com.pluralsight;

// Imports the scanner, so I can write input into the terminal
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // New scanner to get input from the keyboard / terminal
        // We can use this scanner multiple times to get input
        Scanner scanner = new Scanner(System.in);

        // ---------------------------------------------------------------------------------
        // KNOWN ISSUE: When changing your scanner from an int input to a string
        // input, typing the "enter" key skips the string input.
        // ---------------------------------------------------------------------------------

        // Example (Get a year from the user)
        System.out.println("Enter what year it is: ");
        int year = scanner.nextInt();

        // The fix is: use scanner.newLine(); to eat the "enter" from the scanner.nextInt();
        scanner.nextLine();

        // Using print to ask the user a question
        System.out.println("Enter your first name: ");

        // Get answer / input from the user
        // Tells the computer to read the next line for what the user typed
        String firstname = scanner.nextLine();

        // Ask the user for their last name
        System.out.println("Enter your last name:");

        // Capture the users input (last name)
        String lastname = scanner.nextLine();

        // Ask the user for their lucky number
        System.out.println("Enter your lucky number: ");

        // Collect / store the lucky number
        // This is different because we used "scanner.nextInt();" It matters because
        // When the input from user changes the type of ".next[type]" changes
        int luckyNumber = scanner.nextInt();

        // Print out all the information from the user
        System.out.printf(
                "Your name is %s %s. The year is %d. Your lucky number is: %d.%n%n",
                firstname,lastname,year,luckyNumber);

        // Ask the user for a number + store it
        System.out.println("Enter a integer: ");
        int num1 = scanner.nextInt();

        // Ask the user for another number + store it
        System.out.println("Enter another integer: ");
        int num2 = scanner.nextInt();

        // Add the two numbers + display
        int sum = num1 + num2;
        System.out.printf("The sum of: %d + %d = %d%n",num1,num2,sum);

    }
}