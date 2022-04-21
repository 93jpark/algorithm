package Programmers;

/**
 * 기능개발
 * 스택/큐
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */

import java.util.*;

public class Ex_42586 {

    public static int[] solution(int[] progresses, int[] speeds) {

        LinkedList<Integer> answerList = new LinkedList<>();
        int counter = 0; // count # of completed development before deployment

        int begin = 0; // the right next position of recently completed development
        int cursor = 0; // cursor for checking development status


        while(true) {
            for(int i=0; i<progresses.length; i++) {
                if(progresses[i] < 100) {
                    progresses[i] = progresses[i] + speeds[i]; // increment dev progress
                    if(progresses[i] > 100) progresses[i] = 100;
                }
            }

            // when most left side dev progress completed,
            if(progresses[begin] == 100) {
                do{
                    counter++; // increase counter to count complement
                    cursor++; // move cursor to right side
                    if(cursor == progresses.length) break;
                } while(progresses[cursor] == 100);

                answerList.add(counter); // save # of completed dev progresses

                if(cursor == progresses.length) {
                    // reach end of task array
                    break;
                } else {
                    // init counter, begin and cursor;
                    counter=0;
                    begin = cursor;
                    cursor = begin;

                }
            }
        }

        int[] answer = new int[answerList.size()];

        //convert LinkedList to int array
        for(int i=0; i< answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void print(int[] p, int[] s) {

        System.out.println("print");
        for(int i=0; i<p.length; i++) {
            System.out.println(
                   i + " - " + p[i] + " : " + s[i]
            );
        }
    }


    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        for(int i : solution(progresses, speeds)) {
            System.out.println(i);
        }
        // return {2, 1}

        System.out.println();

        progresses = new int[]{95, 90, 99, 99, 80, 99};
        speeds = new int[]{1, 1, 1, 1, 1, 1};
        for(int i : solution(progresses, speeds)) {
            System.out.println(i);
        }
        // return {1, 3, 2}

    }
}
