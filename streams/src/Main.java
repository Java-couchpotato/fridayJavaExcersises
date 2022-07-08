import bank.Person;

import java.util.List;
import java.util.stream.Collectors;

//3. Класс Person имеет поля name and age. Написать метод, возвращающий имена тех, кто является
// совершеннолетним в Германии (старше 17 лет). При этом метод возвращает строку приметно такого
// содержания: in Germany Ivan and Petr are of legal age

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // 1.Класс BankAccount имеет поле IBAN  а класс Person имеет поле name и поле   List<BankAccount>.
// Написать метод, возвращающий IBANs в которых в которых  номера заменены * после третьего символа
//[DE2********,DE5***********,]


    private static String replaceStars(String iban) {
        char[] ch = iban.toCharArray();
        for (int i = 3; i < iban.length(); i++) {
            ch[i] = '*';
        }
        return new String(ch);
    }

    public static List<String> returnStars(List<Person> persons) {
        return persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .map(ac -> ac.getIBAN())
                .map(iban -> replaceStars(iban))
                .collect(Collectors.toList());
    }

    //2. Класс Person имеет поля name and age. Написать метод, возвращающий общий
// возраст всех людей старше 17 лет. (2 способа)

    public static


}