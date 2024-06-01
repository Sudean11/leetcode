package mwa.leetcode.topInterview;

import java.util.HashSet;
import java.util.Set;

public class HappyNumebr {
    HappyNumebr(){
        System.out.println(isHappy(12));
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int temp = n;
            int sum = 0;
            while(temp!=0){
                int digit = temp%10;
                sum += digit*digit;
                temp = temp/10;
            }
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        new HappyNumebr();
    }
}
