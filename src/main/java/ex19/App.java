/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex19;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        // Input
        double height = myApp.readHeight();
        double weight = myApp.readWeight();

        // Calculations
        double bmi = myApp.calculateBMI(height, weight);

        // Output
        String outputString = myApp.generateString(bmi);
        myApp.output(outputString);
    }

    public double readHeight() {
        System.out.print("Please enter your height in inches: ");

        // User can only enter numbers
        while(!in.hasNextDouble()) {
            System.out.print("Invalid number. Please try again.\n");
            in.next();
        }

        return in.nextDouble();
    }

    public double readWeight() {
        System.out.print("Please enter your weight in pounds: ");

        // User can only enter numbers
        while(!in.hasNextDouble()) {
            System.out.print("Invalid number. Please try again.\n");
            in.next();
        }

        return in.nextDouble();
    }

    public double calculateBMI(double height, double weight) {
        return (weight / (height * height)) * 703;
    }

    public String generateString(double bmi) {
        String str1 = String.format("Your BMI is %.1f.\n", bmi);
        String str2;

        if (bmi < 18.5) {
            str2 = "You are underweight. You should see your doctor.";
        } else if (bmi < 25) {
            str2 = "You are within the ideal weight range.";
        } else {
            str2 = "You are overweight. You should see your doctor.";
        }

        return str1 + str2;
    }

    public void output(String outputString) {
        System.out.println(outputString);
    }
}
