package mwa.leetcode.topInterview;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    ValidAnagram(){
        System.out.println(isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            char character = s.charAt(i);
            if(!map.containsKey(character)){
                map.put(character,1);
                continue;
            }
            map.put(character, map.get(character)+1);
        }
        for(int i =0; i<t.length(); i++){
            char character = t.charAt(i);
            if(!map.containsKey(character)){
                return false;
            }
            map.put(character, map.get(character)-1);
            if(map.get(character) < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        new ValidAnagram();
    }
}
