package se.lexicon;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        String input;

        // Loop until the user chooses to quit
        while (true) {
            // Prompt the user to enter a year or 'q' to quit
            System.out.print("Enter a year (or 'q' to quit): ");
            input = scanner.next();

            // Check if the user wants to quit
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting...");
                break;
            }

            // Parse the input to an integer
            int year;
            try {
                year = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year or 'q' to quit.");
                continue;
            }

            // Determine if the year is a leap year
            boolean isLeapYear = (year % 4 == 0);

            // Print the result
            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
