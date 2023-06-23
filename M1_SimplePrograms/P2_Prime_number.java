package M1_SimplePrograms;

import java.util.*;
public class P2_Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i =2;i<=Math.sqrt(n);i++){
            if (n%2==0){
                System.out.println("The number is not prime");
                break;
            } else {
                System.out.println("The number is prime");
            }

        }

    }
}
