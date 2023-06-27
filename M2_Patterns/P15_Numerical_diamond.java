package M2_Patterns;

import java.util.Scanner;

public class P15_Numerical_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int spaces = n/2;
        int stars = 1;
        int count =0;
        // outer loop for rows
        for (int i=1;i<=n;i++){
            // for spaces
            for (int j =1;j<=spaces;j++){
                System.out.print("\t");
            }
            // making count equal to the row number for printing in loop
            count = i;
            for (int k =1;k<=stars;k++){
                System.out.print(count+"\t");
                // if the k less than half of no of stars we want the count to increase else decrease
                if (k<=stars/2){
                    count++;
                } else {
                    count--;
                }
            }
            // if the number of rows is less than half of input then spaces decrease stars increase or vice versa
            if (i<=n/2){
                spaces--;
                stars+=2;
            } else {
                spaces++;
                stars-=2;
            }
            System.out.println();
        }

    }
}
