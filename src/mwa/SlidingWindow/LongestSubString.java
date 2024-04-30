package mwa.SlidingWindow;

import java.util.*;

public class LongestSubString {
    LongestSubString(){
        lengthOfLongestSubstring("jbpnbwwd");
    }
    public int lengthOfLongestSubstring(String s) {
        Set list = new HashSet();
        char[] charList = s.toCharArray();
        int longestSubsequence = 0;
        if(charList.length < 1){
            return 0;
        }
        if(charList.length == 1){
            return 1;
        }
        int leftIndex = 0;
        int rightIndex = 1;
        list.add(charList[leftIndex]);
        while(rightIndex< s.length()){
            if(leftIndex == rightIndex){
                if(!list.contains(charList[rightIndex])){
                    list.add(charList[rightIndex]);
                }
                rightIndex++;
                continue;
            }
            if(list.contains(charList[rightIndex])){
                leftIndex++;
                if(longestSubsequence < list.size()){
                    System.out.println(list);
                    longestSubsequence = list.size();
                }
                list.remove(0);
                continue;
            }else{
                list.add(charList[rightIndex]);
                rightIndex++;
            }
        }
        if(longestSubsequence < list.size()){
            longestSubsequence = list.size();
            System.out.println(list);
        }
        System.out.println(longestSubsequence );
        return longestSubsequence;
    }
    public static void main(String[] args) {
        new LongestSubString();
    }
}
