package mwa.leetcode.Array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QuickSort {
    QuickSort(){
        sortArray(new int[]{5,2,3,1});
    }

    public int[] sortArray(int[] nums) {
        backtrack(nums, 0, nums.length-1, nums.length);
        return nums;
    }

    void backtrack(int[] nums, int start, int end, int valueIndex){
        if(start == end || valueIndex < 0 || end < start){
            System.out.println("Left node done");
            return;
        }

        int lastSwitch = start;
        System.out.println(start+" "+ end + " "+ valueIndex);
        for(int index = start; index< end; index ++){
            if(nums[valueIndex-1] > nums[index]){
                swap(nums, index, lastSwitch);
                lastSwitch++;
            }
        }
        swap(nums, lastSwitch, end);
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        backtrack(nums, start, lastSwitch-1, lastSwitch);
        backtrack(nums, lastSwitch+1, end, end+1);
    }

    void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public static void main(String[] args) {
        new QuickSort();
    }
}
