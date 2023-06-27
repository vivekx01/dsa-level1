package M2_Patterns;

import java.util.Scanner;

public class P12_Fibonacci_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        // outer loop for rows
        for (int i =1;i<=n;i++){
            // inner loop for numbers
            for (int j=1;j<=i;j++){
                // logic for fibonacci
                System.out.print(n1+"\t");
                int temp = n1+n2;
                n1 = n2;
                n2 = temp;
            }
            System.out.println();
        }
    }
}
