package M6_Stack;

import java.util.Stack;

public class Stack_example {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st+" -> "+st.size());
        System.out.println("Top/peek: "+st.peek());
        st.pop();
        System.out.println(st+" -> "+st.size());
        System.out.println("Top/peek: "+st.peek());
    }
}
