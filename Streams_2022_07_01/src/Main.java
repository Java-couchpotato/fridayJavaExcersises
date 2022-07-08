import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    //
//   // 2. Написать метод, возвращающий список имен без дупликатов двумя способами:
//   //в Set и в Listе
    public static Set<String> withoutDuplicates(List<String> names) {

        return names.stream().collect(Collectors.toSet());
    }

    public static List<String> withoutDuplicates2() {
        Stream<String> names = Stream.of("Vasya", "Petya", "Misha", "Kolya");
        return names.distinct().collect(Collectors.toList());
    }

    //
//   //3. Есть лист Persons из первой задачи. Написать метод,
//   возвращающий map, где возраст это ключ а список персонов
//        // значение
    public static Map<Integer, List<Persons>> returnMap(List<Persons> input) {
        return input.stream()
                .collect(Collectors.groupingBy(Persons::getAge));
    }

    //
//   //4. Есть класс Customer  с полем имя и класс BankAccount c полями IBAN and Customer.
//        // Написать метод, возвращающий мапу где customer это ключ, а список его счетов value
    //public static Map<Customer,List<BankAccount>mapAccountsByCustomer(List <BankAccount>input)
    // Ivanov=[Account{IBAN="DE123455",owner=Ivanov, BankAccount{IBAN="DE456767_owner=Ivamov], Sidorov

    public static Map<Customer, List<BankAccount>> mapAccountsByCustomer(List<BankAccount> input) {
        return input.stream().collect(Collectors.groupingBy(BankAccount::getCustomer));
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public List<String> listOfAccountsWithStars(List<BankAccount> input) {
        return input.stream().map(x -> (replaceStars(x.getIBAN()))).collect(Collectors.toList());
    }

    private String replaceStars(String iban) {
        char[] ch = iban.toCharArray();
        for (int i = 3; i < iban.length(); i++) {
            ch[i] = '*';
        }
        return new String(ch);
    }


    //6. Метод принимает строку состоящую из слов , разделенных пробелом и букву.
    // Возвращает количество слов, начинающихся с этой буквы

    public static long numberOfWords(String input, String w){
        List<String>text = Arrays.asList(input.split(""));
        return text.stream().filter(s->s.startsWith(w)).count();
    }

    //7
    public static boolean isNum(String input){
        return input.chars().noneMatch(Character::isDigit);
    }
    //8


}