package mwa.leetcode.Array;

public class RemoveDuplicatesFromSortedArray {
    RemoveDuplicatesFromSortedArray(){
        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
    public int removeDuplicates(int[] nums) {
        int currentIndex = 1;
        if(nums.length < 2){
            return currentIndex;
        }

        for(int i = 1; i< nums.length; i++){
            if(nums[i] > nums[currentIndex-1]){
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        return currentIndex;
    }

    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedArray();
    }
}
