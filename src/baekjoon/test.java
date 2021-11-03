package baekjoon;

import java.util.*;
import DataStructure.MyQueue;
import DataStructure.MyStack;
import DataStructure.MySingleLinkedList;
import DataStructure.MyDoubleLinkedList;


public class test {
    public static void main(String[] args) {
        MyDoubleLinkedList<String> msl = new MyDoubleLinkedList<String>();
        msl.addNode("Hello");
        msl.addNode("World");
        msl.addNode("Bye");

        msl.printAll();
        msl.addNode("addNodeTest", "World");
        msl.printAll();
        msl.addNode("addNodeTest", "World");
        msl.printAll();

        msl.delNode("addNodeTest");
        msl.printAll();


    }

}
