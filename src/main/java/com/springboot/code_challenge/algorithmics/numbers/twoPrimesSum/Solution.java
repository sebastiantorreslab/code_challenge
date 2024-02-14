package com.springboot.code_challenge.algorithmics.numbers.twoPrimesSum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    // find id a target number is the result

    public static void main(String[] args) {
        Integer[] nums = {2, 3, 5, 11, 13, 17, 19, 23, 29, 2, 3, 5, 10, 15,5};
        List<Integer> numbersList = new ArrayList<>(List.of(nums));
        System.out.println(sumTwoPrimeNumbers(numbersList,20));

    }

    public static  Set<Integer> sumTwoPrimeNumbers(List<Integer> numbers,Integer target){
        Set<Integer> sumNums = new HashSet<>(2);
        for (Integer num: numbers) {
            Integer n = target - num;
            if(numbers.contains(n) && isPrime(n) && isPrime(num)  && !num.equals(n)){
                sumNums.add(num);
                sumNums.add(n);
            }
        }
        return sumNums;
    }

    public static boolean isPrime(Integer number){
        boolean response = true;
        for(int i = 1; i < number;i++){
            if(number % i == 0 && i>1){
                response = false;
                return response;
            }

        }
        return response;
    }
}
