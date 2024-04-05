package mwa.twopointer;

public class ValidPalindrome {

    ValidPalindrome(){
        System.out.println(isPalindrome(" "));
    }

    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();


        StringBuilder newString = new StringBuilder();
        for(char singleChar : charArray){
            if(Character.isLetterOrDigit(singleChar)){
                newString.append(singleChar);
            }
        }
        charArray = newString.toString().toLowerCase().toCharArray();
        int start = 0;
        int end = charArray.length -1;
        while(start< end){
            if(charArray[start] == charArray[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        new ValidPalindrome();
    }
}
