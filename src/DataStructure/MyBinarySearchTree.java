package DataStructure;

public class MyBinarySearchTree {

    public MyNode head;
    public Integer size;

    public MyBinarySearchTree() {
        this.head = null;
        this.size = 0;
    }

    public boolean insert(Integer data) {
        MyNode newNode = new MyNode(data);
        MyNode target = this.head;
        // case 1 : nothing stored
            if (head == null) {
                System.out.println("new data " + data + " is stored on head");
                this.head = newNode;
                size++;
            } else {
                while(true) {
                    System.out.println("now checking .. " + target.value);
                    // case 2 : node value is greater than new data
                    if (target.value > data) {
                        if(target.left == null) {
                            System.out.println("new data " + data + " is stored");
                            target.left = newNode;
                            break;
                        } else {
                            target = target.left;
                        }
                        // case 3 : node value is less or equal with new data
                    } else {
                        if(target.right == null) {
                            System.out.println("new data " + data + " is stored");
                            target.right = newNode;
                            break;
                        } else {
                            target = target.right;
                        }
                    }
                }


        }
        return false;
    }
}
