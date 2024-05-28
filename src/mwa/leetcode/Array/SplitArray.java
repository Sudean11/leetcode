package mwa.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class SplitArray {
    SplitArray(){
        System.out.println(isPossibleToSplit(new int[]{1,1,2,2,3,4}));
    }

    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(Integer num: nums){
            if(hash.containsKey(num) && hash.get(num) > 1)
            {
                return false;
            }
            if(hash.containsKey(num) && hash.get(num) == 1){
                hash.put(num, hash.get(num)+1);
            }else{
                hash.put(num, 1);
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        new SplitArray();
    }
}
