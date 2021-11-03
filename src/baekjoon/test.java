package baekjoon;

import java.util.*;
import DataStructure.MyQueue;
import DataStructure.MyStack;
import DataStructure.MySingleLinkedList;

public class test {
    public static void main(String[] args) {
        MySingleLinkedList<String> msl = new MySingleLinkedList<String>();
        msl.addNode("Hello");
//        msl.addNode("World");
//        msl.addNode("Bye");
//
//        msl.printAll();
//        msl.addNodeBefore("beforeNodetest", "World");
//        msl.printAll();
//        msl.addNodeAfter("afterNodeTest", "World");
//        msl.printAll();

        msl.delNode("Hello");
        msl.printAll();


    }

}
