package mwa.leetcode.topInterview;

public class IsValidPalindrome {
    IsValidPalindrome(){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sc = new StringBuilder();
        for(int i = 0; i<s.length();i ++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sc.append(s.charAt(i));
            }
        }
        StringBuilder newSc = new StringBuilder(sc);
        sc.reverse();
        return sc.compareTo(newSc) == 0;
    }
    public static void main(String[] args) {
        new IsValidPalindrome();
    }
}
