public class AddTwoNumbers {

    AddTwoNumbers(){
        ListNode l1 = new ListNode(9, null);
        ListNode l2 = new ListNode(9, l1);
        ListNode l3 = new ListNode(9, l2);

        ListNode a1 = new ListNode(9, null);
        ListNode a2 = new ListNode(9, a1);
        ListNode a3 = new ListNode(9, a2);

        ListNode sumNode = addTwoNumbers(l3, a3);

        while(sumNode !=null){
            System.out.println(sumNode.val);
            sumNode = sumNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = null;
        ListNode newHead = new ListNode(0, prev);

        int carry = 0;
        while(l1!= null || l2!=null){
            int val = (l1 == null? 0 : l1.val) + (l2 == null? 0 : l2.val)+ carry;
            if(val >= 10){
                ListNode newNode;
                if(prev == null){
                    newHead.val = val % 10;
                    prev = newHead;
                }else{
                    newNode = new ListNode(val % 10, prev);
                    prev.next = newNode;
                    prev = newNode;
                }

                carry = val / 10;
            }else{
                if(prev == null){
                    newHead.val = val;
                    prev = newHead;
                }else{
                    ListNode newNode = new ListNode(val , prev);
                    prev.next = newNode;
                    prev = newNode;
                    carry = 0;
                }
            }
            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2!= null) ? l2.next : l2;
            if(l1 == null && l2 == null){
                if(carry!=0){
                    ListNode newNode = new ListNode(carry , null);
                    prev.next = newNode;
                    prev = newNode;
                }
                prev.next = null;

            }
        }

        return newHead;
    }

    public static void main(String[] args) {
        new AddTwoNumbers();
    }
}
