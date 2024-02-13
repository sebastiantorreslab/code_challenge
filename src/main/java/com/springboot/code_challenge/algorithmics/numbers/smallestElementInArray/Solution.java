package com.springboot.code_challenge.algorithmics.numbers.smallestElementInArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    // need to compare if the next number is minor than a first chosen element in the entry array.

    public static void main(String[] args) {
        Integer[] nums = {10, 2, 3, 5, 10, 15,2};
        List<Integer> numbers = new ArrayList<>(List.of(nums));

        System.out.println(minorElement(numbers));

    }

    public static Integer minorElement(List<Integer> elements) {
        boolean constraint = !elements.isEmpty();
        Integer minor = elements.get(0);
        if (constraint) {
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i) < minor && elements.get(i) >=0) {
                    minor = elements.get(i);
                }
            }
        } else {
            System.out.println("empty list");
        }
        return minor;
    }
}