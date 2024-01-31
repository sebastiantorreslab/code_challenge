package com.springboot.code_challenge.algorithmics.strings.letterFrecuquency;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        String text = "main";
        System.out.println(repeatedLetters(text));

    }

    public static Integer repeatedLetters(String entry) {
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
        // I need to verify the letters obtained in 'repeated'.
        // For each letter in 'repeated', validate to which index it corresponds.
        // Validate the smallest index.
        // Return it.

        List<Integer> positions = new ArrayList<>();
        repeated.forEach(e -> positions.add(entry.indexOf(e)));

        // in this wat the method will return the index related to the first letter that repeats in each string

        return positions.stream().min(Integer::compareTo).orElse(-1);
    }
}

