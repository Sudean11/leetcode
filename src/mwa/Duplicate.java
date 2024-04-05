package mwa;

import java.util.HashMap;

public class Duplicate {
    Duplicate(){
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> values = new HashMap<>();
        for(int singleNum: nums){
            if(values.get(singleNum) != null){
                return true;
            }else{
                values.put(singleNum, true);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        new Duplicate();
    }
}
