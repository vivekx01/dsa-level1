package M2_Patterns;

import java.util.Scanner;

public class P14_Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i =1;i<=10;i++){
            int mul = i*n;
            System.out.println(n+" * " + i +" = " + mul );
        }
    }
}
