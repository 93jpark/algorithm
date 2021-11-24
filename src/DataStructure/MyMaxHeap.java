package DataStructure;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class MyMaxHeap {

    public LinkedList<Integer> heap; // heap to store data
    public Integer size; // current heap size

    public MyMaxHeap() {
        this.heap = null;
        this.size = 0;
    }

    public MyMaxHeap(Integer data) {
        this.heap.add(data);
        this.size += 1;
    }

    
    public boolean insert(Integer data) {
        int current = this.size;

        this.heap.add(data);
        this.heapify();

        this.size++;

        return true;
    }
     /*
                                example
        current node: i        - 0, 3
        parent: (i-1)/2        - 1, 1
        left child: (i*2)+1    - 3, 7
        right child: (i*2)+2   - 4, 8
     */


    public boolean heapify() {


        return true;
    }

    public boolean swap(int posA, int posB) {

        if(posA > this.size || posB > this.size) {
            if(posA > this.size) {
                System.out.println(posA + " is out of range");
            }
            if(posB > this.size) {
                System.out.println(posB + " is out of range");
            }
            System.out.println("Failed to swap");
        }

        int tmp = this.heap.get(posA);
        this.heap.set(posA, this.heap.get(posB));
        this.heap.set(posB, tmp);

        System.out.println(posA+"'s "+this.heap.get(posA)+" is swapped with "+posB+"'s "+this.heap.get(posB));
        return true;
    }

    public boolean isLeaf(int pos) {
        int lpos = (pos*2) + 1;
        int rpos = (pos*2) + 2;
        if(lpos > this.size || rpos > this.size) {
            return true;
        }
        return false;
    }

}
