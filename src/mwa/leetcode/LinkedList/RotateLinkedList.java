package mwa.leetcode.LinkedList;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class RotateLinkedList {
    RotateLinkedList(){
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(3, node5);
        rotateRight(node4, 2);
    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();
        if(node == null){
            return null;
        }
        while(node !=null){
            stack.add(node);
            node = node.next;
        }
        if(k>= stack.size()){
            k = k%stack.size();
        }
        while(k>0){
            stack.peek().next = head;
            head = stack.pop();
            k--;
        }

        if(!stack.isEmpty()){
            stack.pop().next = null;
        }else{
            head.next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        new RotateLinkedList();
    }
}
