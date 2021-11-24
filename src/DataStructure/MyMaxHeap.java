package DataStructure;


import java.util.*;


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
        int current = this.size; // 7
        this.heap.add(data);
        this.size++;

        // reversed heapify process
        // from bottom to top
        while (current != 0) {
            if(this.heap.get(current) > this.heap.get(this.getParentPos(current))) {
                swap(current, this.getParentPos(current));
            }

            current = this.getParentPos(current);
        }


        return true;
    }


    public Integer extractMax() {
        if(this.size == 0) {
            System.out.println("Heap is empty");
            return null;
        }
        int max = this.heap.get(0);
        int index = 0;
        this.swap(0, this.size-1);
        this.heap.remove(this.size-1);
        this.size--;
        this.heapify(0);

        return max;

    }

    // heapify from top to bottom
    public boolean heapify(int pos) {

        if (this.isLeaf(pos)) {
            return true;
        }

        //System.out.println("pos is " + pos+ " left :" + this.getLeftPos(pos)+" right: "+this.getRightPos(pos));

        // 왼쪽 자식 1개만 남아있는 경우,
        // 현재 노드와 왼쪽 자식노드만 비교해서 스왑이 필요한 경우엔 스왑 진행 후 종료
        if(this.getRightPos(pos) >= this.size) {
            if(this.heap.get(this.getLeftPos(pos)) > this.heap.get(pos)) {
                swap(pos, this.getLeftPos(pos));
            }
            return true;
        } else {
            // subtree에서 해당 Posisition을 기준으로 좌/우 자식 중 한쪽 이상이 더 크다면,
            if(this.heap.get(pos) < this.heap.get(this.getLeftPos(pos)) ||
                    this.heap.get(pos) < this.heap.get(this.getRightPos(pos)) ) {

                // 왼쪽 자식이 오른쪽보다 크다면
                if(this.heap.get(this.getLeftPos(pos)) > this.heap.get(this.getRightPos(pos))) {
                    if(this.heap.get(pos) < this.heap.get(this.getLeftPos(pos)) ) {
                        // 왼쪽 자식과 부모를 스왑한 후, 왼쪽 자식을 기준으로 다시 heapify
                        swap(pos,this.getLeftPos(pos));
                        heapify(this.getLeftPos(pos));
                    }
                } else {
                    // 왼쪽 자식이 더 크다면
                    if (this.heap.get(pos) < this.heap.get(this.getRightPos(pos)) ) {
                        swap(pos, this.getRightPos(pos));
                        heapify(this.getRightPos(pos));
                    }
                }
            }
        }



        return true;
    }

    public boolean swap(int posA, int posB) {
        if(posA > this.size || posB > this.size) {
            if(posA > this.size) {
                System.out.println(posA + " is out of range A");
            }
            if(posB > this.size) {
                System.out.println(posB + " is out of range B");
            }
            System.out.println("Failed to swap");
        }

        int tmp = this.heap.get(posA);
        this.heap.set(posA, this.heap.get(posB));
        this.heap.set(posB, tmp);
        return true;
    }


    public Integer getMax() {
        if(this.size == 0) {
            System.out.println("Heap is empty");
            return null;
        }
        return this.heap.get(0);
    }

    public boolean isLeaf(int pos) {
        if(this.getLeftPos(pos)>=this.size && this.getRightPos(pos) >= size) {
            return true;
        }
        return false;
    }
        /*
                                   example
            current node: i        - 0, 3
            parent: (i-1)/2        - 1, 1
            left child: (i*2)+1    - 3, 7
            right child: (i*2)+2   - 4, 8
         */
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

    public void print() {
        System.out.println(this.toString());
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
}
