package com.springboot.code_challenge.algorithmics.strings.letterFrecuquency;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(repeatedLetters("solutionn"));
    }

    public static Set<String> repeatedLetters(String entry) {
        char[] sequence = entry.toCharArray();

        Set<String> letters = new HashSet<>();
        Set<String> repeated = new HashSet<>();

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

