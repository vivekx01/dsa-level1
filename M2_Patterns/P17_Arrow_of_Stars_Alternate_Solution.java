package M2_Patterns;

import java.util.Scanner;

public class P17_Arrow_of_Stars_Alternate_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int spaces = n/2;
        int stars = 1;
        // outer loop for row
        for (int i=1;i<=n;i++){
            for (int j=1;j<=spaces;j++){
                if (i==(n/2)+1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int k=1;k<=stars;k++){
                System.out.print("*\t");
            }
            if (i<=n/2){
                stars++;
            } else {
                stars--;
            }

            System.out.println();
        }
    }
}
