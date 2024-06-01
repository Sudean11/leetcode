package mwa.leetcode.topInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RansomNote {
    RansomNote(){
        System.out.println(canConstruct("a", "ab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hash = new HashMap<>();
        for(int i = 0 ;i<magazine.length(); i++){
            if(hash.containsKey(magazine.charAt(i))){
                hash.put(magazine.charAt(i), hash.get(magazine.charAt(i))+1);
            }else{
                hash.put(magazine.charAt(i), 1);
            }
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(!hash.containsKey(ransomNote.charAt(i))){
                return false;
            }
            hash.put(ransomNote.charAt(i), hash.get(ransomNote.charAt(i))-1);
            if(hash.get(ransomNote.charAt(i)) < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new RansomNote();
    }
}
