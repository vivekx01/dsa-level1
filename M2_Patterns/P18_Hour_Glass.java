package M2_Patterns;

import java.util.Scanner;

public class P18_Hour_Glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int spaces = 0;
        int stars = n;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            for (int k=1;k<=stars;k++){
                // condition to print hollow space in first half
                if (i>1 && i<=n/2 && k>1 && k<stars){
                    System.out.print("\t");
                } else{
                    System.out.print("*\t");
                }
            }
            if (i<=n/2){
                spaces++;
                stars-=2;
            } else{
                spaces--;
                stars+=2;
            }
            System.out.println();
        }
    }
}
