package mwa.leetcode.topInterview;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    SingleNumber(){
        singleNumber(new int[]{2,2,1,3,1});
    }
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num:nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
                continue;
            }
            map.put(num,1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key);
                return key;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        new SingleNumber();
    }
}
