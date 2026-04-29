package level2;

public class USAContactFactory implements ContactFactory {

    @Override
    public Address getAddress(String street, String number, String postCode, String city) {
        return new USAddress(street, number, postCode, city);
    }

    @Override
    public Phone getPhone(String phoneNumber) {
        return new USPhone(phoneNumber);
    }
}
