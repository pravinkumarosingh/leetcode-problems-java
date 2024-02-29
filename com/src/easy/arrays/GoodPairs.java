package com.src.easy.arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(goodPairs(nums));
    }

    private static int goodPairs(int[] nums){
        int counter = 0;
        for (int i = 0 ; i < nums.length ; i++){
            for (int j = 0 ; j < nums.length ; j++){
                if( i < j && nums[i] == nums[j]){
                    ++counter;
                }
            }
        }
        return counter;
    }
}
