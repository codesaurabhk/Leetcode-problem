import java.util.*;

public class hasmap {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 5, 6, 7, 8 };
        HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(5);
        // System.out.println("Hashset no is "+set);
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        for (int num : set) {
            System.out.println(num + " ni");
        }

        // System.out.println("sat hai " + set);
    }
}
