//we assume that the input we get will contain n numbers each appearing only once
//example 426135 has all digits from 1 to 6 appearing once
//we assume the positions as follows:
// 426135 -> 654321(positions starting from last digit)
//now inverse in this case will have to changed in such a way
// on 1st position we have 5,so now we need to put 1 in 5th position
// on 2nd position we have 3, so now we need to put 2 in 3 position and so on

import java.util.*;
public class P8_Assumed_inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int inv =0;
        int original_position = 1;
        while(n!=0){
            int original_digit = n%10;
            int inverted_digit = original_position;
            int inverted_position = original_digit;
            // make changes to inv using ip and id
            inv+= inverted_digit*(int)Math.pow(10,inverted_position-1);

            //reducing the n from the end
            n /= 10;
            original_position++;

        }
        System.out.println(inv);
    }

}
