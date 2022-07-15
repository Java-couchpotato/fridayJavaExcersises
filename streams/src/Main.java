import bank.BankAccount;
import bank.Person;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    // Есть класс Person с переменными String name and int salary.
    // Написать кастом коллектор, считающий суммарную зарплату всех людей.

    public static void main(String[] args) {
        Stream<string_02_02_22hw.streams.src.Person3> persons = Stream.of(new string_02_02_22hw.streams.src.Person3("Ivan", 4000), new string_02_02_22hw.streams.src.Person3("Sergey", 3000), new string_02_02_22hw.streams.src.Person3("Evgeniy", 13000));
        Collector<string_02_02_22hw.streams.src.Person3, List<string_02_02_22hw.streams.src.Person3>, Integer> sumAgeCollector = new SumAgeCollector();

        int sum = persons.collect(sumAgeCollector);
        System.out.println(sum);
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
                .map(BankAccount::getIBAN)
                .map(Main::replaceStars)
                .collect(Collectors.toList());
    }

    //2. Класс Person имеет поля name and age. Написать метод, возвращающий общий
// возраст всех людей старше 17 лет. (2 способа)

    public static int findSumOfAges(List<Person2> persons) {
        return persons.stream()
                .filter(age -> age.getAge() > 17)
                .collect(Collectors.summingInt(Person2::getAge));
    }


//3. Класс Person имеет поля name and age. Написать метод, возвращающий имена тех, кто является
// совершеннолетним в Германии (старше 17 лет). При этом метод возвращает строку приметно такого
// содержания: in Germany Ivan and Petr are of legal age



}