package org.example;

import java.util.Arrays;

import static java.util.Arrays.sort;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = new int[]{0,1,4,0,3,101,101,101};  // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

    }

    public static int removeElement(int[] nums, int val) {
        int occurrences = 0;
        for (int i = 0; i < nums.length; i++) {
            if(val == nums[i]){
                nums[i] = 101;
                occurrences++;
            }
        }
        Arrays.sort(nums);
        return nums.length - occurrences;
    }
}
