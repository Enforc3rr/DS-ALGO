package Graph;

import GraphAssing.GraphAssing;

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEgde(0,1);
        graph.addEgde(0,2);
        graph.addEgde(0,3);
        graph.addEgde(0,4);
        graph.addEgde(0,5);
        Object [] values = graph.adjacentView(0);
        for(Object val : values){
            System.out.println(val);
        }



    }
}
