public class RemoveNthNodeFromEnd {

    RemoveNthNodeFromEnd(){
        ListNode a = new ListNode(5, null);
        ListNode a1 = new ListNode(4, a);
//        ListNode s = new ListNode(3, a1);
//        ListNode b = new ListNode(2, s);
//        ListNode c = new ListNode(1, b);

       ListNode headNode =  removeNthFromEnd(a1, 2);
        while(headNode!=null){
            System.out.println(headNode.val);
            headNode = headNode.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        ListNode forwardNode = head;
        ListNode headNode = head;
        for(int i = 1; i<n; i++){
            forwardNode = forwardNode.next;
        }

        if(forwardNode.next !=null){
            forwardNode = forwardNode.next;
        }else{
            if(currentNode.next==null){
                return null;
            }

            currentNode = currentNode.next;
            return currentNode;

        }

        while(forwardNode.next!=null){
            currentNode = currentNode.next;
            forwardNode = forwardNode.next;
        }

        currentNode.next = currentNode.next.next;




        return headNode;
    }

    public static void main(String[] args) {
        new RemoveNthNodeFromEnd();
    }
}
