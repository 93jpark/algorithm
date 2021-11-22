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
        // case 1 : nothing stored in tree
        if (head == null) {
            System.out.println("new data " + data + " is stored on head");
            this.head = newNode;
            size++;
        } else {
            // case 2 : at least one node exists in tree
            while (true) {
                System.out.println("now checking .. " + target.value);
                // case 2-1 : node value is greater than new data
                if (target.value > data) {
                    if (target.left == null) {
                        System.out.println("new data " + data + " is stored");
                        target.left = newNode;
                        return true;
                    } else {
                        target = target.left;
                    }
                    // case 2-2 : node value is less or equal with new data
                } else {
                    if (target.right == null) {
                        System.out.println("new data " + data + " is stored");
                        target.right = newNode;
                        return true;
                    } else {
                        target = target.right;
                    }
                }
            }
        }
        return false;
    }

    public MyNode search(Integer data) {
        MyNode cursor = this.head;

        while(true) {
            if(cursor == null) {
                System.out.println(data+" not exists");
                return null;
            }

            if(cursor.value == data) {
                return cursor;
            } else {
                if(data > cursor.value) {
                    cursor = cursor.right;
                } else {
                    cursor = cursor.left;
                }
            }
        }


    }
}
