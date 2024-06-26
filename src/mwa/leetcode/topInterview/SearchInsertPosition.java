package mwa.leetcode.topInterview;

public class SearchInsertPosition {
    SearchInsertPosition(){
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }
    public int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        int midPoint = 0;

        while(rightIndex >= leftIndex){
            midPoint = (rightIndex+leftIndex)/2;
            if(nums[midPoint] == target){
                return midPoint;
            }
            if(target < nums[midPoint] ){
                rightIndex = midPoint-1;
            }
            else{
                leftIndex = midPoint+1;
            }
        }
        return leftIndex;
    }

    public static void main(String[] args) {
        new SearchInsertPosition();
    }

}
