package com.springboot.code_challenge.algorithmics.numbers.repeatedNumber;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;


public class Solution {

/*
Given a read-only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
If there are multiple possible answers ( like in the sample case ), output any one, if there is no duplicate, output -1
*/

    public static void main(String[] args) {
        Integer[] n = {1,2,3,2,2,2,1,1,1,1,3,3};
        List<Integer> nums = new ArrayList<>(List.of(n));
        System.out.println(repeatedNumber(nums));
    }

    /*
     * check if A is a not empty list
     * iterate over A for validate any value of this array
     * create a map for take reference by a number
     * validate if num[i] is repeated with reference
     * if its repeated add count, if not add to the map
     * return one or another value
     */

    public static Set<Integer> repeatedNumber(final List<Integer> A) {
        boolean constraint = !A.isEmpty();
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();
        if(constraint){
            for (Integer num : A) {
                if(numbers.contains(num)){
                    repeated.add(num);
                }else{
                    numbers.add(num);
                }
            }
        }
        return  repeated;
    }
}
