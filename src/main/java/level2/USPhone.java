package level2;

public class USPhone implements Phone {
    private String phoneNumber;

    public USPhone(String phoneNumber) {
        if(phoneNumber == null)
            throw new IllegalArgumentException("Phone number cannot be null");
        if(phoneNumber.length() != 9)
            throw new IllegalArgumentException("Phone number must contain exactly 9 digits");

        this.phoneNumber = phoneNumber;
    }


    @Override
    public String getFormatted() {
        String part1 = phoneNumber.substring(0, 2);
        String part2 = phoneNumber.substring(2, 5);
        String part3 = phoneNumber.substring(5, 9);

        return "+1 (0" + part1 + ") " + part2 + "-" + part3;
    }
}
