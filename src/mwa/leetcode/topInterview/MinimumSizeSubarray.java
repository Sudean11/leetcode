package mwa.leetcode.topInterview;

public class MinimumSizeSubarray {
    MinimumSizeSubarray(){
        System.out.println(minSubArrayLen(4, new int[]{1,1,1,1,1,1,1,1}));
    }
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1){
            if(nums[0] >= target){
                return 1;
            }else{return 0;}
        }
        int leftPointer = 0;
        int rightPointer = 0;
        int minimumSize = Integer.MAX_VALUE;
        int sum = nums[leftPointer];
        while(rightPointer < nums.length || leftPointer>rightPointer){
            if(sum >= target){
                if(minimumSize > (rightPointer-leftPointer)){
                    minimumSize = rightPointer - leftPointer;
                }
                sum -= nums[leftPointer];
                leftPointer++;
                continue;
            }
            if(sum < target){
                rightPointer++;
                if(rightPointer >= nums.length){
                    continue;
                }
                sum=sum+nums[rightPointer];
            }
        }
        if(minimumSize == Integer.MAX_VALUE) return 0;
        return  minimumSize+1;
    }
    public static void main(String[] args) {
        new MinimumSizeSubarray();
    }
}
