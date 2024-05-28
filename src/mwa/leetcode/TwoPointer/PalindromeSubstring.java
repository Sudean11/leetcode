package mwa.leetcode.TwoPointer;

public class PalindromeSubstring {
    PalindromeSubstring(){
        longestPalindrome("abb");
        //racecar
        //abba
    }
    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty()){
            return "";
        }

        String longestPalindrome = "";
        for(int i = 0; i<s.length(); i++){
            String palindrome = checkPalindrome(s, i);
            if(longestPalindrome.length() < palindrome.length()){
                longestPalindrome = palindrome;
            }
        }
        System.out.println(longestPalindrome);
        return longestPalindrome;
    }

    private String checkPalindrome(String s, int index) {
        int leftIndex = index-1;
        int rightIndex = index+1;
        String palindrome = String.valueOf(s.charAt(index));
        if(s.length() == 2){
            if(s.charAt(0)==s.charAt(1)){
                return s;
            }
        }

        while(leftIndex >= 0 && rightIndex <s.length()){
            if(s.charAt(index) == s.charAt(leftIndex) && s.charAt(index) !=  s.charAt(rightIndex)){
                palindrome = s.substring(leftIndex, index+1);
                System.out.println(palindrome);
                leftIndex--;
                continue;
            }else if(s.charAt(index) == s.charAt(rightIndex) && s.charAt(index) !=  s.charAt(leftIndex)){
                palindrome = s.substring(index, rightIndex+1);
                System.out.println(palindrome);
                rightIndex++;
                continue;
            }
            if(s.charAt(leftIndex)== s.charAt(rightIndex)){
                palindrome = s.substring(leftIndex, rightIndex+1);
                leftIndex--;
                rightIndex++;

            }else{
                return palindrome;
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        new PalindromeSubstring();
    }
}
