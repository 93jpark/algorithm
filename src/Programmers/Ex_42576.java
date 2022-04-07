package Programmers;

import java.util.*;

/**
 * 완주하지 못한 선수
 * 해시
 */
public class Ex_42576 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> result = new HashMap<>();

        for(String s : completion) {
            result.put(s, result.getOrDefault(s, 0)+1);

        }

        for(String name : participant) {
            if(result.containsKey(name)) {
                // if name exist in completion list
                if(result.get(name) == 1) {
                    result.remove(name);
                } else {
                    result.put(name, result.get(name)-1);
                }
            } else {
                // if name not exist in completion list
                return name;
            }
        }

        answer = (String)result.keySet().toArray()[0];


        return answer;
    }

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};
        System.out.println(solution(participant, completion)); // leo

        participant = new String[]{"marina", "josipa", "nikola", "vinko", "flipa"};
        completion = new String[]{"marina", "josipa", "nikola", "flipa"};
        System.out.println(solution(participant, completion)); // vinko

        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[]{"mislav", "stanko", "ana"};
        System.out.println(solution(participant, completion)); // mislav

    }
}
