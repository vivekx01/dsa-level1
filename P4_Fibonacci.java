import java.util.*;
public class P4_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        if (n<=0){
            System.out.println("Please enter a number greater than zero");
        }
        if (n==1){
            System.out.println(n1);
        }
        if (n==2){
            System.out.print(n1+" "+n2);
        }
        for (int i=0;i<=n;i++){
            System.out.print(n1+" ");
            int c = n1+n2;
            n1 = n2;
            n2 = c;
        }

    }
}
