package M1_SimplePrograms;

import java.util.*;
public class P9_Rotate_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of rotations: ");
        int k = sc.nextInt();
        int digits = 0;
        int digit_count = n;
        int temp=n;
        //finding out the number of digits
        while(digit_count!=0){
            digit_count/=10;
            digits++;
        }
        //if the rotation size is negative the no of digits is added to the k
        // in 27391 if k=-1 then new k=-1+5=4 so we need to rotate from end by 4 digits
        if(k<0){
            k+=digits;
        }
        //rotating the number by k positions
        for (int i=1;i<=k;i++){
            int extracted_digit=temp%10;
            temp/=10;
            temp+= extracted_digit*(int)Math.pow(10,digits-1);
        }
        System.out.println(temp);



    }
}
