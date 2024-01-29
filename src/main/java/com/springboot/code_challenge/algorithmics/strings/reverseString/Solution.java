package com.springboot.code_challenge.algorithmics.strings.reverseString;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseString("sebastian"));

    }

    public static StringBuilder reverseString(String text){
        StringBuilder reversed = new StringBuilder(text.length());
        for(int i = text.length()-1;i>=0;i--){
            reversed.append(text.charAt(i));
        }
        return reversed;
    }
}
