package mwa.leetcode.topInterview;

public class IsSubsequence {
    IsSubsequence(){
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        int pointerOnS = 0;
        int pointerOnt = 0;
        if(s.isEmpty()){
            return true;
        }
        while(pointerOnt < t.length()){
            if(s.charAt(pointerOnS) == t.charAt(pointerOnt)){
                pointerOnS++;
                if(pointerOnS == s.length()){
                    System.out.println(pointerOnt);
                    return true;
                }
            }
            pointerOnt++;
        }
        return false;
    }
    public static void main(String[] args) {
        new IsSubsequence();
    }
}
