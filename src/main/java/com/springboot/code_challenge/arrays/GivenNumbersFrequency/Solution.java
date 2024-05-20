package com.springboot.code_challenge.arrays.GivenNumbersFrequency;


import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;

public class Solution {


    /*
    Given an arrays of integers, return the even number with more frequencies and if there are more than one even number return the smallest one
     Example
       [1, 2,2,4,6,4] 
            Output :2
    * */

    public static void main(String[] args) {

        System.out.println(getSmallestNumberByFrequency(1, 2, 2, 4, 6, 4,4));

    }


    public static Integer getSmallestNumberByFrequency(int... nums) {

        Map<Integer, Integer> frequencies = getIntegerMap(nums);

        Integer condition1 = frequencies.values().stream().max(Comparator.naturalOrder()).orElse(null);
        Integer condition2 = frequencies.keySet().stream().min(Comparator.naturalOrder()).orElse(null);

        for(Map.Entry<Integer,Integer> entry : frequencies.entrySet()){

            if(entry.getValue().equals(condition1)){
                return entry.getKey();
            }
        }
        return 0;

    }

    private static Map<Integer, Integer> getIntegerMap(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int counter = 0;
            for(int j = 0; j < nums.length; j++) {
                boolean condition = nums[i] == nums[j] && nums[i] % 2 == 0;
                if (condition) {
                    ++counter;
                }
                if (counter > 1) {
                    frequencies.put(nums[i], counter);
                }

            }

        }
        return frequencies;
    }

};



