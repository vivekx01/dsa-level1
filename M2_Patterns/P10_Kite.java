package M2_Patterns;

import java.util.Scanner;

public class P10_Kite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int outer_space = n/2;
        int inner_space = -1;
        //outer loop for row
        for (int i=1;i<=n;i++){
//            System.out.println(outer_space+", "+inner_space);
            // outer space
            for (int j=1;j<=outer_space;j++){
                System.out.print("\t");
            }
            // star after outer_space
            System.out.print("*\t");
            // inner space
            for (int m=1;m<=inner_space;m++){
                System.out.print("\t");
            }
            // star after inner_space which does not appear in first or last row
            if (i>1 && i<n){
                System.out.print("*\t");
            }
            System.out.println();
            if (i<=n/2){
                outer_space-=1;
                inner_space+=2;
            } else {
                outer_space+=1;
                inner_space-=2;
            }
        }
    }
}
