import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Step 1: Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();

        // Step 2: Calculate the factorial of the number
        long factorial = calculateFactorial(number);

        // Step 3: Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a valid non-negative integer from the us
