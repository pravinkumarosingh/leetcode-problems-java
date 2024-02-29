package com.src.easy.arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 4;

        System.out.println(searchPosition(nums,target));
    }

    private static int searchPosition(int[] numbers, int target){

        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] == target){
                return i;
            } else if (target < numbers[i]){
                return i;
            }
        }
        return numbers.length;
    }
}
