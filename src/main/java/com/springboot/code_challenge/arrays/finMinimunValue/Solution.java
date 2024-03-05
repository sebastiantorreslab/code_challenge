package com.springboot.code_challenge.arrays.finMinimunValue;

public class Solution {

    // fin the minimum value in a given array

    public static void main(String[] args) {

        int[] n = {10,2,4,5,8,7,5,6,6,3,2,1,54,6,6,5,0};

        System.out.println("minimum value: " + findMinimumValueInArray(n));

    }


    public static int findMinimumValueInArray(int[] numbers){
        int min = numbers[0];

        for(int i =0; i < numbers.length; i++)
            if(min > numbers[i]){
                min = numbers[i];
            }

        return min;
    }




}
