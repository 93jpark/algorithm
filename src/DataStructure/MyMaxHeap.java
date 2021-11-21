package DataStructure;

public class MyMaxHeap {

    public MyNode head;
    public Integer size;

    public MyMaxHeap() {
        this.head = null;
        this.size = 0;
    }

    public MyMaxHeap(Integer data) {
        this.head = new MyNode(data);
        this.size = 1;
    }


}
