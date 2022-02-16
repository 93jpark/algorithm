package leetcode;

// Binary Search
public class Ex_704 {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12,13};
        int target = 13;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target) { // target could exist right side
                left = mid + 1;
            } else if(nums[mid] > target) { // target could exist left side
                right = mid - 1;
            }
        }
        return -1;
    }

}
