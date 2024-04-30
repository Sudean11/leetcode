package mwa.leetcode;

import java.util.Arrays;

public class Palindrome {
    Palindrome(){
        boolean isPalindrome = isPalindrome(121);
        System.out.println(isPalindrome);
    }
    public boolean isPalindrome(int x) {
        String valueToString = x+"";
        StringBuilder newString = new StringBuilder(valueToString).reverse();
        if(newString.equals(valueToString)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        new Palindrome();
    }
}
