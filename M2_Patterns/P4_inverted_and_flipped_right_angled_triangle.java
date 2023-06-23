package M2_Patterns;

import java.util.Scanner;

public class P4_inverted_and_flipped_right_angled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int stars = n;
        int spaces= 0;
        //outer loop for every row
        for (int i=0;i<n;i++){
            //for spaces
            for (int k=0;k<spaces;k++){
                System.out.print("\t");
            }
            //for stars
            for(int j=1;j<=stars;j++) {
                System.out.print("*\t");
            }
            stars--;
            spaces++;
            System.out.println();
        }

    }
}
