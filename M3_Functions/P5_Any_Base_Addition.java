package M3_Functions;

import java.util.Scanner;

public class P5_Any_Base_Addition {
    public static int getSum(int base, int n1, int n2){
        int return_value=0;
        int carry=0;
        int power =1;
        while (n1>0 || n2>0 || carry>0){
            int digit1 = n1%10;
            int digit2 = n2%10;
            n1/=10;
            n2/=10;
            int digit = digit1 + digit2 + carry;
            carry = digit/base;
            digit = digit%base;

            return_value+=digit*power;
            power = power*10;
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
        int result = getSum(base,n1,n2);
        System.out.println("The addition is : "+result);
    }
}
