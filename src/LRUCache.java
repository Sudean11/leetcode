import java.util.HashMap;
import java.util.Map;
public class LRUCache {
    Map<Integer, Node> cache = new HashMap<>();
    int capacity;
    Node startNode = null;
    Node endNode = null;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(cache.get(key)!=null){
            put(key, cache.get(key).value);
            return cache.get(key).value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if( cache.get(key) != null){
            Node node = cache.get(key);
            node.value = value;
            if(node.next == null && node.prev!=null){
                endNode = node.prev;
            }

            if(node.prev != null){
                node.prev.next = node.next;
                if(node.prev.prev == null){
                    node.prev.prev = node;
                }
            }

            if(node.next != null && node.prev!=null){
                node.next.prev = node.prev;
            }

            node.next = startNode;
            startNode = node;
        }else{
            // cache key == null
            if(cache.size() < capacity){
                Node node = new Node();
                node.key = key;
                node.value = value;
                if(startNode!=null){
                    startNode.prev = node;
                }
                node.next = startNode;
                startNode = node;
                if(endNode == null){
                    endNode = node;
                }
                cache.put(key, node);
            }else{
                if(endNode != null){
                    cache.remove(endNode.key);
                    endNode = endNode.prev;
                    if(endNode !=null){
                        endNode.next = null;
                    }
                }
                Node node = new Node();
                node.value = value;
                node.key = key;
                if(startNode != null){
                    startNode.prev = node;
                }
                node.next = startNode;
                startNode = node;
                cache.put(key, node);
            }
        }
    }

    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(){}
        Node(int value, Node prev, Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(10);
        lRUCache.put(10, 13);
        lRUCache.put(3, 17);
        lRUCache.put(6, 11);
        lRUCache.put(10, 5);
        lRUCache.put(9, 10);
        lRUCache.put(13, 10);
        System.out.println(lRUCache.get(13));
        lRUCache.put(2, 19);
        System.out.println(lRUCache.get(2));
        System.out.println(lRUCache.get(3));
        lRUCache.put(5, 25);
        System.out.println(lRUCache.get(8));
        lRUCache.put(9, 22);
        lRUCache.put(5, 5);
        lRUCache.put(1, 30);
        System.out.println(lRUCache.get(11));
        lRUCache.put(9, 12);
        System.out.println(lRUCache.get(7));
        System.out.println(lRUCache.get(5));
        System.out.println(lRUCache.get(8));
        System.out.println(lRUCache.get(9));
        lRUCache.put(4, 30);
        lRUCache.put(9, 3);
        System.out.println(lRUCache.get(9));
        System.out.println(lRUCache.get(10));
        System.out.println(lRUCache.get(6));
        lRUCache.put(3, 1);
        System.out.println(lRUCache.get(3));
        lRUCache.put(10, 11);
        System.out.println(lRUCache.get(8));
        lRUCache.put(2, 14);
        System.out.println(lRUCache.get(1));
        System.out.println(lRUCache.get(5));
        System.out.println(lRUCache.get(4));
        lRUCache.put(11, 4);
        lRUCache.put(12, 24);
        lRUCache.put(5, 18);
        System.out.println(lRUCache.get(13));
        lRUCache.put(7, 23);
        lRUCache.put(8, 17);
        lRUCache.put(9, 29);
        System.out.println(lRUCache.get(5));
        lRUCache.put(3, 4);
        System.out.println(lRUCache.get(11));
        lRUCache.put(12, 17);
        System.out.println(lRUCache.get(9));
        lRUCache.put(6, 19);
        System.out.println(lRUCache.get(4));
        System.out.println(lRUCache.get(5));
        System.out.println(lRUCache.get(5));
        lRUCache.put(8, 1);
        lRUCache.put(11, 7);
        lRUCache.put(5, 2);
        lRUCache.put(9, 28);
        System.out.println(lRUCache.get(1));
        lRUCache.put(2, 2);
        lRUCache.put(7, 4);
        lRUCache.put(4, 22);
        lRUCache.put(7, 24);
        lRUCache.put(9, 26);
        lRUCache.put(13, 28);
        lRUCache.put(11, 26);




    }
}
