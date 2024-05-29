package mwa.leetcode.topInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthLastWord {

    LengthLastWord(){
        lengthOfLastWord("   fly me   to   the moon  ");
    }
    public int lengthOfLastWord(String s) {

        String[] list = s.split(" ");
        return list[list.length-1].length();
    }

    public static void main(String[] args) {
        new LengthLastWord();
    }
}
