package mwa.leetcode.Array;

public class MonotonicArray {

    MonotonicArray(){
        System.out.println(isMonotonic(new int[]{3,2,1,3}));
    }

    public boolean isMonotonic(int[] nums) {
        boolean incremental = nums[nums.length - 1] - nums[0] > 0;
        if(incremental){
            for(int i = 1; i<nums.length; i++){
                if(nums[i-1] > nums[i]){
                    return false;
                }
            }
        }else{
            for(int i = 1; i<nums.length; i++){
                if(nums[i-1] < nums[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new MonotonicArray();
    }
}
