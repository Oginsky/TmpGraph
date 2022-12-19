package practica.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<Data, Metric extends IMetric<Data>> {
    private HashMap<Integer, Vertex<Data>> vertexes;
    private HashMap<Integer, ArrayList<Vertex<Data>> > neighbors;

    public EuclideanMetric metric;

    public Graph() {
        vertexes = new HashMap<>();
        vertexes = new HashMap<>();
        neighbors = new HashMap<>();
        metric = new EuclideanMetric();
    }

    public double getEdgeCost(Vertex<Point> from, Vertex<Point> to) {
        return metric.distance(from.getData(), to.getData());
    }

    public void addVertex(int id, Data data) throws IllegalArgumentException {
        if(vertexes.containsKey(id))
            throw new IllegalArgumentException();

        vertexes.put(id, new Vertex<Data>(id, data));
    }

    public void addEdge(Vertex from, Vertex to) throws IllegalArgumentException {
        if(!vertexes.containsKey(from.getId()) || !vertexes.containsKey(to.getId()))
            throw new IllegalArgumentException();

        neighbors.computeIfAbsent(from.getId(), k -> new ArrayList<>());
        neighbors.get(from.getId()).add(to);
    }

    public Vertex<Data> getVertex(int id) {
        return vertexes.get(id);
    }

    public boolean hasVertex(int id) {
        return vertexes.containsKey(id);
    }

    public boolean hasEdge(int from, int to) {
        if(!neighbors.containsKey(from)) return false;

        return neighbors.get(from).contains(getVertex(to));
    }


}
