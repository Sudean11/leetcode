package mwa.leetcode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesFromSortedArray {

    DuplicatesFromSortedArray(){
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int currentVal = nums[0];
        int currentIndex = 1;
        while (currentIndex < nums.length){
            if(currentVal == nums[currentIndex]){
                currentIndex++;
            }else{
                System.out.println("here"+currentIndex+"  "+index);
                nums[index] = nums[currentIndex];
                currentVal = nums[index];
                index++;
                currentIndex++;
            }
        }
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        return index;
    }

    public static void main(String[] args) {
        new DuplicatesFromSortedArray();
    }
}
