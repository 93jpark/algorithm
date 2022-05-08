package CodingTest;

import java.util.HashMap;
import java.util.LinkedList;

import java.util.*;

public class Main {

    // map memorize position x,y coordinates
    static HashMap<Character, XY> map = new HashMap<>();

    public static int[] solution(String line) {
        int[] answer = new int[line.length()];
        init(); // init key position map

        LinkedList<Integer> list = new LinkedList<>();

        char left = 'Q';
        char right = 'P';

        for(int i=0; i<line.length(); i++){
            char input = line.charAt(i);
            System.out.println(input);

            System.out.println("left hand on "+left+ " right hand on "+right);

            int leftDistance = getDistance(left, input);
            int rightDistance = getDistance(right, input);
            System.out.println("left distance="+leftDistance+" right distance="+rightDistance);

            if(leftDistance == rightDistance) {
                System.out.println("!!SAME!!");
                // 두 거리가 같으면, 수평(x) 거리가 가까운쪽으로 누른다.
                if(getXDistance(left, input) > getXDistance(right, input)) {
                    list.add(1); // right hand
                    right = input;
                } else if(getXDistance(left, input) < getXDistance(right, input)) {
                    list.add(0); // left hand
                    left = input;
                } else if(getXDistance(left, input) == getXDistance(right, input)) {
                    int hand = xOrY(input);
                    System.out.println("hand is "+hand);
                    list.add(hand);
                    if(hand == 0) {
                        left = input;
                    } else {
                        right = input;
                    }

                }

            } else {
                if(leftDistance > rightDistance) {
                    list.add(1);
                    right = input;
                } else {
                    list.add(0);
                    left = input;
                }
            }

            System.out.println();
        }

        System.out.println(list);

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static int xOrY(char c) {
        switch(c) {
            case '1': case '2': case '3': case '4': case '5':
            case 'Q': case 'W': case 'E': case 'R': case 'T':
                System.out.println("it is " + 0);
                return 0;
            case '6':case '7':case '8':case '9':case '0':
            case 'Y':case 'U':case 'I':case 'O':case 'P':
                System.out.println("it is " + 1);
                return 1;
        }
        return -1;
    }

    public static int getDistance(char base, char target) {
        return getXDistance(base, target) + getYDistance(base, target);
    }

    public static int getXDistance(char base, char target) {
        return Math.abs(map.get(base).x - map.get(target).x);
    }

    public static int getYDistance(char base, char target) {
        return Math.abs(map.get(base).y - map.get(target).y);
    }

    // init key-position map
    public static void init() {
        map.put('1', new XY(1,1));
        map.put('2', new XY(2,1));
        map.put('3', new XY(3,1));
        map.put('4', new XY(4,1));
        map.put('5', new XY(5,1));
        map.put('6', new XY(6,1));
        map.put('7', new XY(7,1));
        map.put('8', new XY(8,1));
        map.put('9', new XY(9,1));
        map.put('0', new XY(10,1));
        map.put('Q', new XY(1,2));
        map.put('W', new XY(2,2));
        map.put('E', new XY(3,2));
        map.put('R', new XY(4,2));
        map.put('T', new XY(5,2));
        map.put('Y', new XY(6,2));
        map.put('U', new XY(7,2));
        map.put('I', new XY(8,2));
        map.put('O', new XY(9,2));
        map.put('P', new XY(10,2));
    }

    public static class XY {
        int x;
        int y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) {
        for(int i: solution("Q4OYPI")){
            System.out.println(i);
        }
        System.out.println();

        for(int i: solution("RYI76")){
            System.out.println(i);
        }
        System.out.println();

        for(int i: solution("64E2")){
            System.out.println(i);
        }
        System.out.println();

    }
}
