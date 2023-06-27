package M2_Patterns;

import java.util.Scanner;
// formula based program -  iC(j+1) = iCj x (i-j)/j+1
public class P13_ncn_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // for outer loop this time starts from zero because the condition given had printing ncn from 0 to 5 for n=6
        for (int i =0;i<n;i++){
            int icj = 1;
            // we are printing i+1 numbers in each row
            for (int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                int icjp1 = icj * (i-j)/(j+1); //iC(j+1) formula
                icj = icjp1;
            }
            System.out.println();

        }
    }
}
