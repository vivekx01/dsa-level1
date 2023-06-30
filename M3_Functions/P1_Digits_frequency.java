package M3_Functions;

import java.util.Scanner;
public class P1_Digits_frequency {
    public static int digifreq(int n, int search){
        int count=0;
        for (int i=1;i<=n;i++){
            int digit = n%10;
            if(digit==search){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter the digit to search: ");
        int search = sc.nextInt();
        int result = digifreq(n,search);
        System.out.println(result);
    }
}
