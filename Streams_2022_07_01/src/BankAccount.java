package string_02_02_22hw.Streams_2022_07_01.src;

public class BankAccount {
    private String IBAN;
    private Customer customer;

    public String getIBAN() {
        return IBAN;
    }

    public Customer getCustomer() {
        return customer;
    }

    public BankAccount(String IBAN, Customer customer) {
        this.IBAN = IBAN;
        this.customer = customer;
    }
}
