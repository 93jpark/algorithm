package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Ex_567 {
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> mapS1 = new HashMap<>();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        for(char c : c1) {
            mapS1.put(c, mapS1.getOrDefault(c, 0)+1);
        }

        int left = 0;
        //int right = 1;

        while(left < s2.length()) {

            for(int right=left; right<s2.length(); right++) {

                String s = s2.substring(left, right+1);
                HashMap<Character, Integer> mapS2 = new HashMap<>();

                char[] charArr = s.toCharArray();

                for(char c : charArr) {
                    mapS2.put(c, mapS2.getOrDefault(c, 0)+1);
                }

                System.out.println(s);
                if(mapS2.equals(mapS1)) {
                    System.out.println(mapS1);
                    System.out.println(mapS2);
                    return true;
                } else {
                    System.out.println(mapS1);
                    System.out.println(mapS2);
                }
            }
            left++;
        }


        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","elebaoooo"));
        System.out.println(checkInclusion("ab","eleboaoooo"));
        System.out.println();
        System.out.println(checkInclusion("adc","dcda"));

    }
}
