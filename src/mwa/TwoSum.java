package mwa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class TwoSum {

    TwoSum(){
        int[] val = twoSum(new int[]{3,2,4},6);
        System.out.println(val[0]+ " "+ val[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int remainingVal = target - nums[i];
            if(record.get(remainingVal) != null){
                return new int[]{record.get(remainingVal), i};
            }
            record.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        new TwoSum();
    }
}
