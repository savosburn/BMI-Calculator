/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_bmi_underweight() {
        App myApp = new App();

        double bmi = 12.5;

        String expectedOutput = "Your BMI is 12.5.\n" +
                    "You are underweight. You should see your doctor.";

        String actualOutput = myApp.generateString(bmi);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_bmi_normal() {
        App myApp = new App();

        double bmi = 19.5;

        String expectedOutput = "Your BMI is 19.5.\n" +
                "You are within the ideal weight range.";

        String actualOutput = myApp.generateString(bmi);

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void output_bmi_overweight() {
        App myApp = new App();

        double bmi = 32.5;

        String expectedOutput = "Your BMI is 32.5.\n" +
                "You are overweight. You should see your doctor.";

        String actualOutput = myApp.generateString(bmi);

        assertEquals(expectedOutput, actualOutput);

    }
}