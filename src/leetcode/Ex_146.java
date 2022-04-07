package leetcode;

import java.util.HashMap;

public class Ex_146 {
    static class LRUCache {

        final private int maxCapacity;
        private final HashMap<Integer, Node> cache; // store key & key-value Node
        private final DoubleLinkedList frequency; // store key history

        public static class DoubleLinkedList {

            public int size = 0;
            public Node head;
            public Node tail;

            // init DoubleLinked List with empty head and tail Node
            public DoubleLinkedList() {
                this.head = new Node(null, null);
                this.tail = new Node(null, null);

                this.head.next = this.tail;
                this.head.prev = this.tail;

                this.tail.next = this.head;
                this.tail.prev = this.head;
            }

            /**
             * add new node on head's next position
             * @param newNode
             */
            public void insert(Node newNode) {

                Node secNode = this.head.next;
                this.head.next = newNode;
                newNode.next = secNode;
                secNode.prev = newNode;
                newNode.prev = this.head;
                size++;
            }

            /**
             * remove last node in frequency list
             * @return
             */
            public Node cutoff() {
                Node target = this.tail.prev;
                Node end = target.prev;
                end.next = this.tail;
                this.tail.prev = end;
                size--;
                return target;
            }

            public void iterate() {
                if(size==0) {
                    System.out.println("EMPTY");
                } else {
                    Node cursor = this.head.next;
                    while(!cursor.equals(this.tail)) {
                        System.out.print("{"+cursor.key+":"+cursor.value+"} ");
                        cursor = cursor.next;
                    }
                }
                System.out.println();

            }

        }

        public static class Node {
            private Integer key;
            private Integer value;
            private Node next;
            private Node prev;

            public Node(Integer key, Integer value) {
                this.key = key;
                this.value = value;
            }

            public String toString() {
                return "{"+this.key+":"+this.value+"}";
            }
        }

        /**
         * initialize LRU cache with positive size capacity
         * @param capacity
         */
        public LRUCache(int capacity) {
            if(capacity < 1) {
                throw new IllegalArgumentException("Invalid input");
            } else {
                this.cache = new HashMap<>();
                this.frequency = new DoubleLinkedList();
                this.maxCapacity = capacity;
            }
        }



        /**
         * Update value of key if key exists.
         * Otherwise, add key-value pair to cache.
         * If number of keys exceeds capacity from this operation, evict the least recently used key.
         * @param key
         * @param value
         */
        public void put(int key, int value) {

            if(cache.containsKey(key) || cache.keySet().size() < this.maxCapacity) {
                // when cache is not full
                if(cache.containsKey(key)) {
                    cache.get(key).value = value;
                    update(cache.get(key));
                    frequency.head.next.value = value;
                } else {
                    Node newNode = new Node(key, value);
                    cache.put(key, newNode);
                    frequency.insert(newNode);
                }

            } else {
                // when the cache capacity is full
                Node deletedNode = frequency.cutoff();
                cache.remove(deletedNode.key);

                // store new key-value pair on map and update frequency map
                Node newNode = new Node(key, value);
                cache.put(key, newNode);
                frequency.insert(newNode);

            }
        }

        /**
         * update the most recent used node in frequency list with most front node
         * @param target
         */
        public void update(Node target) {
            if(this.frequency.size > 1) {

                Node front = this.frequency.head.next;

                if(target.key != front.key) {

                    target.prev.next = target.next;
                    target.next.prev = target.prev;

                    this.frequency.insert(target);
                }
            }
        }

        /**
         * return value of key if key exists, otherwise return -1
         * @param key
         * @return
         */
        public int get(int key) {
            if(cache.containsKey(key)) {
                update(cache.get(key));
                return cache.get(key).value;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {

        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4

        System.out.println();

        LRUCache lRUCache2 = new LRUCache(2);
        lRUCache2.get(2);    // -1
        lRUCache2.put(2, 6); //
        lRUCache2.get(1);    // -1
        lRUCache2.put(1, 5); //
        System.out.println(lRUCache2.cache);
        lRUCache2.put(1, 2); //
        System.out.println(lRUCache2.cache);
        lRUCache2.get(1);    // 2
        lRUCache2.get(2);    // 6

        System.out.println();

        LRUCache lruCache3 = new LRUCache(2);
        lruCache3.put(2,1);
        lruCache3.put(1,1);
        lruCache3.put(2,3);
        lruCache3.put(4,1);
        lruCache3.get(1);
        lruCache3.get(2);

        System.out.println("\n\nlruCache4");
        LRUCache lruCache4 = new LRUCache(3);
        lruCache4.put(1,1);
        lruCache4.put(2,2);
        lruCache4.put(3,3);
        lruCache4.put(4,4);
        lruCache4.frequency.iterate();
        lruCache4.get(4); // 4
        lruCache4.frequency.iterate();
        lruCache4.get(3); // 3
        lruCache4.frequency.iterate();
        lruCache4.get(2); // 2
        lruCache4.frequency.iterate();
        lruCache4.get(1); // -1
        lruCache4.frequency.iterate(); // 2 3 4
        lruCache4.put(5,5);
        lruCache4.frequency.iterate(); // 5 2 3

        lruCache4.get(1); // -1
        lruCache4.get(2); // 2
        System.out.println(lruCache4.cache);
        lruCache4.get(3); // 3
        lruCache4.get(4); // -1
        lruCache4.get(5); // 5







    }
}
