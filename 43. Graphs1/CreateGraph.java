import java.util.*;

public class CreateGraph {
    static class Edge {
        int scr, dest, wt;

        public Edge(int s, int d, int w) {
            this.scr = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V]; // null -> empty ArryList
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 Vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 Vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 3, 5));

        // 2 Vertex
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 5));
        graph[2].add(new Edge(2, 4, 5));

        // 3 Vertex
        graph[3].add(new Edge(3, 1, 5));
        graph[3].add(new Edge(3, 2, 5));
        graph[3].add(new Edge(3, 4, 5));

        // 4 Vertex
        graph[4].add(new Edge(4, 2, 5));

        // 2's neighbour
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i); // src,dest,wt
            System.out.println(e.dest);
        }
    }
}