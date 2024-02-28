package com.springboot.code_challenge.arrays.evenAndOddNumbers;

import java.util.Arrays;

public class Solution {

    static int[] numbers = {4, 5, 6, 8, 7, 4, 5, 6};

    public static void main(String[] args) {

        System.out.println("------- removing even numbers-------------\n");
        System.out.println(Arrays.toString(removeEvenNumbers(numbers)));
        System.out.println();
        System.out.println("------- removing odd numbers-------------\n");
        System.out.println(Arrays.toString(removeOddNumbers(numbers)));
        System.out.println();

    }

    public static int[] removeEvenNumbers(int[] nums) {
        int numberCount = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                numberCount++;
            }

        }

        int[] oddNumbers = new int[numberCount];
        int counter = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddNumbers[counter++] = num;
            }

        }
        return oddNumbers;
    }
    public static int[] removeOddNumbers(int[] nums) {
        int numberCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                numberCount++;
            }

        }

        int[] evenNumbers = new int[numberCount];
        int counter = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNumbers[counter++] = num;
            }

        }
        return evenNumbers;
    }
}
