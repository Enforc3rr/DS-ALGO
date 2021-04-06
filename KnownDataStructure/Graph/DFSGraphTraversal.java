package GraphPart2;

import java.util.ArrayList;

public class DFSGraphTraversal {
    public static void main(String[] args) {
        int vertices = 5;
        int source = 0 ;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(i , new ArrayList<Integer>());
        }
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,4);
        addEdge(graph,1,3);
        addEdge(graph,2,3);
        dfsTraversal(graph,vertices,source);

    }
    private static void addEdge(ArrayList<ArrayList<Integer>> graph , int u , int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    private static void dfsTraversal(ArrayList<ArrayList<Integer>> graph , int vertices , int source){
        boolean[] visited = new boolean[vertices+1];
        dfs(graph,source,visited);
    }
    private static void dfs(ArrayList<ArrayList<Integer>> graph ,int edge , boolean[] visited){
        visited[edge] = true;
        System.out.println(edge);
        for(int adjEdge : graph.get(edge)){
            if(!visited[adjEdge]){
                dfs(graph,adjEdge,visited);
            }
        }
    }
}
