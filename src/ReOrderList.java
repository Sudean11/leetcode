public class ReOrderList {

    ReOrderList(){
        LinkedList a = new LinkedList(null, 5);

        LinkedList a1 = new LinkedList(a, 4);
        LinkedList s = new LinkedList(a1, 3);
        LinkedList b = new LinkedList(s, 2);
        LinkedList c = new LinkedList(b, 1);

        reOrder(c);
    }

    void reOrder(LinkedList head){
        //findMidPoint()
        LinkedList midNode = head;
        LinkedList forwardNode = head;

        while(forwardNode.next !=null && forwardNode.next.next!=null){
            midNode = midNode.next;
            forwardNode = forwardNode.next.next;
        }


        //Reverse after Mid node to final node
        LinkedList nodeToReverse = midNode.next;
        LinkedList reverseHeadNode = midNode.next;
        LinkedList previousNode = null;
        while(nodeToReverse != null){
            LinkedList tempNode = nodeToReverse.next;
            nodeToReverse.next = previousNode;
            reverseHeadNode = nodeToReverse;
            previousNode = nodeToReverse;
            nodeToReverse = tempNode;
        }

        LinkedList finalHead = head;
        //merge those two linkedlist
        while(head != midNode){
            LinkedList temp = head.next;
            head.next = reverseHeadNode;
            LinkedList reverseTemp = reverseHeadNode.next;
            reverseHeadNode.next = temp;
            reverseHeadNode = reverseTemp;
            head = temp;
        }

        if(reverseHeadNode != null){
            head.next = reverseHeadNode;
        }else{
            midNode.next = null;
        }

        while(finalHead !=null){
            System.out.println(finalHead.value);
            finalHead = finalHead.next;
        }

    }


    public static void main(String[] args) {
        new ReOrderList();
    }
}

