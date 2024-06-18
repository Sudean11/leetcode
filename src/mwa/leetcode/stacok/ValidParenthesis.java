package mwa.leetcode.stacok;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    ValidParenthesis(){
        System.out.println(isValid("{}{){}"));
    }

    public boolean isValid(String s) {
        HashMap<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put('(', ')');
        parenthesis.put('[', ']');
        parenthesis.put('{', '}');

        Stack<Character> str = new Stack<>();

        for(int index=0; index<s.length(); index++){
            try{


            if(parenthesis.containsKey(s.charAt(index))){
                str.push(s.charAt(index));
                continue;
            }
            if(parenthesis.get(str.peek()) == s.charAt(index)){
                str.pop();
            }else{
                return false;
            }
            }catch (Exception e){
                return false;
            }
        }
        return str.isEmpty();
    }

    public static void main(String[] args) {
        new ValidParenthesis();
    }
}
