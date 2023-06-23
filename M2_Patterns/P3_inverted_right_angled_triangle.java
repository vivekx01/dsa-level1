package M2_Patterns;

import java.util.Scanner;

public class P3_inverted_right_angled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int spaces = n-1;
        int stars = 1;
        for (int i=1;i<=n;i++){
            //printing spaces
            for (int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            //printing stars
            for (int k=1;k<=stars;k++) {
                System.out.print("*\t");
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }
}
