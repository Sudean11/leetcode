package mwa.leetcode.topInterview;

public class MajorityElement {
    MajorityElement(){
        majorityElement(new int[]{2,2,1,1,1,1,1,1,2,2});
    }
    public int majorityElement(int[] nums) {
        int number = nums[0];
        int count = 1;
        for(int i =1; i< nums.length; i++){
            if(nums[i] == number){
                count++;
            }else{
                count--;
                if(count < 0){
                    count = Math.abs(count);
                    number = nums[i];
                }
            }
        }
        System.out.println(number);
        return number;
    }
    public static void main(String[] args) {
        System.out.println(Integer.bitCount(2));
    }
}
