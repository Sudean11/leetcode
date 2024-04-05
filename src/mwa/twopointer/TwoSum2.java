package mwa.twopointer;

import java.util.HashMap;

public class TwoSum2 {
    TwoSum2(){
        int[] result = twoSum(new int[]{2,3,4},6);
        System.out.println(result[0]+" "+result[1]);
    }
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i<numbers.length; i++){
            if(hashMap.get(target-numbers[i]) != null){
                return new int[]{hashMap.get(target-numbers[i]), i};
            }else{
                hashMap.put(numbers[i], i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        new TwoSum2();
    }
}
