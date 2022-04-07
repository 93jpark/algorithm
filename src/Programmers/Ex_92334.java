package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// 2022 KAKAO BLIND RECRUITMENT
// 신고 결과 받기
public class Ex_92334 {
    public static int[] solution(String[] id_list, String[] report, int k) {

        for(String s : id_list){
            System.out.println(s);
        }
        int[] answer = new int[id_list.length];

        HashMap<String, Integer> countMap = new HashMap<>();
        HashMap<String, Integer> resultMap = new HashMap<>();

        HashMap<String, Set<String>> reportSet = new HashMap<>();


        for(String str : report) {
            String reporter = str.split(" ")[0]; // 신고한사람
            String reportee = str.split(" ")[1]; // 신고당한사람

            Set<String> set = reportSet.getOrDefault(reporter, new HashSet<>());
            if(!set.contains(reportee)) {
                countMap.put(reportee, countMap.getOrDefault(reportee, 0)+1);
                set.add(reportee);
                reportSet.put(reporter, set);
            }

        }


        for(int i=0; i<id_list.length; i++) {
            String name = id_list[i];
            if(reportSet.get(name)!=null) {
                for(String s : reportSet.get(name)) {
                    if(countMap.get(s) >= k) {
                        resultMap.put(name, resultMap.getOrDefault(name, 0)+1);
                        answer[i] = answer[i]+1;
                    }
                }
            } else {
                resultMap.put(name, 0);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        // result = [2,1,1,0]

        for(Integer i : solution(id_list, report, k)) {
            System.out.print(i+" ");
        }


        id_list = new String[]{"con", "ryan"};
        report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        k = 3;

        for(Integer i : solution(id_list, report, k)) {
            System.out.print(i+" ");
        }

    }
}
