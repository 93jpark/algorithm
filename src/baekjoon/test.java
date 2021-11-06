package baekjoon;

import java.util.*;
import DataStructure.*;

public class test {
    public static void main(String[] args) {
        MyClosedHash myHash = new MyClosedHash(20);
        myHash.set("DaveLee", "01022223333");
        myHash.set("fun-coding", "01033334444");
        myHash.set("David", "01044445555");
        myHash.set("Dave", "01055556666");

        System.out.println(myHash.get("Dave"));
        System.out.println(myHash.get("David"));
        System.out.println(myHash.get("DaveLee"));


    }
}
