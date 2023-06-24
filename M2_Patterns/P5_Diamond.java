package M2_Patterns;

import java.util.Scanner;

public class P5_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd number: ");
        int n= sc.nextInt();
        int spaces = n/2;
        int stars = 1;
        // outer loop for rows
        for(int i=1;i<=n;i++) {
            // for spaces
            for (int j =1;j<=spaces;j++){
                System.out.print("\t");
            }
            // for stars
            for (int k=1;k<=stars;k++){
                System.out.print("*\t");
            }
            if (i<=n/2){
                spaces -=1;
                stars +=2;
            } else {
                stars-=2;
                spaces+=1;
            }
            System.out.println("");
        }
    }
}
