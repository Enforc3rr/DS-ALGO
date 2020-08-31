package Graph;

import java.util.ArrayList;

public class Graph {
    private int vertex;
    private  int edge;
    private ArrayList[] list;

    public Graph(int vertex) {
        this.vertex = vertex;
        this.edge = 0 ;
        this.list = new ArrayList[vertex];
        for(int i = 0 ; i < vertex ; i++){
            list[i] = new ArrayList<Integer>();
        }
    }
    public void addEgde(int src , int destination){
        list[src].add(destination);
        edge++;
    }
    public Object[] adjacentView(int src){
        return list[src].toArray();
    }
}
