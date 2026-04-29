package level2;

interface ContactFactory {

    Address getAddress(String street, String number, String postCode, String city);
    Phone getPhone(String phoneNumber);
}
