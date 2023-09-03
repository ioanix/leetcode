package com.ioana;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(romanToInt("MDCCCXLVIII"));
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();

        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int currentValue = romanValues.get(s.charAt(i));

            if(i < s.length() - 1) {
                int nextValue = romanValues.get(s.charAt(i + 1));
                if(currentValue < nextValue) {
                    result += nextValue - currentValue;

                    i++;
                    continue;
                }
            }

            result += currentValue;

        }

        return result;
    }
}
