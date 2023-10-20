package M6_Stack;

import java.util.Scanner;
import java.util.Stack;

public class P4_Stock_span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of data: ");
        int n = sc.nextInt();
        int[] data = new int[n];
        System.out.println("Enter Elements: ");
        for (int i=0;i<n;i++){
            int element = sc.nextInt();
            data[i] =element;
        }
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int span =1;
//        int span[] = new int[n];
//        Stack<Integer> st = new Stack<>();
//        st.push(0);
//        span[0]=1;
//        for (int i=1;i<price.length;i++){
//            while (st.size()>0 && price[i]>price[st.peek()]){
//                st.pop();
//            }
//            if (st.size()==0){
//                span[i]=i+1;
//            } else {
//                span[i] = i-st.peek();
//            }
//            st.push(i);
//        }

    }
}
