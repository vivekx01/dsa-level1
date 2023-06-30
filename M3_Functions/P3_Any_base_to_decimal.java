package M3_Functions;

import java.util.Scanner;

public class P3_Any_base_to_decimal {
    public static int convert(int n, int base) {
        int val = 0;
        int power = 1;
        while (n > 0) {
            int dig = n % 10; // getting remainder by dividing it by 10 because we convert it into decimal
            n = n / 10;
            val += dig * power;
            power = power * base;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be converted to decimal: ");
        int n = sc.nextInt();
        System.out.println("Enter the base of the input: ");
        int base = sc.nextInt();
        System.out.println(convert(n,base));

    }
}
