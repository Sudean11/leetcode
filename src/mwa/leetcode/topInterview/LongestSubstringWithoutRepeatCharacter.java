package mwa.leetcode.topInterview;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatCharacter {
    LongestSubstringWithoutRepeatCharacter(){
        lengthOfLongestSubstring("pwwkew");
    }
    public int lengthOfLongestSubstring(String s) {
        int longestSubStringTillNow = 0;
        int rightIndex = 0;
        StringBuilder subsequence= new StringBuilder();

        while(rightIndex < s.length()){
            if(!subsequence.toString().contains(String.valueOf(s.charAt(rightIndex)))){
                subsequence.append(s.charAt(rightIndex));
                if(longestSubStringTillNow < subsequence.length()){
                    longestSubStringTillNow = subsequence.length();
                }
                rightIndex++;
            }else{
                while(subsequence.toString().contains(String.valueOf(s.charAt(rightIndex)))){
                    subsequence.deleteCharAt(0);
                }
                subsequence.append(s.charAt(rightIndex));
                rightIndex++;
            }
            System.out.println(subsequence.toString());
        }
        System.out.println(longestSubStringTillNow);
        return longestSubStringTillNow;
    }

    public static void main(String[] args) {
        new LongestSubstringWithoutRepeatCharacter();
    }
}
