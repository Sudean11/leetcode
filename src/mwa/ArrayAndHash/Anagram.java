package mwa.ArrayAndHash;

import java.util.HashMap;

public class Anagram {

    Anagram(){
        System.out.println(isAnagram("ab", "a"));
    }
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        if(sChar.length != tChar.length){
            return false;
        }

        HashMap<Character, Integer> wordCount = new HashMap<>();

        for(char singleChar: sChar){
            wordCount.merge(singleChar, 1, Integer::sum);
        }

        for(char singleChar: tChar){
            if(wordCount.get(singleChar) == null || wordCount.get(singleChar) == 0){
                return false;
            }
            wordCount.put(singleChar, wordCount.get(singleChar)-1);
        }

        return true;
    }
    public static void main(String[] args) {
        new Anagram();
    }
}
