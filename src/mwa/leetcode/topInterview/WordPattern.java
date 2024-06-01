package mwa.leetcode.topInterview;

import java.util.*;

public class WordPattern {
    WordPattern(){
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
    public boolean wordPattern(String pattern, String s) {
        String[] list = s.split(" ");

        if(pattern.length() !=list.length){
            return false;
        }

        HashMap<Character, String> wordPattern = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i< pattern.length(); i++){
            if(!wordPattern.containsKey(pattern.charAt(i))){
                if(set.contains(list[i])){
                    return false;
                }
                wordPattern.put(pattern.charAt(i), list[i]);
                set.add(list[i]);
                continue;
            }
            if(!wordPattern.get(pattern.charAt(i)).equals(list[i])){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        new WordPattern();
    }
}
