import java.util.*;
public class P10_GCD_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter number 2:");
        int n2=sc.nextInt();
        int on1 = n1;
        int on2 = n2;
        while(n1%n2>0){
            //we keep dividing the numbers until the remainder for n1 and n2 becomes zero, the last remainder is gcd
            int rem = n1%n2; //getting the remainder
            n1=n2; //making old n2 as the new dividend
            n2=rem; //making remainder as the new divisor
        }
        //gcd is also called hcf
        int gcd = n2;
        //formula for finding lcm using gcd
        int lcm = (on1*on2)/gcd;
        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);
    }
}
