package M6_Stack;
//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

import java.util.*;
import java.lang.*;
import java.io.*;

class P3_Next_greater_element_on_right {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[n];
            for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
            long[] res = new Solution().nextLargerElement(arr, n);
            for (int i = 0; i < n; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long nge[] = new long[arr.length];
        Stack<Long> st = new Stack<>();
        //pushing last element into stack and -1 as its value
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        //running loop from second last element of input array
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            //if stack becomes empty put -1 as answer in result array
            if (st.size()==0){
                nge[i]=-1;
            }
            // or else insert the peek element from stack which is the answer
            else {
                nge[i]=st.peek();
            }
            //finally push the element in stack for further rounds
            st.push(arr[i]);
        }
        return nge;
    }
}
