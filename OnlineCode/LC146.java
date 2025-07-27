package OnlineCode;
import java.util.HashMap;
import java.util.Map;
class LRUCache{
    class DLinkedNode{
        int key;
        int val;
        DLinkedNode next;
        DLinkedNode prev;
        DLinkedNode(){}
        DLinkedNode(int key,int val){
            this.key=key;
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }
    int capacity,size;
    DLinkedNode head=new DLinkedNode();
    DLinkedNode tail=new DLinkedNode();
    LRUCache(int capacity){
        this.capacity=capacity;
        this.size=0;
        head.next=tail;
        tail.prev=head;
    }
    Map<Integer,DLinkedNode>map=new HashMap<>();
    void put(int key,int val){
        DLinkedNode node=map.get(key);
        if(node==null){
            DLinkedNode tmp = new DLinkedNode(key,val);
            map.put(key,tmp);
            addToNode(tmp);
            size++;
            if(size>capacity){
                DLinkedNode c= removeTail();
                map.remove(c.key);
                size--;
            }
        }else{
            node.val=val;
            moveToHead(node);
        }
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToNode(node);
    }

    private void addToNode(DLinkedNode node) {
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private DLinkedNode removeTail() {
        DLinkedNode result=tail.prev;
        removeNode(result);
        return result;
    }

    int get(int key){
        DLinkedNode node=map.get(key);
        if(node==null)return -1;

        moveToHead(node);
        return node.val;
    }
}

public class LC146 {
    public static void main(String[] args) {
        LRUCache cache=new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));
    }
}
