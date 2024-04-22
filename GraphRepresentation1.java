import java.util.*;
public class GraphRepresentation1 {
    static class Edge{
        int source;
        int destination;
        int weight;

        Edge(int src ,int dest, int wt){
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }

    public static void DSF (ArrayList<Edge> graph [] , boolean visited [], int curr ){
        System.out.print(curr + " ");
        visited[curr]= true;
        for(int i =0 ;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.destination]){
                DSF(graph, visited, e.destination);
            }
        }
    }
    public static void BSF (ArrayList<Edge> graph []){
        Queue <Integer> q = new LinkedList<>();
        boolean visited [] = new boolean[graph.length];
        q.add(0); // ==> you can take any element.
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                visited[curr] = true;
                System.out.print(curr + " ");
                for(int i = 0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.destination);
                }

            }
        }

    }


    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("\nEnter the number of vertices : ");
        int vertex = 5;
        ArrayList <Edge>  graph [] = new ArrayList[vertex]; // null or empty array list 
        //          0
        //          |
        //          1
        //         / \
        //        2 - 3
        //        /
        //      4

        for(int i=0;i<vertex;i++){  //initializing array list
            graph[i] = new ArrayList<>();
        }

        //0
        graph[0].add(new Edge(0, 1, 1));
        
        //1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,1));

        //2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,4,1));
        graph[2].add(new Edge(2,3,1));

        //3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,2,1));
        
        //4
        graph[4].add(new Edge (4,2,1));

        System.out.println("\nBFS");

       BSF(graph);
        System.out.println("\nDFS");
       DSF(graph, new boolean[graph.length], 0);

    }
}