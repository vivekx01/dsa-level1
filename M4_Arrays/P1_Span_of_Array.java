package M4_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1_Span_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        for (int i =0;i<size;i++){
            System.out.println("Enter Element "+(i+1)+": ");
            int element = sc.nextInt();
            arr[i]=element;
        }
        int result = Collections.max(Arrays.asList(arr)) - Collections.min(Arrays.asList(arr));
        System.out.println(result);
    }
}
