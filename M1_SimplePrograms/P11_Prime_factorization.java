package M1_SimplePrograms;

import java.util.*;
public class P11_Prime_factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int divisor = 2;
        while(n>1) {
            // if the divisor can divide the number print it as it is prime
            if (n % divisor == 0) {
                System.out.print(divisor + " ");
                n /= divisor;
            } else {
                divisor++; //else just increment the divisor and let the loop run until n becomes 1
            }
        }
    }
}
