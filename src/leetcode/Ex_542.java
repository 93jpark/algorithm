package leetcode;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Ex_542 {
    public static int[][] updateMatrix(int[][] mat) {


        LinkedList<int[]> zeros = new LinkedList<>();

        int rows = mat.length;
        int columns = mat[0].length;

        int[][] answer = new int[rows][columns];

        for(int i=0; i<mat.length; i++) { // iterate row
            for(int j=0; j<mat[0].length; j++) { // iterate col
                // search positions of zeros
                //System.out.println(i+" "+j);
                //System.out.println(mat[i][j]);
                if(mat[i][j]==0) {
                    //System.out.println("added");
                    zeros.add(new int[]{i, j});
                }

            }
        }

        //System.out.println(zeros.size());
        //System.out.println("zeros coordinates");

        /*
        for(int[] xy : zeros) {
            System.out.println(xy[0] + " " +xy[1]);
        }

         */
        //System.out.println("end");

        for(int i=0; i<mat.length; i++) { // iterate row
            for(int j=0; j<mat[0].length; j++) { // iterate col
                //System.out.println(i+" "+j);

                if(mat[i][j] != 0) {
                    //LinkedList<Integer> dist = new LinkedList<>();
                    int minAbsDist = Integer.MAX_VALUE;

                    for(int[] xy : zeros) {
                        //dist.add(getAbsDist(i, j, xy));

                        if(getAbsDist(i, j, xy) <= minAbsDist) {
                            minAbsDist = getAbsDist(i, j, xy);
                        }
                    }

                    answer[j][i] = minAbsDist;
                }

            }
        }

        return answer;
    }

    public static int getMinValue(LinkedList<Integer> list) {
        return 0;
    }

    public static int getAbsDist(int x, int y, int[] zeroXY) {
        return Math.abs(x - zeroXY[0]) + Math.abs(y - zeroXY[1]);
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{0,0,0},{0,1,0},{1,1,1}};

        int[][] answer = updateMatrix(mat);

        System.out.println("result");

        // print-out answer array to check
        for(int i=0; i<answer[0].length; i++) {
            for(int j=0; j<answer.length; j++) {
                System.out.print(answer[j][i]+" ");
            }
            System.out.println();
        }

        mat = new int[][]{{0,0,0},{0,1,0},{0,0,0}};

        answer = updateMatrix(mat);

        System.out.println("result");

        // print-out answer array to check
        for(int i=0; i<answer[0].length; i++) {
            for(int j=0; j<answer.length; j++) {
                System.out.print(answer[j][i]+" ");
            }
            System.out.println();
        }
    }
}
