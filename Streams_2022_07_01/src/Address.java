package string_02_02_22hw.Streams_2022_07_01.src;

public class Address {
    String street;
    int houseNum;

    public Address(String street, int houseNum) {
        this.street = street;
        this.houseNum = houseNum;
    }

    @Override
    public String toString() {
        return "Addresse{" +
                "street='" + street + '\'' +
                ", houseNum=" + houseNum +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNum() {
        return houseNum;
    }
}
