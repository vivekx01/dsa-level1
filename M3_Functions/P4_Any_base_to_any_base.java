package M3_Functions;

import java.util.Scanner;

public class P4_Any_base_to_any_base {
    public static int convert(int n, int base,int conbase) {
        int val = 0;
        int power = 1;
        while (n > 0) {
            int dig = n % conbase; // getting remainder by dividing it by conbase because we convert it into desired base
            n = n / conbase; // getting the quotient for the next iteration by removing the last digit
            val += dig * power;
            power = power * base;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter the base of the input number: ");
        int base = sc.nextInt();
        System.out.println("Enter the base in which to convert: ");
        int conbase = sc.nextInt();
        System.out.println(convert(n,base,conbase));
    }
}
