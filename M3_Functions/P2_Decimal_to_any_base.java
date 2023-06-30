package M3_Functions;

import java.util.Scanner;

public class P2_Decimal_to_any_base {
    // Function to convert a decimal number to any base
    public static int convert(int n, int base) {
        int val = 0; // Variable to store the converted value
        int power = 1; // Variable to determine the place value

        // Loop until the decimal number becomes 0
        while (n > 0) {
            int dig = n % base; // Get the remainder (digit) when dividing the number by the base
            n = n / base; // Divide the number by the base to get the new quotient
            val += dig * power; // Add the digit multiplied by the current place value to the result
            power = power * 10; // Update the place value by multiplying it by 10
        }

        return val; // Return the converted value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Decimal number: ");
        int n = sc.nextInt(); // Read the decimal number from the user

        System.out.println("Enter any base: ");
        int base = sc.nextInt(); // Read the desired base from the user

        int result = convert(n, base); // Call the convert function to get the converted value

        System.out.println("Entered number with base " + base + " will be: " + result); // Print the result
    }
}