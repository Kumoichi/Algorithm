import java.io.*;
import java.lang.*;
import java.util.*;

class ShortestPath {
    static final int V = 9;
    static final int INF = Integer.MAX_VALUE;


    void printSolution(int dist[]) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    private int minKey(int[] key, boolean[] mstSet)
    {
        int min = INF, minIndex = 0;
        for(int i = 0; i < key.length; i++)
        {
            if(!mstSet[i] && key[i] < min)
            {
                min = key[i];
                minIndex = i;
            }
        }
        return minIndex;
    }



    private void dijkstra(int[][] graph, int src)
    {
        int vertex = graph.length;
        int[] key = new int[vertex];
        boolean[] mstSet = new boolean[vertex];
        for(int i = 0; i < vertex; i++)
        {
            key[i] = INF;
        }

        key[0] = 0;

        for(int i = 0; i < vertex-1; i++)
        {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for(int v = 0; v < vertex; v++)
            {
                if(!mstSet[v] && key[u] + graph[u][v] < key[v] && graph[u][v] != 0)
                {
                    key[v] = key[u] + graph[u][v];
                }
            }
        }
        printSolution(key);
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0);
    }
}
