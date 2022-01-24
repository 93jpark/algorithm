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

        // 커서가 데이터를 찾거나 종단노드에 닿을때까지 이동
        while (cursor != null && cursor.value != data) {
            parent = cursor;
            if(data < cursor.value) {
                cursor = cursor.left;
            } else {
                cursor = cursor.right;
            }
        }

        // 데이터가 존재하지 않는 경우
        if(cursor == null) {
            System.out.println(data+" not exists");
            return null;
        }

        // 삭제될 노드가 자식노드가 없는 경우
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

        // 삭제될 노드가 두개의 자식 노드를 지닌 경우
        else if (cursor.left != null && cursor.right != null) {
            // 삭제될 노드와 그 부모노드 사이의 최소 값을 지닌 노드를 찾는다.
            MyNode temp = findMinNode(cursor.right);
            int tempValue = temp.value;

            // 최소값 노드를 삭제 후, 삭제될 노드에 최소값을 삽입한다.
            remove(root, temp.value);
            cursor.value = tempValue;
        }

        // 삭제될 노드가 한개의 자식만 지닌 경우
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
