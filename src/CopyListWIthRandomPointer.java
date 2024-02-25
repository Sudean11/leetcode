import java.util.HashMap;

public class CopyListWIthRandomPointer {
    CopyListWIthRandomPointer(){

    }


    public Node copyRandomList(Node head) {
        Node currentNode = head;
        HashMap<Node, Node> map = new HashMap<>();
        while(currentNode!=null){
            map.put(currentNode, new Node(currentNode.val));
            currentNode = currentNode.next;
        }

        currentNode = head;
        while(currentNode!=null){
            map.get(currentNode).next = map.get(currentNode.next);
            map.get(currentNode).random = map.get(currentNode.random);
            currentNode = currentNode.next;
        }

        return map.get(head);
    }


    public static void main(String[] args) {

    }
}
