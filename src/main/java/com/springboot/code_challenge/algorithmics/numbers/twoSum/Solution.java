package com.springboot.code_challenge.algorithmics.numbers.twoSum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    /*

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    * */

    /*
    * given a target
    * given an array of number
    * when need to check if any two numbers of the list sum the target number
    * when one number added to other equals target so i have to do some with that values
    * ¿ what can i do whit 2 values?
    * must be checked the number is not going to be equals to itself
    * op1: add to another list
    * op2: return it like a integer
    * */

    /*
    * operation: target = num1 + num2
    * num1 = target - num2
    * thats could be a posible solution
    *
    * after a get two numbers i return it.
    *
    *
    * */

    public static void main(String[] args) {
        Integer[] n = {3,2,4};

        List<Integer> nums = new ArrayList<>(List.of(n));
        Integer target = 6;
        System.out.println(nums.indexOf(findValuesByTarget(nums,target).get(0)));
        System.out.println(nums.indexOf(findValuesByTarget(nums,target).get(1)));
    }

    public static List<Integer> findValuesByTarget(List<Integer> list, Integer target){
        Set<Integer> numbers = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer n:list){
            numbers.add(n);
            int number1 = target - n;
            if(number1 > 0){
                if(numbers.contains(number1) && number1 != n){
                    result.add(n);
                    result.add(number1);
                };
            }
        }
        /*
        operations needed
        we need an for loop for iterate the array
        once we get a substraction of a number
        that means we can check if the other number is on that list
        so we have 2 numbers that sum a target number
         */

        return result;
    }


}
