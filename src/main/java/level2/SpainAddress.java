package level2;

public class SpainAddress implements Address {

    private String street;
    private String number;
    private String postCode;
    private String city;

    public SpainAddress(String street, String number, String postCode, String city) {
        if (street == null || street.isBlank()) {
            throw new IllegalArgumentException("Street cannot be null or blank");
        }
        if (number == null || number.isBlank()) {
            throw new IllegalArgumentException("Number cannot be null or blank");
        }
        if (postCode == null || postCode.isBlank()) {
            throw new IllegalArgumentException("Post code cannot be null or blank");
        }
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("City cannot be null or blank");
        }
        this.street = street;
        this.number = number;
        this.postCode = postCode;
        this.city = city;
    }

    @Override
    public String getFormatted() {
        return street + " " + number + ", " + postCode + " " + city;
    }
}
