public class LinkedList {
    LinkedList next;
    int value;

    LinkedList(){}

    public LinkedList(LinkedList next, int value) {
        this.next = next;
        this.value = value;
    }
}
