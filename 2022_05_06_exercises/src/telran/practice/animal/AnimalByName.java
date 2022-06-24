package telran.practice.animal;

import telran.practice.animal.Animal;

import java.util.Comparator;

public class AnimalByName implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
