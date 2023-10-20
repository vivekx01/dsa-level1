package M1_SimplePrograms;

import java.util.*;
public class P2_Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("Not prime");
        } else {
            System.out.println("prime");
        }

    }
}
