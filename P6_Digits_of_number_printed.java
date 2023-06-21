import java.util.*;
public class P6_Digits_of_number_printed {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int digits= 0;
        int temp =n;
        while(temp!=0){
            temp/=10;
            digits++;
        }
        int divisor = (int)Math.pow(10,digits-1);
        while(divisor!=0){
            int quotient = n/divisor;
            System.out.println(quotient);
            n%=divisor;
            divisor/=10;
        }

    }
}
