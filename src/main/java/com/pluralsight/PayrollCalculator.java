package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

// initialize the Scanner for user input
        Scanner awesomeScanner = new Scanner(System.in);

        // Prompt for and capture the employee's name
        System.out.print("Enter employee name: ");
        String name = awesomeScanner.nextLine();

        // Prompt for and capture hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = awesomeScanner.nextDouble();

        //Prompt for and capture payrate
        System.out.print("Enter pay rate: ");
        double payRate = awesomeScanner.nextDouble();

        // Calculate gross pay (hours * pay rate)
        double grossPay = hoursWorked * payRate;

        // Display the result
        System.out.println("--- Payroll Summary ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);

        // Close the scanner
        awesomeScanner.close();
    }
}
