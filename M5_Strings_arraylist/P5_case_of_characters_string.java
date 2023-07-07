package M5_Strings_arraylist;

import java.util.Scanner;

public class P5_case_of_characters_string {
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z'){
                char uppercase = (char)('A' + ch - 'a'); //changing to uppercase and typecasting to char
                sb.setCharAt(i,uppercase);
            } else if (ch>='A' && ch<='Z') {
                char lowercase = (char)('a'+ch - 'A'); //changing to lowercase and typecasting to char
                sb.setCharAt(i,lowercase);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));
    }
}
