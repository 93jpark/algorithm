package DataStructure;

public class MyNode {
    public MyNode left;
    public MyNode right;
    public Integer value;

    public MyNode(int data) {
        this.value = data;
        this.left = null;
        this.right = null;
    }

    public void print() {
        System.out.println("--------------------------");
        System.out.println("this node's value is " + this.value);
        if(this.left != null) {
            System.out.println("left side is " + this.left.value);
        } else {
            System.out.println("left side is empty.");
        }
         if(this.right != null) {
             System.out.println("right side is " + this.right.value);
         } else {
             System.out.println("right side is empty.");
         }

        System.out.println("--------------------------");

    }
}
