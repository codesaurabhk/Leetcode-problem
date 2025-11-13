// import java.util.*;

// public class twosum {

//     public static void main(String[] args) {
//         int[] arr = { 2, 4, 6, 8, 9 };
//         int target = 6;
        
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
//                     return;
//                 }
//             }
//         }

//         System.out.println("No pair found with sum " + target);
//     }

// }

import java.util.*;

public class twosum {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9 };
        int target = 6;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];

            if (map.containsKey(compliment)) {
                return new int[] {map.get(compliment),i};
            }
            
        }

        System.out.println("No pair found with sum " + target);
    }

} 