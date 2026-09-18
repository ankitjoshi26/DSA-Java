// import java.util.ArrayList;

// public class implement {
//     public static void main(String[] args){
//         int vertex = 5;
//         int edges = 6;

//         int[][] matrix = new int[vertex + 1][vertex + 1];
//         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//         for(int i=0; i<=vertex ;i++){
//             adj.add(new ArrayList<Integer>());
//         }
//     }

//     static void addEdges(int[] matrix, int source, int destination){
//         matrix[source][destination] = 1;
//         matrix[destination][source] = 1;
//     }

//     static void addEdges(ArrayList<ArrayList<Integer>> adj, int source, int destination){
//         adj.get(source).add(destination);
//         adj.get(destination).add(source);
//     }
// }