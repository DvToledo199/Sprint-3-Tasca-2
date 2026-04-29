package level2;

public class SpainPhone implements Phone {

    private String phoneNumber;

    public SpainPhone(String phoneNumber) {
        if(phoneNumber == null)
            throw new IllegalArgumentException("Phone number cannot be null");
        if(phoneNumber.length() != 9)
            throw new IllegalArgumentException("Phone number must contain exactly 9 digits");
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getFormatted() {
        String part1 = phoneNumber.substring(0, 3);
        String part2 = phoneNumber.substring(3, 6);
        String part3 = phoneNumber.substring(6, 9);

        return "+34 " + part1 + " " + part2 + " " + part3;
    }
}
