import java.util.*;
public class GraphRepresentation2 {
    static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int src ,int dest, int wt){
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }

    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n ,int path){
            this.n = n;
            this.path = path;

        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }


    public static void dijkstars (ArrayList <Edge> graph [], int src){
        int distance [] = new int [graph.length];
        boolean visited [] = new boolean [graph.length];

        for(int i=0;i<graph.length;i++){
            if(src != i){
                distance[i]= Integer.MAX_VALUE;
            }
        }
        
        PriorityQueue <Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src , 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.n]){
                visited[curr.n]= true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.source;
                    int v = e.destination;
                    int wt = e.weight;

                    if(distance[u]+ wt < distance[v]){
                        distance[v] = distance[u]+ wt;
                        pq.add(new Pair(v, distance[v]));
                    }
                }
            }
        }

        for(int i=0;i<distance.length;i++){
            System.out.print(distance[i]);
        }

        System.out.println("");

    }


 

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("\nEnter the number of vertices : ");
        int vertex = 6;
        ArrayList <Edge>  graph [] = new ArrayList[vertex]; // null or empty array list 

        //                     1 --------> 3
        //                   ^  |          ^  \
            //              /   |          |   v
    //                    0     |          |   5
    //                      \   |          |   ^
    //                       v  v          | /
    //                         2 --------> 4
    // 
    // 

        for(int i=0;i<vertex;i++){  //initializing array list
            graph[i] = new ArrayList<>();
        }

        //0
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        
        // 1
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge( 1, 2, 1));

        // 2
        graph[2].add(new Edge(2, 4, 3));

        //3
        graph[3].add(new Edge(3, 5, 1));

        //4
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        //5

        
        dijkstars(graph,0);

    }
}