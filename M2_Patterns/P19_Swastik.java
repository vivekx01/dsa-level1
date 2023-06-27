package M2_Patterns;

import java.util.Scanner;

public class P19_Swastik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // for loop for outer row
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n;j++){
                //for first row
                if (i==1){
                    if (j==n||j<=n/2+1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i<=n/2) {
                    if(j==n||j==(n/2)+1){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i==n/2+1) {
                    System.out.print("*\t");
                } else if (i<n) {
                    if (j==1 || j==(n/2)+1){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if(i==n){
                    if(j==1 || j>=(n/2)+1){
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
