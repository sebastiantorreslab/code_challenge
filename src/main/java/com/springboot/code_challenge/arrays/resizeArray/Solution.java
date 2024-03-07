package com.springboot.code_challenge.arrays.resizeArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] n = new int[5];

        n[0] = 5;
        n[1] = 2;
        n[2] = 3;


        System.out.println();
        System.out.println("length of array is " + n.length);
        System.out.println();

        System.out.println(Arrays.toString(n));
        System.out.println();

        System.out.println(Arrays.toString(resizeArray(10, n)));
        System.out.println();

        System.out.println(Arrays.toString(resizeArray(10, n)));
        System.out.println();

        System.out.println("new length of array is " + resizeArray(10, n).length);
        System.out.println();




    }

    public static int[] resizeArray(int newIndex, int[] nums) {
        int[] nResize = new int[newIndex];

        if (nums != null && nums.length < newIndex) {
            for (int i = 0; i < nums.length; i++) {
                nResize[i] = nums[i];
            }

            nums = nResize;
        }
        return  nums;
    }


}
