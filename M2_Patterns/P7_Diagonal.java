package M2_Patterns;

import java.util.Scanner;

public class P7_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // outer loop for rows
        for(int i =1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==j){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
