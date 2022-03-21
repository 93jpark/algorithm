package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Ex_567 {
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> mapS1 = new HashMap<>();
        HashMap<Character, Integer> mapS2 = new HashMap<>();

        for(char c : s1.toCharArray()) mapS1.put(c, mapS1.getOrDefault(c, 0)+1);

        System.out.println(mapS1);

        int begin = 0;

        for(int end=0; end < s2.length(); end++) {
            char rightChar = s2.charAt(end);
            mapS2.put(rightChar, mapS2.getOrDefault(rightChar, 0)+1);

            if(end+1 >= s1.length()) {
                if(mapS1.equals(mapS2)) {
                    return true;
                }

                char leftChar = s2.charAt(begin);
                mapS2.put(leftChar, mapS2.get(leftChar)-1);
                if(mapS2.get(leftChar) == 0) {
                    mapS2.remove(leftChar);
                }
                begin++;
            }
        }
        return false;
    }
}
