package DataStructure;

public class MyBinarySearchTree {

    public MyNode root;
    public Integer size;

    public MyBinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    // Function to perform inorder traversal on the BST
    public void inorder(MyNode root)
    {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public boolean insert(Integer data) {
        MyNode newNode = new MyNode(data);
        MyNode cursor = this.root;
        // case 1 : nothing stored in tree
        if (root == null) {
            this.root = newNode;
            size++;
        } else {
            // case 2 : at least one node exists in tree
            while (true) {
                // case 2-1 : node value is greater than new data
                if (cursor.value > data) {
                    if (cursor.left == null) {
                        cursor.left = newNode;
                        return true;
                    } else {
                        cursor = cursor.left;
                    }
                    // case 2-2 : node value is less or equal with new data
                } else {
                    if (cursor.right == null) {
                        cursor.right = newNode;
                        return true;
                    } else {
                        cursor = cursor.right;
                    }
                }
            }
        }
        return false;
    }

    public MyNode search(Integer data) {
        MyNode cursor = this.root;

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


    public MyNode remove(MyNode root, int data) {
        MyNode parent = null;
        MyNode cursor = root;

        // ????????? ???????????? ????????? ??????????????? ??????????????? ??????
        while (cursor != null && cursor.value != data) {
            parent = cursor;
            if(data < cursor.value) {
                cursor = cursor.left;
            } else {
                cursor = cursor.right;
            }
        }

        // ???????????? ???????????? ?????? ??????
        if(cursor == null) {
            System.out.println(data+" not exists");
            return null;
        }

        // ????????? ????????? ??????????????? ?????? ??????
        if(cursor.left == null && cursor.right == null) {
            if(cursor != root) {
                if(parent.left == cursor) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else {
                root = null;
            }
        }

        // ????????? ????????? ????????? ?????? ????????? ?????? ??????
        else if (cursor.left != null && cursor.right != null) {
            // ????????? ????????? ??? ???????????? ????????? ?????? ?????? ?????? ????????? ?????????.
            MyNode temp = findMinNode(cursor.right);
            int tempValue = temp.value;

            // ????????? ????????? ?????? ???, ????????? ????????? ???????????? ????????????.
            remove(root, temp.value);
            cursor.value = tempValue;
        }

        // ????????? ????????? ????????? ????????? ?????? ??????
        else {
            MyNode child = (cursor.left != null) ? cursor.left : cursor.right;

            if(cursor != root) {
                if(cursor == parent.left) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            } else {
                root = child;
            }
        }

        return root;
    }

    MyNode findMinNode(MyNode cursor) {
        while (cursor != null) {
            cursor = cursor.left;
        }
        return cursor;
    }



}
