package M4_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P3_Bar_chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        for (int i =0;i<arr.length;i++){
            System.out.println("Enter Element "+(i+1)+" :");
            int element = sc.nextInt();
            arr[i] = element;
        }
       int max = Collections.max(Arrays.asList(arr));
       for (int floor = max; floor>=1;floor--){
           for (int k=0;k<arr.length;k++){
               if (arr[k]>=floor){
                   System.out.print("*\t");
               } else {
                   System.out.print("\t");
               }
           }
           System.out.println();
       }
    }
}
