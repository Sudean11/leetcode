
public class ReverseLinkedList {
    ReverseLinkedList(){
        LinkedList c = new LinkedList(null, 4);
        LinkedList d = new LinkedList(c, 2);
        LinkedList e = new LinkedList(d, 1);

        LinkedList f = new LinkedList(null, 5);
        LinkedList g = new LinkedList(f, 4);
        LinkedList h = new LinkedList(g, 4);


        LinkedList reversed = new ReverseLinkedList().reverseList(e);
        System.out.println(reversed.value);
        while(reversed!=null){
            System.out.println(reversed.value);
            reversed = reversed.next;
        }
    }

    public LinkedList reverseList(LinkedList head) {

        LinkedList currentNode = head;
        LinkedList previousNode = null;
        LinkedList headNode = null;

        while(currentNode !=null){
            LinkedList next = currentNode.next;
            headNode = currentNode;
            headNode.next = previousNode;
            previousNode = currentNode;
            currentNode = next;
        }
        return headNode;
    }
}
