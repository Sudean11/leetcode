package mwa.leetcode;

public class SearchInsertPosition {

    SearchInsertPosition(){
        System.out.println(searchInsert(new int[]{1,4,6,7,8,9},6));
    }
    public int searchInsert(int[] nums, int target) {
        int leftPoint = 0;
        int rightPoinst = nums.length-1;
        int midPoint = (rightPoinst+leftPoint)/2+1;
        if(nums.length == 1){
            if(nums[0] < target){
                return 1;
            }else{
                return 0;
            }
        }
        while(leftPoint < rightPoinst){
            if(nums[midPoint] == target){
                System.out.println("reached");
                return midPoint;
            }

            if(rightPoinst - leftPoint == 1){
                if(target > nums[rightPoinst]){
                    System.out.println("reached 1");
                    return rightPoinst+1;
                }
                if(target< nums[leftPoint]){
                    System.out.println("reached 2");
                    return leftPoint;
                }
                if(target > nums[leftPoint]){
                    System.out.println("reached3");
                    return leftPoint+1;
                }
            }
            if(nums[midPoint] > target){
                rightPoinst = midPoint;
                midPoint = (rightPoinst-leftPoint)/2;
            }else{
                leftPoint = midPoint;
                midPoint = (rightPoinst-leftPoint)/2;
            }
        }
        if(leftPoint == rightPoinst){
            if(nums[leftPoint] < target){
                return leftPoint+1;
            }else{
                return leftPoint;
            }
        }
        System.out.println(leftPoint + " "+ rightPoinst+" "+midPoint);
        return midPoint;
    }

    public static void main(String[] args) {
        new SearchInsertPosition();
    }
}
