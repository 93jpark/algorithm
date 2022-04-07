package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Ex_3 {

    public static int lengthOfLongestSubstring(String s) {

        int len = s.length();

        int begin = 0;
        int end = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        // abcabcbb

        while(end < len) {
            //System.out.println("begin:" + begin + " end: "+ end);
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(begin));
                begin++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
