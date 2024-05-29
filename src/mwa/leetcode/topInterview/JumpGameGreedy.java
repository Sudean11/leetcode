package mwa.leetcode.topInterview;

public class JumpGameGreedy {
    JumpGameGreedy(){
        System.out.println(canJump(new int[]{1,4,0,0,0,4}));
    }

    public boolean canJump(int[] nums) {
        int index = nums.length-2;
        int goal = nums.length-1;
        while(index >=0){
            if(nums[index] >= (goal - index)){
                goal = index;
            }
            index--;
        }
        System.out.println(goal);
        return goal == 0;
    }
    public static void main(String[] args) {
        new JumpGameGreedy();
    }
}
