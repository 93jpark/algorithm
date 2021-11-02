package DataStructure;

import java.util.*;

public class MyQueue<T> {

    private ArrayList<T> queue = new ArrayList<T>();

    public boolean enqueue(T item) {
        this.queue.add(item);
        return true;
    }

    public T dequeue() {
        if(this.queue.isEmpty()) {
            return null;
        } else {
            return this.queue.remove(this.queue.size()-1);
        }
    }
}
