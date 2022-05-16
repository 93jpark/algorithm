package Programmers;

/*
    레벨 1
    문자열 내 마음대로 정렬하기
 */

import java.util.*;

public class Ex_12915 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        LinkedList<String> list = new LinkedList<>();

        for(String s : strings) {
            list.add(s);
        }

        Collections.sort(list);

        LinkedList<Node> nodeList = new LinkedList<>();

        for(String s : list) {
            Node node = new Node(s.charAt(n), s);
            nodeList.add(node);
        }
        Collections.sort(nodeList);


        for(int i=0; i< nodeList.size(); i++) {
            answer[i] = nodeList.get(i).getString();
        }

        return answer;
    }

    public static class Node implements Comparable<Node> {
        private Character targetLetter;
        private String string;

        public Node(Character targetLetter, String string) {
            this.targetLetter = targetLetter;
            this.string = string;
        }

        public Character getTargetLetter() {
            return targetLetter;
        }

        public void setTargetLetter(char targetLetter) {
            this.targetLetter = targetLetter;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }


        @Override
        public int compareTo(Node n) {
            if (getTargetLetter() == null || n.getTargetLetter() == null) {
                return 0;
            }
            return getTargetLetter().compareTo(n.getTargetLetter());

        }

    }

    public static LinkedList<String> sortList(LinkedList<String> list) {


        return null;
    }

    public static void main(String[] args) {

        String[] strings = new String[]{"sun", "bed", "car"};

        for(String s : solution(strings, 1)) {
            System.out.print(s+" ");
        }
        System.out.println(); // "car", "bed", "sun"

        strings = new String[]{"abce", "abcd", "cdx"};

        for(String s : solution(strings, 1)) {
            System.out.print(s+" ");
        }
        System.out.println(); // "abcd", "abce", "cdx"
    }
}
