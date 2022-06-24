package telran.practice.animal;

import java.util.Comparator;

public class Animal {
    private String name;
    private int weight;
    private String colour;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }

    public Animal(String name, int weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }


}
