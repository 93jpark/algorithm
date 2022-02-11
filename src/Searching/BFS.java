package Searching;
import java.util.*;

public class BFS {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> graph = new HashMap<>();

        graph.put("A", new ArrayList<String>(Arrays.asList("B","C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A","D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A","G","H","I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B","E","F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C","J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        System.out.println(graph);

        System.out.println(bfsFunc(graph, "A"));

    }

    static ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode) {

        ArrayList<String> visited = new ArrayList<String>();
        ArrayList<String> needVisit = new ArrayList<String>();

        needVisit.add(startNode);

        while(needVisit.size() > 0) { // 방문할 노드가 아직 남아있을때까지
            String node = needVisit.remove(0); // needVisit 큐에서 가장 앞에 있는 노드를 가져옴

            if(!visited.contains(node)) { // 해당 노드가 방문했었던 노드가 아니라면
                visited.add(node); // 해당 노드 방문
                needVisit.addAll(graph.get(node)); //방문할 노드에 연결된 노드들을 needVisit 큐에 추가
            }
        }
        return visited;
    }



}
