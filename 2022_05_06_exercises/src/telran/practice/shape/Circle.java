package telran.practice.shape;
public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    int getSquare() {
        if (radius >= 0)
            return (int)(Math.PI*radius*radius);
        else return -1;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}