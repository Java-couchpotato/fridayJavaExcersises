package telran.practice.animal;

import telran.practice.animal.Animal;

import java.util.Comparator;

public class PetByWeight implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
