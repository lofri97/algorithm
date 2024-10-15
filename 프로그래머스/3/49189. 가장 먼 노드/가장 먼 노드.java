import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int[] edges = new int[n+1];
        Node[] nodes = new Node[n+1];
        
        // n 의 개수만큼 노드를 생성한다.
        for (int i = 1; i < n+1; i++) {
            nodes[i] = new Node(i);
        }
        
        for (int[] e : edge) {
            Node n1 = nodes[e[0]];
            Node n2 = nodes[e[1]];
            
            n1.add(n2);
            n2.add(n1);
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(nodes[1]);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            edges[current.id] = current.edgeCount;
            current.visited = true;
            
            for(Node link : current.links) {
                if (!link.visited) {
                    link.edgeCount = current.edgeCount + 1;
                    link.visited = true;
                    queue.add(link);
                }
            }
        }
        
        int max = -1;
        int answer = 0;
        for (int distance : edges) {
            if (distance > max) {
                max = distance;
                answer = 0;
            }
            if (max == distance) {
                answer ++;
            }
        }
        return answer;
    }
    
    static class Node {
        int id;
        int edgeCount = 0;
        boolean visited = false;
        List<Node> links = new ArrayList<>();
        
        Node(int id) {
            this.id = id;
        }
        
        void add(Node link) {
            this.links.add(link);
        }
        
        public String toString() {
            return String.format("id: %d / visited: %s / count: %d\n", id, visited, edgeCount);
        }
    }
}

/**
bfs 를 쓸거다.
boolean visited 를 만든다.
visited int 배열을 만든다. visited idx 에는 간선의 개수를 적는다.

**/