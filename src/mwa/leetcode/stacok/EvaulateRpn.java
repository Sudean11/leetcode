package mwa.leetcode.stacok;

import java.util.Stack;

public class EvaulateRpn {
    EvaulateRpn(){
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token: tokens){
            try{
                stack.push(Integer.parseInt(token));
            }catch (Exception e){
                switch (token){
                    case "+":
                        stack.push(stack.pop()+stack.pop());
                        break;
                    case "-":
                        int secondValue = stack.pop();
                        int firstValue = stack.pop();
                        stack.push(firstValue-secondValue);
                        break;
                    case "/":
                        secondValue = stack.pop();
                        firstValue = stack.pop();
                        stack.push(firstValue/secondValue);
                        break;
                    case "*":
                        stack.push(stack.pop()*stack.pop());
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        new EvaulateRpn();
    }
}
