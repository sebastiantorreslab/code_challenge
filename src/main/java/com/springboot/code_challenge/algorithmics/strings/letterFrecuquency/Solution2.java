package com.springboot.code_challenge.algorithmics.strings.letterFrecuquency;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(repeatedLetters("solutionn").stream().findFirst().orElse(String.valueOf(-1)));
    }

    public static List<String> repeatedLetters(String entry) {
        char[] sequence = entry.toCharArray();

        Set<String> letters = new HashSet<>();
        List<String> repeated = new ArrayList<>();

        for (int i = 0; i < sequence.length; i++) {
            if (letters.contains(String.valueOf(sequence[i]))) {
                repeated.add(String.valueOf(sequence[i]));
            } else {
                letters.add(String.valueOf(sequence[i]));
            }
        }
        return repeated;
    }
}

