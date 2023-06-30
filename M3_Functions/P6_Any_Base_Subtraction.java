package M3_Functions;

import java.util.Scanner;

public class P6_Any_Base_Subtraction {
    // n2 input should always be greater than n1
    public static int getDifference(int base, int n1, int n2){
        int return_value=0;
        int borrow=0;
        int power =1;
        while (n2>0){
            int digit1 = n1%10;
            int digit2 = n2%10;
            n1/=10;
            n2/=10;

            int digit = 0;
            digit2 = digit2+borrow;
            if (digit2>=digit1){
                borrow=0;
                digit=digit2-digit1;
            } else{
                borrow = -1;
                digit = digit2+base-digit1;
            }
            //logic for creating the return value or the answer
            return_value+=digit*power;
            power = power * 10;
        }
        return return_value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the base for addition: ");
        int base = sc.nextInt();
        int result = getDifference(base,n1,n2);
        System.out.println("The subtraction is : "+result);
    }
}
