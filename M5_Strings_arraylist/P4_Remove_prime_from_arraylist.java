package M5_Strings_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P4_Remove_prime_from_arraylist {
    public static boolean isPrime(int num){
        for (int i =2;i*i<=num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void solution(ArrayList<Integer> a1){
        for (int i=a1.size()-1;i>=0;i--){
            int val = a1.get(i);
            if (isPrime(val)==true){
                a1.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i=1;i<=n;i++){
            a1.add(sc.nextInt());
        }
        solution(a1);
        System.out.println(a1);
    }
}
