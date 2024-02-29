package com.src.easy.arrays;


import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] numbers){
        Map<Integer, Integer> map = new HashMap<>();

        for ( int i = 0 ; i < numbers.length ; i++){
            if (map.containsKey(numbers[i])){
                return true;
            } else {
                map.put(numbers[i], 1);
            }
        }
        return false;
    }
}
