package com.springboot.code_challenge.algorithmics.numbers.majorityNumber;

import java.util.*;

public class Solution {

    /*
    * Given an array of size N, find the majority element. The majority element is the element that appears more than floor(N/2) times.
    * You may assume that the array is non-empty and the majority element always exist in the array.
    *
    * */

    /*
    *
    * objetive: i need to find the most frequency number in the list
    * 1.given an array or list
    * 2.when iterate over the array
    * 3.when validate if a number is >= nums.size/2
    *4. then return the majorityElement
    *
    * */

    public static void main(String[] args) {
        Integer[] A = {2,1,2};
        List<Integer> n = new ArrayList<>(List.of(A));
        System.out.println(majorityElement(n));

    }

    public static int majorityElement(List<Integer> numbers){
        Collections.sort(numbers);
        int comparison = (int) Math.floor((double) (numbers.size()) / 2);
        return numbers.get(comparison);
    }
}
