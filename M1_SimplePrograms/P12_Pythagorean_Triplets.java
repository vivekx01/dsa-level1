package M1_SimplePrograms;
import java.util.*;
public class P12_Pythagorean_Triplets {
    //Pythagorean triplets have the property : Hypotenuse^2 = Base^2 + Height^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int intermediate = Math.max(a,b);
        int max = Math.max(intermediate,c);
        if(max==a){
            boolean  flag = (b*b+c*c)==(a*a);
            System.out.println(flag);
        } else if (max==b) {
            boolean  flag = (a*a+c*c)==(b*b);
            System.out.println(flag);
        } else {
            boolean  flag = (a*a+b*b)==(c*c);
            System.out.println(flag);
        }

    }
}
