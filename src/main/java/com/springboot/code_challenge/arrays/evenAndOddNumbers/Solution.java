package com.springboot.code_challenge.arrays.evenAndOddNumbers;

public class Solution {

    int[] numbers = {4, 5, 6, 8, 7, 4, 5, 6};

    public static void main(String[] args) {

    }

    public static int[] removeOddNumbers(int[] nums) {
        int numberCount = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                numberCount++;

            }
            int[] oddNumbers = new int[numberCount];
            for (int i = 0; i < oddNumbers.length; i++) {
                if (nums[i] % 2 != 0) {
                    oddNumbers[i] = nums[i];
                }
            }
            return oddNumbers;
        }
    }
}
