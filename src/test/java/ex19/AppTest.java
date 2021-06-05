package ex19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_includes_bmi() {
        App myApp = new App();

        double bmi = 12.5;

        String expectedOutput;

        if (bmi < 18.5) {
            expectedOutput = "Your BMI is 12.5.\n" +
                    "You are underweight. You should see your doctor.";
        } else if (bmi < 25) {
            expectedOutput = "Your BMI is 19.5.\n" +
                    "You are within the ideal weight range.";
        } else {
            expectedOutput = "Your BMI is 32.5.\n" +
                    "You are overweight. You should see your doctor.";
        }

        String actualOutput = myApp.generateString(bmi);

        assertEquals(expectedOutput, actualOutput);
    }


}