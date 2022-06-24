package telran.practice.shape;
public class Square extends Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    int getSquare() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}