package M2_Patterns;

import java.util.Scanner;

public class P6_Hollow_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int stars = (n/2)+1;
        int spaces = 1;
        //for outer loop
        for (int i=1;i<=n;i++){
            //for stars part 1
            for (int j = 1;j<=stars;j++){
                System.out.print("*\t");
            }
            //for spaces
            for (int k=1;k<=spaces;k++){
                System.out.print("\t");
            }
            //for stars part 2
            for (int m = 1;m<=stars;m++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                stars-=1;
                spaces+=2;
            } else{
                stars+=1;
                spaces-=2;
            }
            System.out.println();

        }


    }
}
