package telran.practice.animal;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

class AnimalTest {

    Animal animal1 = new Animal("Cat", 6, "white");
    Animal animal2 = new Animal("Dog", 16, "white-black");
    Animal animal0 = new Animal("Dog", 16, "white-black");
    Animal animal3 = new Pet("Dog", 16, "white-black", "Vasya Pupkin");
    Animal animal4 = new Pet("Hen", 6, "white-black", "Klava Petrovna");
    Animal animal5 = new Pet("Chameleon", 1, "green", "Alena K");

    List<Animal> alist = new ArrayList<>();
    List<Animal> expected = new ArrayList<>();
    @BeforeEach
    void init(){
        alist.add(animal0);
        alist.add(animal1);
        alist.add(animal2);
        alist.add(animal3);
        alist.add(animal4);
        alist.add(animal5);
    }

    @Test
    void compareTo_acsendingSameLastName() {

    }

}