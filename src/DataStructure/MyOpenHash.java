package DataStructure;
import java.util.*;

public class MyOpenHash {
    // hash table is consists of multiple Slot.
    Slot[] hashTable;

    public MyOpenHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String key, value;
        Slot next;
        public Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public Integer hashFunc(String key) {
        return (int)key.charAt(0) % this.hashTable.length;
    }

    public boolean set(String key, String value) {
        Integer idx = hashFunc(key);
        if(this.hashTable[idx] != null) {
            Slot slot = this.hashTable[idx];
            Slot prev = this.hashTable[idx];
            while(slot != null) {
                if (slot.key == key) {
                    slot.value = value;
                    return true;
                } else {
                    prev = slot;
                    slot = slot.next;
                }
            }
            prev.next = new Slot(key, value);
            return true;
        } else {
            this.hashTable[idx] = new Slot(key, value);
        }
        return true;
    }

    public String get(String key) {
        Integer idx = hashFunc(key);

        if(this.hashTable[idx]!=null) {
            Slot cursor = this.hashTable[idx];
            while(cursor!=null){
                if(cursor.key == key) {
                    return cursor.value;
                } else {
                    cursor = cursor.next;
                }
            }
            return null;
        } else {
            return null;
        }

    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                System.out.println("@!");
                if (findSlot.key == key) {
                    System.out.println("1");
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            System.out.println("2");
            return null;
        } else {
            System.out.println("3");
            return null;
        }
    }


}
