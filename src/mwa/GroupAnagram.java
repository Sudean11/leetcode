package mwa;

import java.util.*;

public class GroupAnagram {

    GroupAnagram(){
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> groupAnagrams = new HashMap<>();
        for(String singleString: strs){
            char[] sortedChar= singleString.toCharArray();
            Arrays.sort(sortedChar);
            String newStr = new String(sortedChar);
            if(groupAnagrams.get(newStr) == null){
                ArrayList<String> strList = new ArrayList<>();
                strList.add(singleString);
                groupAnagrams.put(newStr, strList);
            }else{
                groupAnagrams.get(newStr).add(singleString);
            }
        }
        Set<String> keys = groupAnagrams.keySet();
        List<List<String>> returnValue = new ArrayList<>();
        for(String key: keys){
            returnValue.add(groupAnagrams.get(key));
        }
        return returnValue;
    }

    public static void main(String[] args) {
        new GroupAnagram();
    }
}
