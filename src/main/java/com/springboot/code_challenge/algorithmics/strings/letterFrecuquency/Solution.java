package com.springboot.code_challenge.algorithmics.strings.letterFrecuquency;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(letterFrequency("solucin"));

    }


    public static Set<Integer>  letterFrequency(String entry) {
        char[] sequence = entry.toCharArray();
        Set<Integer> repeated = new HashSet<>();
        repeated.clear();
        for (int j = 0; j < sequence.length; j++) {
            int counter = 0;
            for (int i = 0; i < sequence.length; i++) {
                boolean condition = sequence[j] == sequence[i];
                if (condition) {
                    ++counter;
                }
            }
            if (counter > 1) {
                repeated.add(j);
            }
        }
        if(repeated.isEmpty())  repeated.add(-1);

        return repeated;
    }
}













