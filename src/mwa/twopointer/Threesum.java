package mwa.twopointer;

import java.lang.reflect.Array;
import java.util.*;

public class Threesum {
    Threesum(){
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        ArrayList<String> integerListInString = new ArrayList<>();

        for(int i = 0 ;i<nums.length; i++){
            int target = -nums[i];
            ArrayList<int[]> aList = twoSum(nums, target, i);
            for(int[] a: aList){
                if(a!=null){
                    int[] numbers = new int[]{nums[i], nums[a[0]], nums[a[1]]};
                    Arrays.sort(numbers);
                    String value = Arrays.toString(numbers);

                    if(!integerListInString.contains(value)){
                        integerListInString.add(value);
                        ArrayList<Integer> intList = new ArrayList<>(){};
                        intList.add(nums[i]);
                        intList.add(nums[a[0]]);
                        intList.add(nums[a[1]]);

                        arrayList.add(intList);
                    }
                }
            }
        }
        return arrayList;
    }


    public ArrayList<int[]> twoSum(int[] numbers, int target, int skip) {
        ArrayList<int[]> list = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i<numbers.length; i++){
            if(i == skip){
                continue;
            }else if(hashMap.get(target-numbers[i]) != null){
                list.add( new int[]{hashMap.get(target-numbers[i]), i});
            }else{
                hashMap.put(numbers[i], i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        new Threesum();
    }
}
