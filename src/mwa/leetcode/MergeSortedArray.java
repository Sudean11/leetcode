package mwa.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSortedArray {

    MergeSortedArray(){
        merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        for(int i = m+n-1; i>= 0; i--){
            if(index1 == -1){
                nums1[i] = nums2[index2];
                index2--;
                continue;
            }

            if(index2 == -1){
                nums1[i] = nums1[index1];
                index1--;
                continue;
            }
            if(nums1[index1] > nums2[index2]){
                nums1[i] = nums1[index1];
                index1--;
            }else{
                nums1[i] = nums2[index2];
                index2--;
            }


        }
        System.out.println(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
    }


    public static void main(String[] args) {
        new MergeSortedArray();
    }
}
