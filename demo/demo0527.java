package demo;

import java.util.HashMap;

public class demo0527 {
}
class LRUCache {
    class DLinkedNode {
        int key;
        int val;
        DLinkedNode prev;
        DLinkedNode next;

        DLinkedNode() {
        }

        DLinkedNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    HashMap<Integer, DLinkedNode> map = new HashMap<>();
    int size, capacity;
    DLinkedNode head = new DLinkedNode(), tail = new DLinkedNode();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        head.next = tail;
        tail.next = head;
    }

    public int get(int key) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        }

        moveToHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if (node == null) {
            DLinkedNode newNode = new DLinkedNode(key, value);
            map.put(key, newNode);
            addToHead(newNode);
            size++;
            if (size > capacity) {
                DLinkedNode tmp = removeTail();
                map.remove(tmp.key);
                size--;
            }
        } else {
            node.val=value;
            moveToHead(node);
        }
    }

    void addToHead(DLinkedNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    DLinkedNode removeTail() {
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }

    void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public static void main(String[] args) {
        LRUCache cache =new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        //Thread thread =new Thread(()->{
        //    System.out.println("线程运行中");
        //});
        //thread.start();
        //System.out.println(thread.getName());
     }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */