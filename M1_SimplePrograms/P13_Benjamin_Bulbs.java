package M1_SimplePrograms;


import java.util.Scanner;

public class P13_Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of bulbs: ");
        int n = sc.nextInt();
        // in n bulbs after n toggles only bulbs at numbers which are perfect squares will remain on
        // this happens because perfect squares have 2n+1 factors and rest have only 2n factors
        // the bulb will eventually remain off for even factors and on for odd factors
        for (int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }

}
