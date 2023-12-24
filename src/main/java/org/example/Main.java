package org.example;

import java.util.Arrays;

import static java.util.Arrays.sort;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{3,2,2,3}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = new int[]{2,2,3,3};  // The expected answer with correct length.
        // It is sorted with no values equaling val.

        int k = removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

    }

    public static int removeElement(int[] nums, int val) {

    }
}
