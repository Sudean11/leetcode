package mwa.leetcode;

import java.util.Arrays;

public class Palindrome {
    Palindrome(){
        boolean isPalindrome = isPalindrome(121);
        System.out.println(isPalindrome);
    }
    public boolean isPalindrome(int x) {
        int originalValue = x;
        int reversedValue = 0;
        while(originalValue > 0){
            reversedValue = reversedValue * 10 + (originalValue % 10);
            originalValue  = originalValue/10;
        }
        return x == reversedValue;
    }
    public static void main(String[] args) {
        new Palindrome();
    }
}
