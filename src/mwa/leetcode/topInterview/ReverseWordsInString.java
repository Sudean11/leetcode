package mwa.leetcode.topInterview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInString {
    ReverseWordsInString(){
        reverseWords("a good   example");
    }

    public String reverseWords(String s) {
        String[] list = s.trim().split(" ");
        System.out.println(Arrays.stream(list).collect(Collectors.toList()));
        StringBuilder sb = new StringBuilder();
        for(int i = list.length-1; i>=0; i--){
            if(list[i].isEmpty()){
                continue;
            }
            if(i ==0 ){
                sb.append(list[i]);
                continue;
            }
            sb.append(list[i]).append(" ");
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        new ReverseWordsInString();
    }
}
