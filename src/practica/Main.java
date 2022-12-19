package practica;

import practica.model.*;

public class Main {

    public static void main(String[] args) {
        Graph<Point, EuclideanMetric> graph = new Graph<>();

        graph.addVertex(1, new Point(0,0));
        graph.addVertex(2, new Point(5,0));
        graph.addVertex(3, new Point(10,10));

        graph.addEdge(graph.getVertex(1), graph.getVertex(2));
        graph.addEdge(graph.getVertex(2), graph.getVertex(3));

        System.out.println(graph.getEdgeCost(graph.getVertex(1), graph.getVertex(2)));
    }
}
