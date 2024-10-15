import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        Node[] nodes = new Node[n+1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(n);   
        }
        
        for (int[] wire : wires) {
            Node node1 = nodes[wire[0]];
            Node node2 = nodes[wire[1]];
            node1.add(node2);
            node2.add(node1);
        }
        
        int answer = Integer.MAX_VALUE;
        for (int[] wire : wires) {
            for (int i = 1; i <=n; i++) {
                nodes[i].visited = false;   
            }
            nodes[wire[1]].visited = true;
            int count = bfs(nodes[wire[0]]);
            answer = Math.min(answer, Math.abs(n - count * 2));
        }
        return answer;
    }
    
    int bfs(Node node) {
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        node.visited = true;
        queue.add(node);
        
        while (!queue.isEmpty()) {
            Node qNode = queue.poll();
            for (Node link : qNode.links) {
                if (!link.visited) {
                    queue.add(link);
                    link.visited = true;
                }
            }
            count++;
        }
        return count;
    }
    
    static class Node {
        int idx;
        boolean visited = false;
        List<Node> links = new ArrayList<>();
        
        Node(int idx) {
            this.idx = idx;
        }
        
        void add(Node node) {
            links.add(node);   
        }
    }
}