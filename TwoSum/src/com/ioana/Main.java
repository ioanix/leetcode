package com.ioana;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Given an array of integers nums and an integer target, return indices
        // of the two numbers such that they add up to target.
        // You may assume that each input would have exactly one solution, and you may not use the same element twice.
        //You can return the answer in any order.

        int[] nums = new int[] {1, 2, 4, 5};

        int[] twoSum = twoSum(nums, 6);

        for(int number : twoSum) {

            System.out.println(number);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(!numbers.containsKey(complement)) {
                numbers.put(nums[i], i);
            } else {
                return new int[] {numbers.get(complement), i};
            }
        }

        return new int[] {};
    }
}
