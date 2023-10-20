package M6_Stack;

import java.util.Stack;

public class P5_Largest_area_histogram {
    public static void main(String[] args) {
        int arr[] = {6,2,5,4,5,1,6};
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i=0;i<arr.length;i++){
            while(st.isEmpty() || st.peek()<arr[i]){
                st.push(arr[i]);
            }
            int area = arr[i]*st.size();
            if (max<area){
                max = area;
            }
        }
        System.out.println(max);
    }
}
