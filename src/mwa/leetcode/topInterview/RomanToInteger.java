package mwa.leetcode.topInterview;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    Map<Character, Integer> romanNumeralsMap = new HashMap<>();
    RomanToInteger(){

        // Populate the map with Roman numeral values
        romanNumeralsMap.put('I', 1);
        romanNumeralsMap.put('V', 5);
        romanNumeralsMap.put('X', 10);
        romanNumeralsMap.put('L', 50);
        romanNumeralsMap.put('C', 100);
        romanNumeralsMap.put('D', 500);
        romanNumeralsMap.put('M', 1000);
        System.out.println(romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0; i< s.length(); i++){
            if(i != s.length()-1 && (romanNumeralsMap.get(s.charAt(i)) < romanNumeralsMap.get(s.charAt(i+1)))){
                sum = sum - romanNumeralsMap.get(s.charAt(i));
                continue;
            }
            sum+=romanNumeralsMap.get(s.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        new RomanToInteger();
    }

}
