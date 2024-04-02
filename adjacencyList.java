import java.util.*;
class graph{
    LinkedList<Integer>[] adj;

    graph(int nodes){
        this.adj= new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
          this.adj[i]=new LinkedList<>();
        }
    }

    void addEdge(int a,int b){
        this.adj[a].add(b);
        this.adj[b].add(a);

    }

    void printGraph() {
        for (int i = 0; i < adj.length; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}

public class adjacencyList {
   
public static void main(String[] args) {
    graph g = new graph(4);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 3);
    g.addEdge(3, 0);
    g.printGraph();
  }
}
