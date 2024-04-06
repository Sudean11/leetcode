package mwa.Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {


    ValidParenthesis(){

        System.out.println(isValid("]"));
    }
    public boolean isValid(String s) {
        HashMap<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put('(',')');
        parenthesis.put('[',']');
        parenthesis.put('{','}');
        Stack<Character> stack = new Stack();
        char[] charList = s.toCharArray();
        for(char singleChar:charList){
            if(parenthesis.containsKey(singleChar)){
                stack.push(singleChar);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char lastInputChar = stack.peek();
                stack.pop();
                if(parenthesis.get(lastInputChar) != singleChar){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new ValidParenthesis();
    }
}
