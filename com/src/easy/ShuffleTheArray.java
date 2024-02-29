package com.src.easy;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    private static int[] shuffle(int[] nums, int n){
        int temp[] = new int[nums.length];
        int counter = 0;
        for (int i = 0 ; i < nums.length/2 ; i++){
            temp[counter++] = nums[i];
            temp[counter++] = nums[n++];
        }
        return temp;
    }
}
