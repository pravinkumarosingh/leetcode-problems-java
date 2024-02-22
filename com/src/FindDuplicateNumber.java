package com.src;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {1,3,4,2,2};
        System.out.println(duplicate(numbers));

        int numbers2[] = {3,1,3,4,2};
        System.out.println(duplicate(numbers2));
    }

    private static int duplicate(int[] numbers){

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for( int number : numbers){
            if(map.containsKey(number)){
                count = map.get(number);
                map.put(number,++count);
            } else {
                map.put(number,1);
            }
        }

        for ( int number : numbers){
            if(map.get(number) > 1){
                return number;
            }
        }

        return 0;
    }
}
