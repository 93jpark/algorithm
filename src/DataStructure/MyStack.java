package DataStructure;

import java.util.*;

public class MyStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T t) {
        try {
            this.stack.add(t);
        } catch (Exception e) {
            throw e;
        }
    }

    public T pop() {
        try {
            return this.stack.remove(this.stack.size()-1);
        } catch (Exception e) {
            throw e;
        }
    }
}
