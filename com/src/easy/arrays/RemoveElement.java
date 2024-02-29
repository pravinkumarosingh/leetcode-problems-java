package com.src.easy.arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {3,2,2,3};
        int val = 3;
        System.out.println(numberOfElements(array,val));

        int[] array2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(numberOfElements(array2, val2));
    }

    private static int numberOfElements(int[] nums, int val){
        int[] temp = new int[nums.length];
        int count = 0;

        for (int i = 0 ; i < nums.length; i++){
            if(nums[i] != val){
                temp[count++] = nums[i];
            }
        }

        for (int i = 0 ; i < temp.length ; i++){
            nums[i] = temp[i];
        }

        return count;
    }
}
