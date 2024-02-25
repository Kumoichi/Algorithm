//public class PrimAlgorithm {
//    private static final int INF = Integer.MAX_VALUE;
//
//    public static void primMST(int[][] graph) {
//        int vertices = graph.length;
//        int[] parent = new int[vertices];
//        int[] key = new int[vertices];
//        boolean[] mstSet = new boolean[vertices];
//
//        // Initialize all keys as INFINITE
//        for (int i = 0; i < vertices; i++) {
//            key[i] = INF;
//        }
//
//        // Always include first  vertex in MST.
//        key[0] = 0;
//        parent[0] = -1; // First node is always root of MST.
//
//        // MST will have V vertices
//        for (int count = 0; count < vertices - 1; count++) {
//            // Pick the minimum key vertex from the set of vertices not yet included in MST
//            int u = minKey(key, mstSet);
//
//            // Add the picked vertex to the MST Set
//            mstSet[u] = true;
//
//            // Update key and parent arrays of the adjacent vertices of the picked vertex.
//            for (int v = 0; v < vertices; v++) {
//                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
//                    parent[v] = u;
//                    key[v] = graph[u][v];
//                }
//            }
//        }
//
//        // Print the constructed MST
//        printMST(parent, graph);
//    }
//
//    private static int minKey(int[] key, boolean[] mstSet) {
//        int min = INF, minIndex = -1;
//
//        for (int v = 0; v < key.length; v++) {
//            if (!mstSet[v] && key[v] < min) {
//                min = key[v];
//                minIndex = v;
//            }
//        }
//
//        return minIndex;
//    }
//
//    private static void printMST(int[] parent, int[][] graph) {
//        System.out.println("Edge \tWeight");
//        for (int i = 1; i < graph.length; i++) {
//            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] graph = {
//                { 0, 9, 75, 0, 0 },
//                { 9, 0, 95, 19, 42 },
//                { 75, 95, 0, 51, 66 },
//                { 0, 19, 51, 0, 31 },
//                { 0, 42, 66, 31, 0 } };
//
//        primMST(graph);
//    }
//}
//


class PrimAlgorithm
{
        public static void main(String[] args) {
        int[][] graph = {
                { 0, 9, 75, 0, 0 },
                { 9, 0, 95, 19, 42 },
                { 75, 95, 0, 51, 66 },
                { 0, 19, 51, 0, 31 },
                { 0, 42, 66, 31, 0 } };

        primMST(graph);
    }

    private static final int INF = Integer.MAX_VALUE;
    public static void primMST(int[][] graph)
    {
        int vertices = graph.length;
        int[] key = new int[vertices];
        int[] parent = new int[vertices];
        boolean[] mstSet = new boolean[vertices];

        for(int i = 0; i < vertices; i++)
        {
            key[i] = INF;
        }

        key[0] = 0;
        parent[0] = -1;

        for(int i = 0; i < vertices; i++)
        {
            int u = minkey(key, mstSet);
            mstSet[u] = true;

            for(int v = 0; v < vertices; v++)
            {
                if(!mstSet[v] && graph[u][v] < key[i] && graph[u][v] != 0)
                {
                    parent[v] = u;
                    key[i] = graph[u][v];
                }
            }
        }
    }

    private static int minkey(int[] key, boolean[] mstSet)   {
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
}



