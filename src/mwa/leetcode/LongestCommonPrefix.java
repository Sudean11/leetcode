package mwa.leetcode;

public class LongestCommonPrefix {

    LongestCommonPrefix(){
        String prefix = longestCommonPrefix(new String[]{""});
        System.out.println(prefix);
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();
        int index = 0;
        while(true){
            if(strs.length == 0){
                return "";
            }
            try{
                char currentChar = strs[0].charAt(index);
                for(String singleString: strs){
                    if(currentChar != singleString.charAt(index)){
                        if(commonPrefix.isEmpty()){
                            return "";
                        }
                        return commonPrefix.toString();
                    }
                }
                commonPrefix.append(currentChar);
            }catch (Exception e){
                if(commonPrefix.isEmpty()){
                    return "";
                }
                return commonPrefix.toString();
            }


            index++;
        }
    }
    public static void main(String[] args) {
        new LongestCommonPrefix();
    }
}
