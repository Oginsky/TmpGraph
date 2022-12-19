package practica.model;

import java.lang.Comparable;

public class Vertex<Data> implements Comparable<Vertex<Data>> {

    private int id;
    private Data data;

    public Vertex()
    {

    }

    public Vertex(int id, Data data)
    {
        this.id = id;
        this.data = data;
    }

    public boolean equals(Vertex<Data> node) {
        if (this == node) {
            return true;
        }
        return this.id == node.id;
    }

    public int getId() {
        return id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int compareTo(Vertex<Data> v){
        return Integer.compare(this.id, v.id);
    }
}