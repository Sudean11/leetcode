package mwa.leetcode.Array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayNesting {
    ArrayNesting(){
        arrayNesting(new int[]{5,4,0,3,1,6,2});
    }
    public int arrayNesting(int[] nums) {

        int max = 0;
        for(int i = 0; i< nums.length; i++){
            int currentTotal = 1;
            int nextIndex = nums[i];
            while(nextIndex != i && nextIndex != -1 ){
                System.out.println(nextIndex+" next index");
                currentTotal++;
                nextIndex = nums[nextIndex];
            }
            nums[i] = -1;
            max = Math.max(currentTotal, max);
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        new ArrayNesting();
    }
}
