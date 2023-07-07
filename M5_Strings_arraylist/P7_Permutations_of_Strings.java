package M5_Strings_arraylist;

import java.util.Scanner;

public class P7_Permutations_of_Strings {
    public static void solution(String str){
        int n = str.length();
        int f = factorial(n);

        // outer loop to ensure that all the factorials are printed
        for (int i =0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            // inner loop for printing every character of one permutation
            for (int divisor=n;divisor>=1;divisor--){
                int quotient = temp/divisor;
                int remainder = temp%divisor;

                System.out.print(sb.charAt(remainder));
                sb.deleteCharAt(remainder);
                temp = quotient;
            }
            System.out.println();
        }
    }
    public static int factorial (int n){
        int val = 1;
        for (int i =2;i<=n;i++){
            val = val*i;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}
