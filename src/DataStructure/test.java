package DataStructure;


public class test {
    public static void main(String[] args) {

        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(8);
        bst.insert(12);
        bst.insert(16);

        bst.inorder(bst.root);

        bst.search(15).print();
        bst.search(10).print();
        bst.search(20).print();
        bst.search(8).print();
        bst.search(12).print();

    }
}
