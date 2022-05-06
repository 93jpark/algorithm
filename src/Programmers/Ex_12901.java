package Programmers;
/*
    레벨1
    2016
 */

public class Ex_12901 {
    public String solution(int a, int b) {
        String answer = "";

        int sum = b;

        if(a > 1) sum += 31;
        if(a > 2) sum += 29;
        if(a > 3) sum += 31;
        if(a > 4) sum += 30;
        if(a > 5) sum += 31;
        if(a > 6) sum += 30;
        if(a > 7) sum += 31;
        if(a > 8) sum += 31;
        if(a > 9) sum += 30;
        if(a > 10) sum += 31;
        if(a > 11) sum += 30;

        String[] days = new String[] {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        return days[(sum%7)];
    }
}
