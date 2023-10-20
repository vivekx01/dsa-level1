package M4_Arrays;
import java.util.ArrayList;
public class sumarraytest {
    public static void main(String[] args) {
        // Sample ArrayList with some initial elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Element to be inserted at the 0th position
        int newElement = 0;

        // Insert the new element at the 0th position of the ArrayList
        arrayList.add(0, newElement);

        // Print the updated ArrayList
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
