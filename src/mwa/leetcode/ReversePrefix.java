package mwa.leetcode;

import java.util.Arrays;
import java.util.List;

public class ReversePrefix {

    ReversePrefix(){
        System.out.println(reversePrefix("xyxzxe",'z'));
    }

    public String reversePrefix(String word, char ch) {
        int index = 0;
        StringBuilder finalWords = null;
        while(index < word.length()){
            if(word.charAt(index) == ch){
                String wordToReverse = word.substring(0, word.indexOf(ch)+1);
                finalWords = new StringBuilder(new StringBuilder(wordToReverse).reverse() + word.substring(wordToReverse.length()));
                break;
            }
            index++;
        }
        if(finalWords == null){
            return word;
        }
        return finalWords.toString();
    }
    public static void main(String[] args) {
        new ReversePrefix();

    }
}
