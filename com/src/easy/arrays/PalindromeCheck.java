package com.src.easy.arrays;

import java.util.ArrayList;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-434));
    }

    private static boolean isPalindrome(int originalNumber){

        int reverseNumber = 0;
        int temp = originalNumber;
        int digit;

        if(originalNumber < 0){
            return false;
        }

        while(temp != 0){
            digit = temp%10;
            reverseNumber = (reverseNumber * 10) + digit;
            temp = temp / 10;
        }

        if (reverseNumber == originalNumber){
            return true;
        }

        return false;
    }
}
