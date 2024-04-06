package mwa.Stack;

import java.util.Stack;

public class MinStack {

    MinStack(){
        evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
    }

    public int evalRPN(String[] tokens) {
        int calculatedValue = 0;
        int val1;
        int val2;
        boolean firstOperation = true;
        Stack<Integer> stack = new Stack<>();
        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        for(String token: tokens){
            try{
                int value = Integer.parseInt(token);
                stack.push(value);
            }catch (Exception e){
                if(firstOperation){
                    val2 = stack.peek();
                    stack.pop();
                    val1  = stack.peek();
                    stack.pop();
                    firstOperation = false;
                }else{
                    val2 = stack.peek();
                    stack.pop();
                    val1 = calculatedValue;
                }
                switch (token){
                    case "+":
                        calculatedValue = val1 + val2;
                        break;
                    case "-":
                        calculatedValue = val1 - val2;
                        break;
                    case "*":
                        calculatedValue = val1 * val2;
                        break;
                    case "/":
                        calculatedValue = val1 / val2;
                        break;
                    default:
                        break;
                }
                System.out.println(calculatedValue);
            }
        }
        System.out.println(calculatedValue);
        return calculatedValue;
    }

    public static void main(String[] args) {
        new MinStack();
    }
}
