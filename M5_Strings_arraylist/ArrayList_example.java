package M5_Strings_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+ " -> " + list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list+ " -> "+list.size());

        list.add(1,1000);
        System.out.println(list+" -> "+list.size());

        int val = list.get(1);
        System.out.println(val);

        list.set(1,2000);
        System.out.println(list+" -> "+list.size());

        list.remove(1);
        System.out.println(list+" -> "+list.size());

        ArrayList<String> l2= new ArrayList<>();
        l2.add("hello");
        l2.add("bello");
        l2.add("sello");
        System.out.println(l2+" -> "+l2.size());

//        for (int i=0; i<list.size();i++){
//            int value = list.get(i);
//            System.out.println(value);
//        }
        for (int value:list){
            System.out.println(value);
        }
    }
}
