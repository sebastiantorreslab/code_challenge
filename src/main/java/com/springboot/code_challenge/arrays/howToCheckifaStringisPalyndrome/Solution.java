package com.springboot.code_challenge.arrays.howToCheckifaStringisPalyndrome;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isPalyndrome("oso"));

    }


    public static boolean isPalyndrome(String text){

        char[] sequence = text.toCharArray();
        int n = sequence.length - 1;
        boolean response = false;
        for (char c : sequence) {
            if (c == sequence[n]) {
                response = true;
            } else {
                response = false;
                return response;
            }
            n--;
        }

        return response;
    }



}
