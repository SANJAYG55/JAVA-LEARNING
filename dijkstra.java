// import java.util.*;

// public class dijkstra{
//     static final int INF = Integer.MAX_VALUE;

//     static class Edge {
//         int to, weight;

//         Edge(int to, int weight) {
//             this.to = to;
//             this.weight = weight;
//         }
//     }

//     public static void dijkstraa(List<List<Edge>> graph, int source) {
//         int n = graph.size();
//         int[] dist = new int[n];
//         Arrays.fill(dist, INF);
//         dist[source] = 0;

//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(v -> dist[v]));
//         pq.offer(source);

//         while (!pq.isEmpty()) {
//             int u = pq.poll();

//             for (Edge e : graph.get(u)) {
//                 int v = e.to;
//                 int weight = e.weight;

//                 if (dist[v] > dist[u] + weight) {
//                     dist[v] = dist[u] + weight;
//                     pq.offer(v);
//                 }
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             if (dist[i] == INF) {
//                 System.out.println("Vertex " + i + " is unreachable from the source");
//             } else {
//                 System.out.println("Shortest distance from source to vertex " + i + ": " + dist[i]);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int n = 6; 

//         List<List<Edge>> graph = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             graph.add(new ArrayList<>());
//         }

//         graph.get(0).add(new Edge(1, 7));
//         graph.get(0).add(new Edge(2, 9));
//         graph.get(0).add(new Edge(5, 14));
//         graph.get(1).add(new Edge(2, 10));
//         graph.get(1).add(new Edge(3, 15));
//         graph.get(2).add(new Edge(3, 11));
//         graph.get(2).add(new Edge(5, 2));
//         graph.get(3).add(new Edge(4, 6));
//         graph.get(4).add(new Edge(5, 9));

//         int source = 0; 

     
//         dijkstraa(graph, source);
//     }
// }





import java.util.*;

public class dijkstra {
    static final int INF = Integer.MAX_VALUE;

    public static void dijkstraa(int[][] graph, int source) {
        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[source] = 0;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (dist[i] == INF) {
                System.out.println("Vertex " + i + " is unreachable from the source");
            } else {
                System.out.println("Shortest distance from source to vertex " + i +  ": " + dist[i]);
            }
        }
    }

    public static int minDistance(int[] dist, boolean[] visited) {
        int min = INF;
        int minIndex = -1;
        int n = dist.length;
        for (int v = 0; v < n; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 7, 9, 0, 0, 14},
            {7, 0, 10, 15, 0, 0},
            {9, 10, 0, 11, 0, 2},
            {0, 15, 11, 0, 6, 0},
            {0, 0, 0, 6, 0, 9},
            {14, 0, 2, 0, 9, 0}
        };

        int source = 0; 
        dijkstraa(graph, source);
    }
}
