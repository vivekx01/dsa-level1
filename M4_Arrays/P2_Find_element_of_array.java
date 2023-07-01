package M4_Arrays;

import java.util.Scanner;

public class P2_Find_element_of_array {
    public static void search(int element,int[] arr){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==element){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Element was found!");
        } else {
            System.out.println("Element not found!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            System.out.println("Enter Element "+(i+1)+": ");
            int element = sc.nextInt();
            arr[i]=element;
        }
        System.out.println("Enter the element to be searched: ");
        int element = sc.nextInt();
        search(element,arr);
    }
}
