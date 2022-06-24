package telran.practice.animal;

import telran.practice.animal.Animal;

import java.util.Comparator;

public class AnimalAscending implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        String name1 = o1.getName();
        String name2 = o1.getName();
        String lastLetter1 = name1.substring(name1.length()-1);
        String lastLetter2 = name2.substring(name2.length()-1);
        return lastLetter1.compareTo(lastLetter2);
    }

}
