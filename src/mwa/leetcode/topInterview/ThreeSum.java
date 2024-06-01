package mwa.leetcode.topInterview;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    List<List<Integer>> listSet = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    ThreeSum(){


        threeSum(new int[]{-1,0,1,2,-1,-4});
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for the first number
            twoSum(nums, -nums[i], i, result);
        }
        System.out.println(result);
        return new ArrayList<>(result);
    }

    private void twoSum(int[] nums, int target, int index, Set<List<Integer>> result) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = index + 1; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                result.add(Arrays.asList(nums[index], hash.get(nums[i]), nums[i]));
            } else {
                hash.put(target - nums[i], nums[i]);
            }
        }
    }



    public static void main(String[] args) {
        new ThreeSum();
    }
}
