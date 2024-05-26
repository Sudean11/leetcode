package mwa.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOne {

    PlusOne(){
        plusOne(new int[]{1,2,3});
    }

    public int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();
        for(int i : digits){
            s.append(i);
        }
        int a = Integer.parseInt(s.toString())+1;
        return Arrays.stream(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {
        new PlusOne();
    }
}
