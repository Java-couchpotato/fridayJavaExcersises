import telran.practice.animal.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //создать класс Animal с полями name, weight, colour и класс Pet расширяющий его с доп. полем
    //owner. Вывести на экран список животных, упорядоченный по имени, список домашних животных(из класса
    //Pet) упорядоченный по весу и список имен животных упорядоченный по возрастанию последней буквы
    //имени. Использовать компараторы. Написать тесты
    //
    //есть класс Employee c полями id, name, age, salary. Сделать его comparable по id.
    //Создать дополнительные возможности сортирвоки по: зарплате, возрасту, имени а также возможность
    //сортирвоки по имени если возраст одинаковый. В решении использовать ArrayList. Написать тесты
    public static void main(String[] args) {

        Animal animal1 = new Animal("Cat",6,"white");
        Animal animal2 = new Animal("Dog",16,"white-black");
        Animal animal3 = new Pet("Dog",16,"white-black","Vasya Pupkin");
        Animal animal4 = new Pet("Hen",6,"white-black","Klava Petrovna");
        Animal animal5 = new Pet("Chameleon",1,"green","Alena K");
        List<Animal>lost = new ArrayList<>();
        List<Pet>listPet = new ArrayList<>();
        lost.add(animal2);
        lost.add(animal1);
        listPet.add((Pet) animal3);
        listPet.add((Pet) animal4);
        listPet.add((Pet) animal5);
        System.out.println("list before sorting "+ lost);
        System.out.println("listPet before sorting "+ listPet);
        lost.sort(new AnimalAscending());
        System.out.println("Sort after sorting acsending "+lost);
        lost.sort(new AnimalByName());
        System.out.println("Sort after sorting by name "+lost);
        listPet.sort(new PetByWeight());
        System.out.println("Sort after sorting pets "+listPet);


    }
}