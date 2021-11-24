package DataStructure;

import com.sun.security.jgss.GSSUtil;

import java.util.*;


     /*
                                example
        current node: i        - 0, 3
        parent: (i-1)/2        - 1, 1
        left child: (i*2)+1    - 3, 7
        right child: (i*2)+2   - 4, 8
     */

public class MyMaxHeap {

    public LinkedList<Integer> heap; // heap to store data
    public Integer size; // current heap size

    public MyMaxHeap() {
        this.heap = new LinkedList<>();
        this.size = 0;
    }

    public MyMaxHeap(Integer data) {
        this.heap = new LinkedList<>();
        this.heap.add(data);
        this.size = 1;
    }

    
    public boolean insert(Integer data) {
        int current = this.size;

        this.heap.add(data);
        this.heapify(current);
        this.size++;

        return true;
    }


    // validate heap rule
    public boolean validate() {
        for(int i = this.size-1; i >=0; i--) {
            int parent = this.getParentPos(i);
            if(this.heap.get(parent) < this.heap.get(i)) {
                System.out.println("parent("+parent+" index)'s value "+this.heap.get(parent)+" is less against "+i+" index's "+this.heap.get(i));
                return false;
            }
        }
        return true;
    }

    public boolean heapify(int pos) {
        if(pos == 0) {
            System.out.println("Heapify done");
            return true;
        }
        /*
        System.out.println("--------------------------");
        System.out.println("current pos is "+ pos);
        System.out.println("parent pos is "+ this.getParentPos(pos));
        System.out.println("--------------------------");
        */
        int current = this.heap.get(pos);
        int parent = this.heap.get(this.getParentPos(pos));
        if(current > parent) {
            swap(pos, this.getParentPos(pos));
            heapify(this.getParentPos(pos));
        }




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

        //System.out.println(posA+"'s "+this.heap.get(posA)+" is swapped with "+posB+"'s "+this.heap.get(posB));
        return true;
    }

    public boolean isLeaf(int pos) {
        int lpos = this.getLeftPos(pos);
        int rpos = this.getRightPos(pos);
        if(lpos > this.size || rpos > this.size) {
            return true;
        }
        return false;
    }

    public Integer getParentPos(int pos) {
        return (pos-1)/2;
    }

    public Integer getLeftPos(int pos) {
        return (pos*2)+1;
    }

    public Integer getRightPos(int pos) {
        return (pos*2)+2;
    }

    public String toString() {
        return this.heap.toString();
    }
}
