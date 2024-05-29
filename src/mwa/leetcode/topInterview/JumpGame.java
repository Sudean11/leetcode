package mwa.leetcode.topInterview;

import java.util.ArrayList;
import java.util.HashMap;

public class JumpGame {
    ArrayList<Integer> failedValues = new ArrayList<>();
    JumpGame(){
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
    public boolean canJump(int[] nums) {
        return backtrack(nums, 0);
    }

    boolean backtrack(int[] nums, int position){
        if(position == nums.length-1){
            return true;
        }
        if(failedValues.contains(position)){
            return false;
        }
        int index = 1;
        while(index < nums[position]+1){
            if(backtrack(nums, index+position)){
                return true;
            }
            index++;
        }
        failedValues.add(position);
        return false;
    }
    public static void main(String[] args) {
        new JumpGame();
    }
}
