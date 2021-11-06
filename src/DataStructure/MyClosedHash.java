package DataStructure;

public class MyClosedHash {
    Slot[] hashTable;


    public MyClosedHash(Integer size) {
        this.hashTable = new Slot[size*1];
    }

    public class Slot {
        String key, value;
        public Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public Integer hashFunc(String key) {
        return (int)key.charAt(0) % (this.hashTable.length);
    }

    public boolean set(String key, String value) {
        int idx = this.hashFunc(key);
        int count = 0;
        if(this.hashTable[idx] != null) {

            // update existing key-value Slot
            if(this.hashTable[idx].key==key) {
                this.hashTable[idx].value = value;
                return true;
            } else {
                int cursor = idx+1;
                while(this.hashTable[cursor] != null) {
                    // update existing key-value Slot
                    if(this.hashTable[cursor].key == key) {
                        this.hashTable[cursor].value = value;
                        return true;
                    } else {
                        cursor++;
                        count++;
                        // initialize index cursor to iterate from beginning of array.
                        if(cursor >= this.hashTable.length) {
                            cursor = 0;
                        }
                        // iterated all slot array, but fail to find empty place to store data.
                        if(count >= this.hashTable.length) {
                            return false;
                        }
                    }
                }
                this.hashTable[cursor] = new Slot(key, value);
                return true;
            }
        } else {
            this.hashTable[idx] = new Slot(key, value);
            return true;
        }
    }

    public String get(String key) {
        int idx = this.hashFunc(key);
        int count = 0;
        if(this.hashTable[idx] != null) {
            if(this.hashTable[idx].key == key) {
                return this.hashTable[idx].value;
            } else {
                int cursor = idx+1;
                while(this.hashTable[cursor] != null) {
                    if(this.hashTable[cursor].key == key){
                        return this.hashTable[cursor].value;
                    } else {
                        cursor++;
                        count++;
                        // initialize index cursor to iterate from beginning of array.
                        if(cursor >= this.hashTable.length) {
                            cursor = 0;
                        }
                        // iterated all slot array, but fail to find empty place to store data.
                        if(count >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }
        } else {
            return null;
        }
    }

}
