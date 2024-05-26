package mwa.leetcode.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class RotateArray {

    RotateArray(){
        rotate(new int[]{1,2,3},4);
    }
    public void rotate(int[] nums, int k) {

        k %= nums.length;
        System.out.println(k);
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    }

    void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        new RotateArray();
    }
}
