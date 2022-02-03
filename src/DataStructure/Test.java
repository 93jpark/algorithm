package DataStructure;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) throws IOException {
        int[] nums = {1,2,3};
        int max = 0;
        for(int n : nums) {
            if(n >= max) {
                max = n;
            }
        }
        int[] myIntArray = IntStream.rangeClosed(0, max).toArray();
        for(int n : myIntArray) {
            System.out.println(n);
        }

        String s = "hello";

        System.out.println(s.length());

    }

    public static double sum(List<Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
    static <T> T getSomething(T t) {
        return t;
    }

}