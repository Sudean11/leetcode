package mwa.leetcode.topInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {
    IntToRoman(){
        intToRoman(3749);
    }
    public String intToRoman(int num) {
        Map<String, Integer> romanNumeralsMap = new LinkedHashMap<>();
        romanNumeralsMap.put("M", 1000);
        romanNumeralsMap.put("CM", 900);
        romanNumeralsMap.put("D", 500);
        romanNumeralsMap.put("CD", 400);
        romanNumeralsMap.put("C", 100);
        romanNumeralsMap.put("XC", 90);
        romanNumeralsMap.put("L", 50);
        romanNumeralsMap.put("XL", 40);
        romanNumeralsMap.put("X", 10);
        romanNumeralsMap.put("IX", 9);
        romanNumeralsMap.put("V", 5);
        romanNumeralsMap.put("IV", 4);
        romanNumeralsMap.put("I", 1);
        StringBuilder romanizedText = new StringBuilder();
        for(Map.Entry<String, Integer> singleVal: romanNumeralsMap.entrySet()){
            while(num >= singleVal.getValue()){
                romanizedText.append(singleVal.getKey());
                num-=singleVal.getValue();
            }
        }
        return romanizedText.toString();
    }
    public static void main(String[] args) {
        new IntToRoman();
    }
}
