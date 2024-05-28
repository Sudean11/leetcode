package mwa.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveElement {
    RemoveElement(){
        removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
    }
    public int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        return currentIndex;
    }
    public static void main(String[] args) {
        new RemoveElement();
    }
}
