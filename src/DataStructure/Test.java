package DataStructure;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) throws IOException {
        int[] nums = {2,7,11,15};
        int target = 9;
        for(int i : twoSum(nums, target)){
            System.out.println(i);
        }

        reverseWords("hello world its ok");

    }

    public static String reverseWords(String s) {
        String result = "";

        for(String str : s.split(" ")){

            char[] chars = str.toCharArray();

            for(int i=0; i<str.length()/2; i++) {

                char temp = chars[chars.length-1-i];
                chars[chars.length-1-i] = chars[i];
                chars[i] = temp;

            }
            result += new String(chars) + " ";

        }

        System.out.println(result.substring(0, result.length()-1));
        return result;
    }

    public static void moveZeroes(int[] nums) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                //Swapping the non zero element with index with value 0;
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
        for(int num : nums) {
            System.out.print(num+" ");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i]+numbers[j] == target ) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


}
