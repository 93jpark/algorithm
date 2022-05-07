package Programmers;
/*
    레벨1
    핸드폰 번호 가리기
 */
public class Ex_12948 {
    public static String solution(String phone_number) {
        String answer = "";

        int counter = 0;
        for(int i=phone_number.length()-1; i >= 0; i--) {
            if(counter < 4) {
                counter++;
                answer = phone_number.charAt(i) + answer;
            } else {
                answer = "*" + answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("99999999"));
        System.out.println(solution("123456789"));
        System.out.println(solution("01012345678"));
    }
}
