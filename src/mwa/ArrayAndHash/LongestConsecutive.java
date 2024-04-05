package mwa.ArrayAndHash;

import java.util.Arrays;

public class LongestConsecutive {

    LongestConsecutive(){
        System.out.println(longestConsecutive(new int[]{9,1,-3,2,4,8,3,-1,6,-2,-4,7}));

    }
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
//        for(int num:nums){
//            System.out.println(num);
//        }
        int longestConsecutive = 1;

        if(nums.length == 1 || nums.length == 0){
            return nums.length;
        }
        int consecutive = 1;
        for(int index = 0; index<nums.length; index++){
            if(index == nums.length - 1){
                if(consecutive > longestConsecutive){
                    longestConsecutive = consecutive;
                }
            }
            else if(nums[index] == nums[index +1]){
                continue;
            }
            else if(nums[index] +1 == nums[index+1]){
                consecutive++;
                System.out.println(nums[index]+" "+ nums[index+1]+ " consecutive:"+ consecutive);

            }else{
                if(consecutive > longestConsecutive){

                    longestConsecutive = consecutive;

                }
                consecutive= 1;
            }
        }
        return longestConsecutive;
    }

    public static void main(String[] args) {
        new LongestConsecutive();
    }
}
