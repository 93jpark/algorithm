package Programmers;
/*
    레벨 1
    제일 작은 수 제거하기
 */
public class Ex_12935 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if(arr.length == 1) return new int[]{-1};



        int min = Integer.MAX_VALUE;
        int index = -1;

        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }

        int newIdx = 0;
        for(int i=0; i<arr.length; i++) {
            if(i != index) {
                answer[newIdx++] = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        for(int i : solution(new int[]{4,3,2,1})) {
            System.out.println(i);
        }
        System.out.println();

        for(int i : solution(new int[]{10})) {
            System.out.println(i);
        }
        System.out.println();


    }
}
