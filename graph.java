class graph11 {
    int[][] adjmatrix;

    graph11(int node){
        this.adjmatrix= new int[node][node];
    }

    public void addEdge(int u,int v){
        this.adjmatrix[u][v] = 1;
        this.adjmatrix[v][u] = 1;
    } 
    void print(int[][] x){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
 
}
 
public class graph{
    public static void main(String[] args) {
        graph11 g = new graph11(4);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        
        g.print(g.adjmatrix);
    }
}






