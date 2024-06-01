package mwa.leetcode.topInterview;

import java.util.*;

public class GroupAnagram {
    GroupAnagram(){
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hash = new HashMap<>();
        for(String singleStr: strs){
            char[] charList = singleStr.toCharArray();
            Arrays.sort(charList);
            String newStr = new String(charList);
            if(!hash.containsKey(newStr)){
                hash.put(newStr, new ArrayList<>());
            }
            hash.get(newStr).add(singleStr);
        }
        List<List<String>> list = new ArrayList<>();
        for(String singleString: hash.keySet()){
            list.add(hash.get(singleString));
        }
        return list;
    }
    public static void main(String[] args) {
        new GroupAnagram();
    }
}
