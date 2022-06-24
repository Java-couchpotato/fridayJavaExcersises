package telran.practice.shape;

public abstract class Shape implements Comparable<Shape> {
    abstract int getSquare();

    @Override
    public int compareTo(Shape o) {
        return this.getSquare() - o.getSquare();
    }
}

