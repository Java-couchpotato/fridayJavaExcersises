import bank.BankAccount;
import bank.Person;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

class MainTest {

    Main main = new Main();


    @org.junit.jupiter.api.Test
    void returnStars_case1() {

        List<BankAccount> bankAccountList = Arrays.asList(new BankAccount("DE61111111111"), new BankAccount("DE51111111111"), new BankAccount("DE71111111000"));
        List<BankAccount> bankAccountList2 = Arrays.asList(new BankAccount("DE61111111111"), new BankAccount("DE51111111111"), new BankAccount("DE71111111000"));
        List<BankAccount> bankAccountList3 = Arrays.asList(new BankAccount("DE61111111111"), new BankAccount("DE51111111111"), new BankAccount("DE71111111000"));

        List<Person> persons = Arrays.asList(new Person("Ivan", bankAccountList), new Person("Vasya", bankAccountList2), new Person("Masha", bankAccountList3));


        List<String> exp = Arrays.asList("DE6**********", "DE5**********", "DE7**********", "DE6**********", "DE5**********", "DE7**********", "DE6**********", "DE5**********", "DE7**********");

        assertEquals(exp, main.returnStars(persons));
    }
    @org.junit.jupiter.api.Test
    void returnStars_case2() {

        List<BankAccount> bankAccountList = Arrays.asList(new BankAccount("DE61111111111"), new BankAccount("DE51111111111"), new BankAccount("DE71111111000"));
        List<BankAccount> bankAccountList2 = Arrays.asList(new BankAccount("DE61111111111"), new BankAccount("DE51111111111"), new BankAccount("DE71111111000"));
        List<BankAccount> bankAccountList3 = Arrays.asList(new BankAccount("DE61111111111"), new BankAccount("DE51111111111"), new BankAccount("DE71111111000"));

        List<Person> persons = Arrays.asList(new Person("Ivan", bankAccountList), new Person("Vasya", bankAccountList2), new Person("Masha", bankAccountList3));


        List<String> exp = Arrays.asList("DE6**********", "DE5**********", "DE7**********", "DE6**********", "DE5**********", "DE7**********", "DE6**********", "DE5**********", "DE7**********");

        assertEquals(exp, main.returnStars(persons));
    }
}