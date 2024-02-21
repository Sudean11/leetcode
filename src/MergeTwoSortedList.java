public class MergeTwoSortedList {

     MergeTwoSortedList(){
        System.out.println("hello");
        LinkedList a = new LinkedList(null, 4);
        LinkedList b = new LinkedList(a, 2);
        LinkedList c = new LinkedList(b, 1);


        LinkedList a1 = new LinkedList(null, 4);
        LinkedList b1 = new LinkedList(a1, 3);
        LinkedList c1 = new LinkedList(b1, 1);

        LinkedList finalNode = mergeList(c, c1);
        while(finalNode != null){
            System.out.println(finalNode.value);
            finalNode = finalNode.next;
        }
    }

    private LinkedList mergeList(LinkedList list1, LinkedList list2) {
        LinkedList headNode = new LinkedList();
        LinkedList currentNode = headNode;

        while(list1 !=null || list2 !=null){
            if(list1 == null){
                currentNode.next = list2;
                break;
            }

            if(list2 == null){
                currentNode.next = list1;
                break;
            }

            if(list1.value > list2.value){
                currentNode.next = list2;
                currentNode = currentNode.next;
                list2 = list2.next;
            }else{
                currentNode.next = list1;
                currentNode = currentNode.next;
                list1 = list1.next;
            }

        }

        return headNode.next;
    }


    public static void main(String[] args) {

        new MergeTwoSortedList();
    }

}
