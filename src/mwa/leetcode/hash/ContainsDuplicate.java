package mwa.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    ContainsDuplicate(){
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
                continue;
            }
            if((i - map.get(nums[i])) <= k){
                return true;
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        new ContainsDuplicate();
    }
}
