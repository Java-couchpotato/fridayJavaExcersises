package telran.practice.animal;

import telran.practice.animal.Animal;

public class Pet extends Animal {
   private String owner;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", colour='" + getColour() + '\'' +
                '}'+"Pet{" +
                "owner='" + owner + '\'' +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public Pet(String name, int weight, String colour, String owner) {
        super(name, weight, colour);
        this.owner = owner;
    }

}
