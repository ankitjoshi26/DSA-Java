package AdjMatrix;

public class Graph {
    int[][] adjMatrix;

    Graph(int nodes){
        adjMatrix = new int[nodes][nodes];
    }

    public void addEdgesInMatrix(int[][] edges, boolean isDirected){
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(isDirected){
                // Directed Graph
                adjMatrix[u][v] = 1;
            }else{
                // Undirected Graph
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }

    public void printEdges(){
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print("row" + i + " -> ");
            for(int j=0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int nodes = 4;
        int[][] edges = {{0,2}, {1,0}, {1,2}};

        System.out.println("Directed Graph");
        // Directed
        Graph obj = new Graph(nodes);
        obj.addEdgesInMatrix(edges, true);
        obj.printEdges();

        System.out.println();
        System.out.println();
        System.out.println("Undirected Graph");
        
        // Undirected
        Graph obj1 = new Graph(nodes);
        obj1.addEdgesInMatrix(edges, false);
        obj1.printEdges();
    }
}
