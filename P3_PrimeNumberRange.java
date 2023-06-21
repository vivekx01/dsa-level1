import java.util.*;
public class P3_PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lower bound: ");
        int lb = sc.nextInt();
        System.out.println("Enter Upper bound: ");
        int ub = sc.nextInt();
        for(int n = lb;n<= ub;n++){
            int count = 0;
            //try to divide n and increase count
            for(int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(n);
            }
        }
    }
}
