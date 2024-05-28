package mwa.leetcode.LinkedList;

public class RemoveDuplicatesFromSortedList {
    RemoveDuplicatesFromSortedList(){
        ListNode node8 = new ListNode(5);
        ListNode node7 = new ListNode(4, node8);
        ListNode node6 = new ListNode(4, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);
        deleteDuplicates(head);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(head.next != null){
            if(head.val == head.next.val){
                if(head.next.next!=null){
                    head.next = head.next.next;
                }
                continue;
            }
            head = head.next;
        }
        head = node;
        while(head !=null){
            System.out.println(head.val);
            head = head.next;
        }
        return node;
    }
    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedList();
    }
}
