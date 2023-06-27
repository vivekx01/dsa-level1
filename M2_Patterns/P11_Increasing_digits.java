package M2_Patterns;

import java.util.Scanner;

//the program takes input n and prints n rows with digits in each row increasing by one and printing the number
public class P11_Increasing_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 1;
        // outer loop for rows
        for (int i =1;i<=n;i++){
            // inner loop for numbers
            for (int j=1;j<=i;j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
