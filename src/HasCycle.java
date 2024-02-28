public class HasCycle {
    HasCycle(){
        ListNode a = new ListNode(1, null);
        ListNode b = new ListNode(2, a);
        ListNode c = new ListNode(3, b);
        a.next = new ListNode(4, c);
        System.out.println(hasCycle(a));
    }
    public boolean hasCycle(ListNode head) {
        ListNode fastPos = head;
        ListNode slowPos = head;

        while(fastPos!= null && fastPos.next !=null){
            slowPos = slowPos.next;
            fastPos = fastPos.next.next;
            if (slowPos == fastPos )return true;
        }
        return  false;
    }
    public static void main(String[] args) {
        new HasCycle();
    }
}
