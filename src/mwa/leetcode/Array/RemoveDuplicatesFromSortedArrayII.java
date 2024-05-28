package mwa.leetcode.Array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArrayII {
    RemoveDuplicatesFromSortedArrayII(){
        removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
    }
    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;
        if(nums.length < 2){
            return currentIndex;
        }
        boolean doubleValue = false;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] > nums[currentIndex-1]){
                nums[currentIndex] = nums[i];
                currentIndex++;
                doubleValue = false;
                continue;
            }
            if(!doubleValue){
                nums[currentIndex] = nums[i];
                currentIndex++;
                doubleValue = true;
            }
        }
        return currentIndex;
    }

    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedArrayII();
    }
}
