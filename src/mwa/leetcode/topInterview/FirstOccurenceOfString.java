package mwa.leetcode.topInterview;

public class FirstOccurenceOfString {
    FirstOccurenceOfString(){
        System.out.println(strStr("mississippi", "issip"));
    }
    public int strStr(String haystack, String needle) {
        int index= 0;
        for(int i = 0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(index)){
                index++;
                System.out.println("Have you reached here" + i + haystack.charAt(i)+ needle.charAt(index-1));
                if(index == needle.length()){
                    return i-index+1;
                }
                continue;
            }
            index = 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        new FirstOccurenceOfString();
    }
}
