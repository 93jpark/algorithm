package Programmers;

import java.util.*;

import static Programmers.Q1.Solution.solution;

/**
 *
 *



 */

public class Q1 {
    static class Solution {

        static class Node {
            int key;
            int value;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        public static int[][] solution(int[][] dist) {
            int numLength = dist[0].length;
            int[][] answer = new int [2][numLength];

            HashMap<Integer, Node> hm = new HashMap<>();

            for(int row=0; row<dist.length; row++) {
                int rowSum = 0;
                for(int col=0; col<dist[0].length; col++) {
                    rowSum += dist[row][col];
                }
                hm.put(row, new Node(row, rowSum));
            }

            Queue<Node> queue = new LinkedList<Node>();

            while(!hm.isEmpty()) {
                int targetKey = -1;
                int max = -1;
                Integer[] array = hm.keySet().toArray(new Integer[0]);
                for(int i=0; i<hm.size(); i++) {
                    Node n = hm.get(array[i]);
                    if (n.value > max) {
                        max = n.value;
                        targetKey = n.key;
                    }
                }
                queue.add(hm.get(targetKey));
                hm.remove(targetKey);
            }


            for(int i=0; i<numLength/2; i++) {
                if(i==0) {
                    answer[0][i] = queue.poll().key;
                    answer[0][numLength - 1 - i] = queue.poll().key;
                } else {
                    int first = queue.poll().key; // 3
                    int second = queue.poll().key; // 1
                    int n = answer[0][0]; // 기준 0

                    if(dist[n][first]+dist[second][first] == dist[second][first]){
                        answer[0][i] = first;
                        answer[0][numLength-1-i] = second;
                    } else {
                        answer[0][i] = second;
                        answer[0][numLength-1-i] = first;
                    }
                }
            }
            if(numLength%2 == 1) {
                answer[0][(numLength/2)] = queue.poll().key;
            }


            int idx = 0;
            for(int i=answer[0].length-1; i>=0; i--) {
                answer[1][idx++] = answer[0][i];
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        int[][] dist1 = new int[][]{{0,5,2,4,1},{5,0,3,9,6},{2,3,0,6,3},{4,9,6,0,3},{1,6,3,3,0}};
        int[][] result1 = new int[][]{{1,2,0,4,3},{3,4,0,2,1}};

        int[][] dist2 = new int[][]{{0,2,3,1},{2,0,1,1},{3,1,0,2},{1,1,2,0}};
        int[][] result = new int[][]{{0,3,1,2},{2,1,3,0}};

        for(int[] a : solution(dist1)) {
            for(int n : a) {
                System.out.print(n);
            }
            System.out.println();
        };

    }
}
