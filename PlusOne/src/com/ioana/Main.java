package com.ioana;

import java.util.Arrays;

public class Main {

    //You are given a large integer represented as an integer array digits,
    // where each digits[i] is the ith digit of the integer. The digits are ordered
    // from most significant to least significant in left-to-right order. The large
    // integer does not contain any leading 0's.
    //
    //Increment the large integer by one and return the resulting array of digits.

    public static void main(String[] args) {

        int[] digits = {1, 2, 3};

        int[] ints = plusOne(digits);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] plusOne(int[] digits) {

//        int number = 0;
//        int exponent = digits.length - 1;
//
//        for (int digit : digits) {
//            number += digit * Math.pow(10, exponent);
//            exponent -= 1;
//        }
//
//        number += 1;
//
//        String newString = Integer.toString(number);
//
//        char[] chars = newString.toCharArray();
//
//        int[] newDigits = new int[chars.length];
//
//        for (int i = 0; i < chars.length; i++) {
//            newDigits[i] = Integer.parseInt(String.valueOf(chars[i]));
//        }
//
//        return newDigits;


        // This was my original solution but it does not pass all the test cases on leetcode so I agot another solution
        // from chatgpt that works in all cases and has a time and space complexity of O(n);

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {

            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}
