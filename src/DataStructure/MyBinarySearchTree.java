package DataStructure;

public class MyBinarySearchTree {

    MyNode head;
    Integer size;

    public MyBinarySearchTree() {
        this.head = null;
        this.size = 0;
    }

    public boolean insert(Integer data) {
        MyNode newNode = new MyNode(data);
        MyNode target = this.head;
        // case 1 : nothing stored
        while (true) {
            System.out.println("now checking .. " + target.value);
            if (target == null) {
                target = newNode;
                size++;
                break;
            } else {
                // case 2 : node value is greater than new data
                if (target.value > data) {
                    target = target.left;
                    // case 3 : node value is less or equal with new data
                } else {
                    target = target.right;
                }
            }
        }
        return false;
    }
}
