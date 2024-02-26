package com.src.easy;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(concatenateArray(nums)));
    }

    private static int[] concatenateArray(int[] originalArray){
        int[] newArray = new int[originalArray.length * 2];

        int count = 0;

        for(int i = 0 ; i < originalArray.length ; i++){
            newArray[count++] = originalArray[i];
        }

        for ( int i = 0 ; i < originalArray.length ; i++){
            newArray[count++] = originalArray[i];
        }

        return newArray;
    }
}
