import java.util.*;

public class Containduplicate2 {
    public static boolean findDuplicate(int nums[], int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (j - i) <= k) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 8, 4, 5, 9, 2 };
        boolean duplicate = findDuplicate(nums, 5);
        System.out.print("duplicate no " + duplicate);
    }

}