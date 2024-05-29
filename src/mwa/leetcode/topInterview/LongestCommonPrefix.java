package mwa.leetcode.topInterview;

public class LongestCommonPrefix {
    LongestCommonPrefix(){
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true){
            char compareChar = 0;
            for(String single: strs){
                if(single.isEmpty()){
                    return stringBuilder.toString();
                }
                if(single.length()-1 < i){
                    return stringBuilder.toString();
                }
                if(compareChar == 0){
                    compareChar = single.charAt(i);
                    continue;
                }
                if(single.charAt(i) != compareChar){
                    return stringBuilder.toString();
                }
            }
            i++;
            stringBuilder.append(compareChar);
        }
    }
    public static void main(String[] args) {
        new LongestCommonPrefix();
    }
}
