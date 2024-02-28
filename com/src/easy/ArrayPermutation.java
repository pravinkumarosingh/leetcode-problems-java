package com.src.easy;

import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(arrayPermutation(nums)));
    }

    private static int[] arrayPermutation(int[] originalArray){
        int[] newArray = new int[originalArray.length];

        for (int i = 0 ; i < originalArray.length ; i++){
            newArray[i] = originalArray[originalArray[i]];
        }
        
        return newArray;
    }
}
