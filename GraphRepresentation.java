import java.util.*;
public class GraphRepresentation {
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


    public static void display(ArrayList <Edge> graph [] , int vertex){
        for(int i =0; i< vertex; i++){
            System.out.print(i + "---->" );
            for(int j = 0; j< graph[i].size();j++){
                Edge e = graph[i].get(j);
                System.out.print(e.destination + " ");
            }

            System.out.println();
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
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,1));

        //3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,2,1));
        
        //4
        graph[4].add(new Edge (4,2,1));

       display(graph,vertex);

    }
}