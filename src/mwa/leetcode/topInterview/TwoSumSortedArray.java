package mwa.leetcode.topInterview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSumSortedArray {
    TwoSumSortedArray(){
        System.out.println(Arrays.stream(twoSum(new int[]{2, 7, 11, 15}, 18)).boxed().collect(Collectors.toList()));
    }
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        while(leftPointer< rightPointer){
            if(numbers[leftPointer] + numbers[rightPointer] == target){
                return new int[]{leftPointer+1, rightPointer+1};
            }
            if(numbers[leftPointer] + numbers[rightPointer] < target){
                leftPointer++;
                continue;
            }
            if(numbers[leftPointer] + numbers[rightPointer] > target){
                rightPointer--;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        new TwoSumSortedArray();
    }
}
