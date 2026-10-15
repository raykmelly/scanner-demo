package com.pluralsight;

// Imports the scanner, so I can write input into the terminal
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // New scanner to get input from the keyboard / terminal
        // We can use this scanner multiple times to get input
        Scanner scanner = new Scanner(System.in);

        // Using print to ask the user a question
        System.out.println("Please enter your name: ");

        // Get answer / input from the user
        // Tells the computer to read the next line for what the user typed
        String name = scanner.nextLine();
    }
}