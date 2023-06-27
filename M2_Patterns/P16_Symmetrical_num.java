package M2_Patterns;

import java.util.Scanner;

public class P16_Symmetrical_num {
    // there are total 2n-3 spaces out of 2n-1 columns
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int spaces = (2*n)-3;
        int val = 1;
        for (int i =1;i<=n;i++){
            //left side numbers
            for (int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            //spaces
            for (int k=1;k<=spaces;k++){
                System.out.print("\t");
            }
            //right side numbers
            if (i!=n){
                for (int m=i;m>=1;m--){
                    System.out.print(m+"\t");
                }
            } else {
                for (int m=(i-1);m>=1;m--){
                    System.out.print(m+"\t");
                }
            }
            val++;
            spaces-=2;
            System.out.println();
        }
    }
}
