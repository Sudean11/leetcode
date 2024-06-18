package mwa.leetcode.stacok;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class SimplifyPath {
    SimplifyPath(){
        System.out.println( simplifyPath("/.../a/../b/c/../d/./"));
    }
    public String simplifyPath(String path) {

        StringBuilder stringBuilder = new StringBuilder();

        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String s : paths) {
            if (s.equals("..")) {
                if(!stack.isEmpty()){
                    stack.pop();
                }
                continue;
            }

            if (!s.isEmpty() && !s.equals(".")) {
                stack.push(s);
            }
        }

        if(stack.isEmpty()){
            return "/";
        }
        for(String s: stack){
            stringBuilder.append("/").append(s);
        }

        return stringBuilder.toString();

    }
    public static void main(String[] args) {
        new SimplifyPath();
    }
}
