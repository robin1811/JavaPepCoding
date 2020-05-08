import java.util.*;
class Graphs{
    static class edge{
        int src; 
        int nbr;
        int wt;

        edge( int s, int n, int w ){
            src = s;
            nbr = n;
            wt = w;
        }
    }
    public static void addEdge( ArrayList<ArrayList<edge>> graph, int a, int b , int w ){
        graph.get(a).add(new edge(a, b, w));
        graph.get(b).add(new edge(b, a, w));
    }

    public static void display(ArrayList<ArrayList<edge>> graph){
        for(int v = 0; v<graph.size(); v++){
            for(int e = 0; e<graph.get(v).size(); e++){
                edge ce = graph.get(v).get(e);
                System.out.print(ce.src +" -> [ " + ce.nbr + " @ " + ce.wt + "] , ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        ArrayList<ArrayList<edge>> graph = new ArrayList<>();
        for(int i = 0; i<7; i++){
            graph.add(new ArrayList<edge>());
        }
        addEdge(graph,0,1,10);
        addEdge(graph,0,3,40);
        addEdge(graph,1,2,10);
        addEdge(graph,2,3,10);
        addEdge(graph,3,4,2);
        addEdge(graph,4,5,3);
        addEdge(graph,4,6,8);
        addEdge(graph,5,6,3);
        display(graph);

    }
}