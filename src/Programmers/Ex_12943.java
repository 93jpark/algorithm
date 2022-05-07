package Programmers;
/*
    레벨1
    콜라츠 추측
 */
public class Ex_12943 {
    public int solution(int num) {

        long longNum = num;

        int counter = 0;

        while(longNum != 1 && counter != 500) {
            if(longNum % 2 == 0) {
                longNum = longNum / 2;
            } else {
                longNum = (longNum * 3) + 1;
            }
            counter++;
        }

        if(counter == 500 && longNum != 1) {
            return -1;
        }


        return counter;

    }
}
