package bank;

import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private List<BankAccount> accounts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(accounts, person.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accounts);
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public Person(String name, List<BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
