package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Ex_3 {

    public static int lengthOfLongestSubstring(String s) {
        int begin=0;
        int end=0;
        int max=0;
        HashSet<Character> hash=new HashSet();
        while(end<s.length()){
            if(!hash.contains(s.charAt(end))){
                hash.add(s.charAt(end));
                end++;
                max=Math.max(max,hash.size());
            }
            else {
                hash.remove(s.charAt(begin));
                begin++;
            }
        }
        return max;
    }
}
