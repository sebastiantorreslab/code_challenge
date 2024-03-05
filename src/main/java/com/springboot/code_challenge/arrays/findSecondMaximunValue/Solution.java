package com.springboot.code_challenge.arrays.findSecondMaximunValue;

import java.lang.reflect.Array;

public class Solution {

    // find the second maximum value in a given array


    public static void main(String[] args) {

        int[] nums = {1,2,8,4,5,13,25,42,6,89,75,4,56,7,99};

        System.out.println("second maximum value: " + findSecondMaximumValue(nums));

    }


    public static int findSecondMaximumValue(int[] numbers) {
        int max = numbers[0];
        int max2 = 0;
        int temp;

        for (int number : numbers) {
            if (number > max) {
                temp = max;
                max = number;
                max2 = temp;
            }
            if (number > max2 && number < max) {
                max2 = number;
            }
        }

        return max2;
    }



}
