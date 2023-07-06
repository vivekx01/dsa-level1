package M5_Strings;

import java.util.Scanner;

public class P3_String_compression_2 {
    public static String compression2(String str){
        String s = String.valueOf(str.charAt(0));
        int count = 1;
        for (int i=1;i<str.length();i++){
            char current = str.charAt(i);
            char previous = str.charAt(i-1);
            if (current==previous){
                count++;
            } else {
                if (count>1){
                    s+=count;
                    count=1;
                }
                s+=current;
            }
        }
        if (count>1){
            s+=count;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression2(str));
    }
}
