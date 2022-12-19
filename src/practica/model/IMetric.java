package practica.model;

import practica.model.Vertex;

public interface IMetric<V> {
    double distance(V from, V to);
}
