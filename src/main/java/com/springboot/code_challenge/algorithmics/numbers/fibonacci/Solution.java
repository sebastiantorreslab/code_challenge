package com.springboot.code_challenge.algorithmics.numbers.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public static void fibSerie(Integer target) {
        Integer num;
        Integer num1;
        Integer fib;
        List<Integer> fibNums = new ArrayList<>();
        for (int i = 0; i < target; i++) {
            if (i <= 1) {
                num = i;
                fibNums.add(num);
            } else  {
                num = i - 1;
                num1 = i;
                fib = num + num1;
                fibNums.add(fib);
            }
        }
    }
}
