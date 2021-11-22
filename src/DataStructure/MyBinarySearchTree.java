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

    public boolean remove(Integer data) {
        MyNode parentNode = this.head;
        MyNode cursorNode = this.head;


        // find out target node and its parent node
        while(true) {
            if(cursorNode == null) {
                System.out.println("CHECK");
                System.out.println(data+" not exists");
                return false;
            }

            if(cursorNode.value == data) {
                break;
            } else {
                parentNode = cursorNode;
                if(data > cursorNode.value) {
                    cursorNode = cursorNode.right;
                } else {
                    cursorNode = cursorNode.left;
                }
            }
        }


        // case a : leaf node delete
        if(cursorNode.left == null & cursorNode.right == null) {
            System.out.println("case a : leaf node delete");
            if(parentNode.value > data) {
                parentNode.left = null;
            } else {
                parentNode.right = null;
            }
        }

        // case b : only one child node
        if(cursorNode.left == null || cursorNode.right == null) {
            System.out.println("case b : only one child node");
            MyNode childNode;

            // find out which target node's child will be removed
            if(cursorNode.left == null) {
                System.out.println("child node is located on right side");
                childNode = cursorNode.right;
            } else {
                System.out.println("child node is located on left side");
                childNode = cursorNode.left;
            }

            // find out which target node will be removed from parent node
            if(parentNode.value > data) {
                System.out.println("parent's left child is replaced");
                parentNode.left = childNode;
                return true;
            } else {
                System.out.println("parent's right child is replaced");
                parentNode.right = childNode;
                return true;
            }
        }

        // case c : has max child node
        if(cursorNode.left != null && cursorNode.right != null) {
            System.out.println("case c : has both child nodes");
            // parent's left is cursor node
            if(parentNode.left == cursorNode) {
                parentNode.left = cursorNode.right;
                return true;
            } else {
                // parent's right is cursor node
                parentNode.right = cursorNode.right;
                return true;
            }
        }

        return true;
    }
}
