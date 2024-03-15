import java.util.ArrayList;
import java.util.List;

public class Subset {
    Subset(){
        System.out.println(subsets(new int[]{1,2,3}));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans, 0, nums, list);
        return ans;
    }

    public void helper(
            List<List<Integer>> ans,
            int start,
            int[] nums,
            List<Integer> list
    ) {
        if (start >= nums.length) {
            ans.add(new ArrayList<>(list));
        } else {
            list.add(nums[start]);
            helper(ans, start+1, nums, list);

            list.remove(list.size() -1);
            helper(ans, start+1, nums, list);
        }
    }

    public static void main(String[] args) {
        new Subset();
    }
}
