package com.springboot.code_challenge.algorithmics.symbols.balanceSymbols;

import java.util.Arrays;
import java.util.Stack;

public class Solution {

    /*
    * Given a string A consisting only of '(' and ')'.
       You need to find whether parantheses in A is balanced or not ,if it is balanced then return 1 else return 0.
    *
    * */

    static String A = "(()())";


    public static void main(String[] args) {
        System.out.println(balancedSymbols(A));

    }

    public static Integer balancedSymbols(String entry){
        String[] sequence = entry.split("[^)|(]*");
        System.out.println(Arrays.toString(sequence));
        Stack check = new Stack<>();
        for(String c:sequence){
            try{
                if(c.equals("(")){
                    check.push(c);

                }else if(c.equals(")")){
                    check.pop();
                }

            }catch (Exception e){
                return 0;
            }

        }
        return check.isEmpty() ? 1: 0;
    }

}
