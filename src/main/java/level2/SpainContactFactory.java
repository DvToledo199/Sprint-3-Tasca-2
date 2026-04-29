package level2;

public class SpainContactFactory implements ContactFactory {
    @Override
    public Address getAddress(String street, String number, String postCode, String city) {
        return new SpainAddress(street, number, postCode, city);
    }

    @Override
    public Phone getPhone(String phoneNumber) {
        return new SpainPhone(phoneNumber);
    }
}
