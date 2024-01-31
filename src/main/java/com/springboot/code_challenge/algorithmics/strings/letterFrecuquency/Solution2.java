package com.springboot.code_challenge.algorithmics.strings.letterFrecuquency;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) {
        String text = "bogota";
        String value = repeatedLetters(text).get(0);
        System.out.println(repeatedLetters(text));
        System.out.println(new StringBuilder(text).indexOf(value));
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
        return repeated.stream().sorted().collect(Collectors.toList());
    }
}

