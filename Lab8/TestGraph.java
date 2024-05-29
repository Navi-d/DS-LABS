package Lab8;


public class TestGraph {
    public static void main(String[] args) {
        Graph<String> graph1 = new Graph<>();
        String[] cities = {"Alor Setar", "Kuching", "Langkawi", "Melaka", "Penang", "Tawau"};
        
        for (String city : cities) {
            graph1.addVertex(city);
        }
        
        System.out.println("The number of vertices in graph1: " + graph1.getSize());
        System.out.println("Cities and their vertices:");
        
        for (int i = 0; i < graph1.getSize(); i++) {
            System.out.print(i + ": " + graph1.getVertex(i) + "\t");
        }
        
        System.out.println();
        System.out.println("Is Melaka in the Graph? " + graph1.hasVertex("Melaka"));
        System.out.println("Is Ipoh in the Graph? " + graph1.hasVertex("Ipoh"));
        System.out.println();
        System.out.println("Kuching at index: " + graph1.getIndex("Kuching"));
        System.out.println("Ipoh at index: " + graph1.getIndex("Ipoh"));
        System.out.println();
        
        System.out.println("Add edge Kuching - Melaka: " + graph1.addEdge("Kuching", "Melaka"));
        System.out.println("Add edge Langkawi - Penang: " + graph1.addEdge("Langkawi", "Penang"));
        System.out.println("Add edge Melaka - Penang: " + graph1.addEdge("Melaka", "Penang"));
        System.out.println("Add edge Alor Setar - Kuching: " + graph1.addEdge("Alor Setar", "Kuching"));
        System.out.println("Add edge Tawau - Alor Setar: " + graph1.addEdge("Tawau", "Alor Setar"));
        System.out.println("Add edge Kuching - Tawau: " + graph1.addEdge("Kuching", "Tawau"));
        System.out.println("Add edge Langkawi - Ipoh: " + graph1.addEdge("Langkawi", "Ipoh"));
        System.out.println();
        
        System.out.println("Has edge from Kuching to Melaka? " + graph1.hasEdge("Kuching", "Melaka"));
        System.out.println("Has edge from Melaka to Kuching? " + graph1.hasEdge("Melaka", "Kuching"));
        System.out.println("Has edge from Ipoh to Langkawi? " + graph1.hasEdge("Ipoh", "Langkawi"));
        System.out.println();
        
        System.out.println("Weight of edge from Kuching to Melaka? " + graph1.getEdgeWeight("Kuching", "Melaka"));
        System.out.println("Weight of edge from Tawau to Alor Setar? " + graph1.getEdgeWeight("Tawau", "Alor Setar"));
        System.out.println("Weight of edge from Semporna to Ipoh? " + graph1.getEdgeWeight("Semporna", "Ipoh"));
        System.out.println();
        
        System.out.println("In and out degree for Kuching: " + graph1.getIndeg("Kuching") + " and " + graph1.getOutdeg("Kuching"));
        System.out.println("In and out degree for Penang: " + graph1.getIndeg("Penang") + " and " + graph1.getOutdeg("Penang"));
        System.out.println("In and out degree for Ipoh: " + graph1.getIndeg("Ipoh") + " and " + graph1.getOutdeg("Ipoh"));
        System.out.println();
        
        System.out.println("Neighbours of Kuching: " + graph1.getNeighbours("Kuching"));
        System.out.println("\nPrint Edges:");
        graph1.printEdges();
        System.out.println();
        
        System.out.println("Add undirected edge Langkawi - Melaka: " + graph1.addUndirectedEdge("Langkawi", "Melaka"));
        graph1.printEdges();
        System.out.println();
    }
}
