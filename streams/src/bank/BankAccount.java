package bank;

import java.util.Objects;

public class BankAccount {
    private String IBAN;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(IBAN, that.IBAN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IBAN);
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "IBAN='" + IBAN + '\'' +
                '}';
    }

    public BankAccount(String IBAN) {
        this.IBAN = IBAN;
    }
}
