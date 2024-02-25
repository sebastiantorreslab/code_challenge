package com.springboot.code_challenge.algorithmics.numbers.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {


        fibSerie(15);


    }

    public static void fibSerie(Integer target) {
        Integer a;
        Integer b;

        List<Integer> fibNums = new ArrayList<>();

        for (int i = 0; i < target; i++) {
            if (i <= 1) {
                fibNums.add(i);
            } else {
                a = fibNums.get(i - 2);
                b = fibNums.get(i - 1);
                Integer c = a+b;
                fibNums.add(c);
            }
        }
        System.out.println(fibNums);

    }
}
