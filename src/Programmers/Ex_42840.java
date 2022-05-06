package Programmers;

import java.util.Collections;
import java.util.LinkedList;

public class Ex_42840 {
    public static int[] solution(int[] answers) {
        int[] answer = new int[3];

        /*
            1번 수포자가 찍는 방식: 1, 2, 3, 4, 5
            2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5
            3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
         */

        int[][] supo = new int[3][];

        supo[0] = new int[] {1,2,3,4,5};
        supo[1] = new int[] {2,1,2,3,2,4,2,5};
        supo[2] = new int[] {3,3,1,1,2,2,4,4,5,5};

        for(int i=0; i<supo.length; i++) {
            for(int j=0; j<supo[i].length; j++) {
                int idx = supo[i].length;
                if(supo[i][j] == answers[j % answers.length]) answer[i]++;
            }
        }

        LinkedList<Node> list = new LinkedList<>();

        for(int i=0; i<answer.length; i++) {
            Node n = new Node(i, answer[i]);
            list.add(n);
        }

        Collections.sort(list);
        Collections.reverse(list);

        LinkedList<Integer> result = new LinkedList<>();

        int max = list.get(0).getNum();

        for(Node n : list) {
            if(n.getNum() == max) result.add(n.getIdx());
        }

        Collections.sort(result);

        answer = new int[result.size()];

        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i)+1;
        }


        return answer;
    }

    public static class Node implements Comparable<Node> {
        Integer idx;
        Integer num;

        public Node(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }

        public Integer getIdx() {
            return idx;
        }

        public void setIdx(int idx) {
            this.idx = idx;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "idx=" + idx +
                    ", num=" + num +
                    '}';
        }

        @Override
        public int compareTo(Node o) {
            if (this.getNum() == null || o.getNum() == null) {
                o.getNum();
            }
            return this.getNum().compareTo(o.getNum());

        }
    }

    public static void main(String[] args) {

        int[] answers = new int[] {1,2,3,4,5};
        for(int i: solution(answers)) {
            System.out.println(i);
        }

        System.out.println();

        answers = new int[] {1,3,2,4,2};
        for(int i: solution(answers)) {
            System.out.println(i);
        }
    }
}
