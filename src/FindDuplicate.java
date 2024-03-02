public class FindDuplicate {

    FindDuplicate(){
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }

    public int findDuplicate(int[] nums) {

        int slow = 0 ;
        int fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) break;
        }

        int slow2 = 0;
        while(slow != slow2){
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow2;
    }

    public static void main(String[] args) {
        new FindDuplicate();
    }
}

