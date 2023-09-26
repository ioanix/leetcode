package com.ioana;

// Given two strings needle and haystack,
// return the index of the first occurrence of
// needle in haystack, or -1 if needle is not part of haystack.

public class Main {

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // Edge case: if the needle is an empty string, return 0.
        if(needleLength == 0) {
            return 0;
        }

        for (int i = 0; i < haystackLength - needleLength; i++) {
            // Check if the substring of haystack starting at index i
            // and of the same length as the needle is equal to the needle.
            if(haystack.substring(i, i + needleLength).equals(needle)) {
                return i;   // needle found, return the index
            }
        }

        return  -1;  // Needle not found in haystack.
    }
}
