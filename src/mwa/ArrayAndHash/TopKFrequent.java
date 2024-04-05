package mwa.ArrayAndHash;

import java.util.HashMap;

public class TopKFrequent {

    TopKFrequent(){
        topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> records = new HashMap<>();
        for(int num: nums){
            records.merge(num, 1, Integer::sum);
        }


        return null;
    }
    public static void main(String[] args) {
        new TopKFrequent();
    }
}
