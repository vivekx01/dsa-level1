package M1_SimplePrograms;

import java.util.*;
public class P1_Zpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stars: ");
        int n = sc.nextInt();
        int count =n-1;
        //first line
        for (int i=0;i<=n;i++){
            System.out.print("*");
        }
        System.out.println("");
        //for middle lines
        for (int i = 1;i<=n;i++){
            for (int j =0;j<=count;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

            count --;
        }
        //for last line
        for (int i=0;i<=n;i++){
            System.out.print("*");
        }
    }
}
