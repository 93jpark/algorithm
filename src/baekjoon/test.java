package baekjoon;

import java.util.*;
import DataStructure.*;

public class test {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(10);
        bst.insert(9);
        bst.insert(8);
        bst.insert(11);

        System.out.println(bst.head.value);
    }
}
