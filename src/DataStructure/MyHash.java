package DataStructure;

public class MyHash {
    Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String data;
        public Slot(String data) {
            this.data = data;
        }
    }

    // get key as input and return hash table index address as integer
    public Integer hashFunc(String key) {
        return (int)key.charAt(0) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        int idx = hashFunc(key);
        if (this.hashTable[idx] != null) {
            this.hashTable[idx].data = value;
        } else {
            this.hashTable[idx] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        int idx = hashFunc(key);
        if(this.hashTable[idx] != null) {
            return this.hashTable[idx].data;
        } else {
            return null;
        }

    }
}
