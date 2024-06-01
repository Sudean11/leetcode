package mwa.leetcode.topInterview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestConsecutiveSubsequence {
    LongestConsecutiveSubsequence(){
        System.out.println(longestConsecutive(new int[]{1,2,0,1}));
    }
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        if(nums.length <= 1){
            return nums.length;
        }

        int longestSubsequence = 1;
        int currentSubsequence = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i] - nums[i-1] ==0){

            }
            else if(nums[i] - nums[i-1] == 1){
                currentSubsequence++;
            }else{
                longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
                currentSubsequence = 1;
            }
        }

        return Math.max(longestSubsequence, currentSubsequence);
    }
    public static void main(String[] args) {
        new LongestConsecutiveSubsequence();
    }
}
