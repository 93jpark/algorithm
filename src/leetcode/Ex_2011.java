package leetcode;

public class Ex_2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int init = 0;
        for(String op : operations) {
            if(op.contains("+")) {
                init++;
            } else {
                init--;
            }
        }
        return init;
    }
}
