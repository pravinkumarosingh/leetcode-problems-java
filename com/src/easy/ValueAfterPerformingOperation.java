package com.src.easy;

public class ValueAfterPerformingOperation {
    public static void main(String[] args) {
        String[] array = {"++X","++X","X++"};
        System.out.println(valueAfterPerformingOperation(array));
    }

    private static int valueAfterPerformingOperation(String[] array){
        int counter = 0;
        for(String arr : array){
            if(arr.equals("X++") || arr.equals("++X")){
                counter++;
            } else {
                counter--;
            }
        }
        return counter;
    }
}
