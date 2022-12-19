package practica.model;

public class EuclideanMetric implements IMetric<Point> {

    public double distance(Point from, Point to) {
        double dx = to.getX() - from.getX();
        double dy = to.getY() - from.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

}
