package mwa.leetcode;

public class FirstOccurenceOfString {
    FirstOccurenceOfString(){
        System.out.println(strStr("abc", "c"));
    }
    public static void main(String[] args) {
        new FirstOccurenceOfString();
    }

    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        if(haystack.split(needle).length== 0){
            return 0;
        }

        return haystack.split(needle)[0].length();
    }
}
