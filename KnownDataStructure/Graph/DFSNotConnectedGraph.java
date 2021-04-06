package GraphPart2;

import java.util.ArrayList;

public class DFSNotConnectedGraph {
    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
             graph.add(i,new ArrayList<Integer>());
        }
        addEdge(graph,1,2);
        addEdge(graph,2,3);
        addEdge(graph,3,1);
        addEdge(graph,4,5);
        addEdge(graph,0,4);
        addEdge(graph,4,5);
        addEdge(graph,0,5);

        dfsTraversal(graph,vertices);

    }
    private static void addEdge(ArrayList<ArrayList<Integer>> graph, int u , int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    private static void dfsTraversal(ArrayList<ArrayList<Integer>> graph , int vertices){
        int count = 0 ;
        boolean[] visited = new boolean[vertices+1];
        for(int i = 0 ; i < vertices ; i++){
            if(!visited[i]){
                dfsDisConn(graph,i,visited);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
    private static void dfsDisConn(ArrayList<ArrayList<Integer>> graph , int edge , boolean[] visited){
        System.out.println(edge);
        if(!visited[edge]){
            visited[edge] = true;
            for(int adjToEdge : graph.get(edge)){
                if(!visited[adjToEdge]){
                    dfsDisConn(graph,adjToEdge,visited);
                }
            }
        }
    }
}

/*
Applications of DFS ->
1) Cycle Detection
2) Topological Sorting
3) Path Finding Algorithms
4) Solving Puzzles
 */
