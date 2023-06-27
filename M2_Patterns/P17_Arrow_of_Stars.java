package M2_Patterns;

import java.util.Scanner;

public class P17_Arrow_of_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int spaces = n/2;
        int stars = n/2;
        // upper rows logic
        for (int p=1;p<=stars;p++){
            //upper side spaces
            for (int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            //upper side stars
            for (int k=1;k<=p;k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        // middle row
        for (int i =1;i<=n;i++){
            System.out.print("*\t");
        }
        System.out.println();
        // lower rows logic
        for (int p=stars;p>=1;p--){
            //lower side spaces
            for (int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            //lower side stars
            for (int k=p;k>=1;k--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
