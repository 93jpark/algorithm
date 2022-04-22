package leetcode;

public class Ex_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[n*2];
        for(int i=0; i<n; i++) {
            answer[0+(2*i)] = nums[i];
            answer[1+(2*i)] = nums[i+n];
        }
        return answer;
    }
}
