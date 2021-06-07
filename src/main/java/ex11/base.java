/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 11 - Currency Conversion
 *  Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro.
 *  Print out the new amount in U.S. dollars.
 *
 *  Constraint:
 *  Ensure that fractions of a cent are rounded up to the next penny.
 *  Use a single output statement.
 *
 */

package ex11;
import java.util.Scanner;

public class base {
    public static void main(String [] args)
    {
        // Variable Initialization
        Scanner userInput = new Scanner(System.in);
        double euros, rate, dollars;

        // User Input Step
        System.out.printf("How many euros are you exchanging? ");
        euros = userInput.nextDouble();
        System.out.printf("What is the exchange rate? ");
        rate = userInput.nextDouble();

        // Calculations and Output
        System.out.printf("%.2f euros at an exchange rate of %f is%n", euros, rate);
        dollars = euros * rate;
        System.out.printf("%.2f U.S. dollars", dollars);
    }
}
