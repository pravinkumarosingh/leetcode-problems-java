package com.src.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        System.out.println(getIndices(words,x));
    }

    private static List<Integer> getIndices(String[] words, char x){
        List<Integer> indices = new ArrayList<>();
        for (int i = 0 ; i < words.length ; i++){
            if(words[i].indexOf(x) >= 0){
                indices.add(i);
            }
    }
        return indices;
    }
}
