package M5_Strings_arraylist;

import java.util.Scanner;

public class P2_String_compression_1 {
    public static String compression1(String str){
        String s = String.valueOf(str.charAt(0));
        for (int i =1;i<str.length();i++){
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            if (current!=prev){
                s+=current;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression1(str));

        //my approach
//        StringBuilder sb = new StringBuilder("aabbccccccc");
//        char c = sb.charAt(0);
//        int pointer = 1;
//        StringBuilder result = new StringBuilder();
//        result.append(c);
//        while(pointer<sb.length()){
//            char compare = sb.charAt(pointer);
//            if (c!=compare){
//                result.append(compare);
//                c = compare;
//            }
//            pointer++;
//        }
//        System.out.println(result);

    }
}
