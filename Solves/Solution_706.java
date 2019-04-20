import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hanson on 2019/4/20
 *
 * @author Hanson
 * 2019/4/20
 * 706. Design HashMap
 * https://leetcode.com/problems/design-hashmap/
 */
public class Solution_706 {
    class MyHashMap {
        private static final int HASH_NUM = 128;
        private final LinkedNode[] nodes = new LinkedNode[HASH_NUM];


        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
        }

        /**
         * value will always be non-negative.
         */
        public void put(int key, int value) {
            int hash = hash(key);
            LinkedNode node = nodes[hash];
            if (node != null) {
                while (node.key != key && node.next != null) {
                    node = node.next;
                }
                if (node.key != key) {
                    node.next = new LinkedNode(key, value);
                } else {
                    node.value = value;
                }
            } else {
                nodes[hash] = new LinkedNode(key, value);
            }
        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
         */
        public int get(int key) {
            LinkedNode node = search(key);
            return node == null ? -1 : node.value;
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping for the key
         */
        public void remove(int key) {
            int hash = hash(key);
            LinkedNode node = nodes[hash];
            if (node != null) {
                if (node.key == key) {
                    if (node.next == null) {
                        nodes[hash] = null;
                    } else {
                        nodes[hash] = node.next;
                    }
                } else {
                    while (node.next != null && node.next.key != key) {
                        node = node.next;
                    }
                    if (node.next != null) {
                        node.next = node.next.next;
                    }
                }
            }
        }

        private LinkedNode search(int key) {
            int hash = hash(key);
            LinkedNode node = nodes[hash];

            while (node != null) {
                if (node.key == key) {
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        private int hash(int key) {
            return key % HASH_NUM;
        }

        class LinkedNode {
            public int key, value;
            public LinkedNode next;

            public LinkedNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
