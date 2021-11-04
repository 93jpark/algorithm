package DataStructure;
import java.util.*;

public class MyOpenHash {
    Slot[] hashTable;

    public MyOpenHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String data;
        LinkedList<Pair> datalist;

        public Slot(String key, String value) {
            this.datalist = new LinkedList<Pair>();
            this.datalist.add(new Pair(key, value));
        }

        public boolean add(String key, String value) {
            if(this.datalist != null) {
                this.datalist.add(new Pair(key, value));
                return true;
            } else {
                return false;
            }
        }

        public String search(String key) {
            if(this.datalist != null) {
                int len = this.datalist.size();
                for(int i = 0; i < len; i++) {
                    if(this.datalist.get(i).key == key) {
                        return this.datalist.get(i).value;
                    }
                }
            }
            return null;
        }

        class Pair {
            String key, value;
            public Pair(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }

    }

    public Integer hashFunc(String key) {
        return (int)key.charAt(0) % this.hashTable.length;
    }

    public boolean save(String key, String value) {
        Integer idx = hashFunc(key);
        if(this.hashTable[idx] != null) {
            this.hashTable[idx].add(key, value);
        } else {
            this.hashTable[idx] = new Slot(key, value);
        }
        return true;
    }

    public Object get(String key) {
        Integer idx = hashFunc(key);
        if(this.hashTable[idx] != null) {
            return this.hashTable[idx].search(key);
        } else {
            return null;
        }
    }


}
