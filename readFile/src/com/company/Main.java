package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // System.out.println(readAndReturnSum("fileSum.txt"));
        System.out.println(returnLongestString("fileSum.txt"));
        Person person1 = new Person("Ibana",40);
        Person person2 = new Person("Iklofna",10);
        Person person3 = new Person("Isifa",90);
        List<Person>people = Arrays.asList(person1, person2, person3);
        writeToFile("persons.txt",people);
    }

    //4. Записать в файл обьекты класса Person (name, age) в таком виде: name, age.
    //"Petr", 35
    // Semen, 3
    // Petr, 35
    public static List<Person> writeToFile(String fileName, List<Person> persons) throws IOException {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName, true));
             BufferedWriter br1 = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (Person person : persons) {
                br.write("\"" + person.name + "\"" + "," + person.age);
                br1.write("\"" + person.name + "\"" + "," + person.age);
                br1.newLine();
                br1.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return persons;
    }

    //3.есть текстовый файл содержащий имена и возраст людей в каждой строке,такого вида:
    //написать метод, возвращающий список людей (имена и возраст) старше 18 лет,
    // отсортированный по возрасту
    public static List<Person> composeList(String fileName) throws IOException {
        List<Person> persons = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                temp.add(line);
            }

        } catch (IOException e) {
            System.out.println("no file was founded");
            e.printStackTrace();
        }
        for (String s : temp) {
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if (age > 18)
                persons.add(new Person(nameAge[0].trim(), age));
        }
        //Collections.sort(persons);
        return null;
    }


    //1 есть текстовый файл
    //прочитать его и вернуть сумму всех чисел

    public static int readAndReturnSum(String filename) throws IOException {
        int sum = 0;
        String lineInt;

        try (BufferedReader bf = new BufferedReader(new FileReader(filename))) {
            while ((lineInt = bf.readLine()) != null) {
                sum += Integer.parseInt(lineInt);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sum;
    }
    //2. написать метод, возвращающий самую длинную строкув текстовом файле

    public static String returnLongestString(String filename) throws FileNotFoundException {
        String longest = "";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                if (line.length() > longest.length()) {
                    longest = line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return longest;
    }

}
