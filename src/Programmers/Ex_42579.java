package Programmers;
import java.util.*;

/**
 * 프로그래머스 베스트 앨범
 * 해시
 * https://programmers.co.kr/learn/courses/30/lessons/42579
 */
public class Ex_42579 {
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = new int[4];
        Queue<Integer> queue = new LinkedList<>();

        ArrayList<Node> nodes = new ArrayList<>(); // store all genre, index, play# in one object
        LinkedList<Node> genreList = new LinkedList<>(); // sorted array for genre based on # of genre's plays
        HashMap<String, Integer> map = new HashMap<>(); // genereList store [genre-sum of plays] pairs
        HashMap<String, Integer> count = new HashMap<>();


        for (int i = 0; i < plays.length; i++) {
            String genre = genres[i];
            Integer play = plays[i];
            Integer idx = i;
            nodes.add(new Node(genre, play, idx));

            // get all sums for its genres
            map.put(genre, map.getOrDefault(genre, 0)+play);
        }

        Collections.sort(nodes, Collections.reverseOrder());


        for(String s : map.keySet()) {
            genreList.add(new Node(s,map.get(s),2));
            count.put(s, 2);
        }
        Collections.sort(genreList, Collections.reverseOrder());

        // set up genere List for sorted array


        for(int i=0; i<nodes.size(); i++) {
            int index = (int)nodes.get(i).idx;
        }

        int cursor = 0;

        for (int i = 0; i < genreList.size()*2; i++) {
            int input_count = 0;
            for(int n=0; n < nodes.size(); n++) {
                if (genreList.get(cursor).genre == nodes.get(n).genre) {
                    queue.add(nodes.get(n).idx);
                    input_count++;
                }
                if (input_count == 2) {
                    cursor++;
                    break;
                }
            }
            if(cursor == genreList.size()-1) {
                break;
            }
        }
        answer = queue.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static class Node implements Comparable<Node> {
        String genre;
        Integer plays;
        Integer idx;

        public Node(String genre, Integer plays, Integer idx) {
            this.genre = genre;
            this.plays = plays;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node o) {
            if(this.plays == null || o.plays == null) {
                return 0;
            }
            return this.plays.compareTo(o.plays);
        }

        public String toString() {
            return idx+":"+genre+":"+plays;
        }
    }

    public static void main(String[] args) {
        String[] genres = new String[]{"classic","pop","classic","classic","pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500}; //

        for(int i : solution(genres, plays)) {
            System.out.println("     "+ i);
        }


    }
}
