package mwa.leetcode.topInterview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        HashMap<String, Integer> map = new HashMap<>();
        map.put("sam", 1);
        map.put("sammy", 2);
        map.put("sudin", 13);
        map.put("Suman", 3);

        List<Map.Entry<String, Integer>> as = map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toList());
        as.forEach(x-> System.out.println(x.getKey()));

    }
}
