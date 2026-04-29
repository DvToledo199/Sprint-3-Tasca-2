package level2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactFactoryTest {

    @Test
    void testSpainAddressFormat() {
        ContactFactory factory = new SpainContactFactory();

        Address address = factory.getAddress("Calle X", "10", "08001", "Barcelona");
        String result = address.getFormatted();

        assertEquals("Calle X 10, 08001 Barcelona", result);
    }

    @Test
    void testSpainPhone() {
        ContactFactory factory = new SpainContactFactory();

        Phone phone = factory.getPhone("673947263");
        String result = phone.getFormatted();

        assertEquals("+34 673 947 263", result);
    }
    @Test
    void testSpainPhoneNullThrowsException() {
        ContactFactory factory = new SpainContactFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.getPhone(null);
        });
    }

    @Test
    void testSpainPhoneInvalidLengthThrowsException() {
        ContactFactory factory = new SpainContactFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.getPhone("123");
        });
    }

    @Test
    void testSpainAddressNullStreetThrowsException() {
        ContactFactory factory = new SpainContactFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.getAddress(null, "10", "08001", "Barcelona");
        });
    }

    @Test
    void testSpainAddressBlankCityThrowsException() {
        ContactFactory factory = new SpainContactFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.getAddress("Calle X", "10", "08001", " ");
        });
    }

    @Test
    void testUSPhoneNullThrowsException() {
        ContactFactory factory = new USAContactFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.getPhone(null);
        });
    }

    @Test
    void testUSAddressBlankStreetThrowsException() {
        ContactFactory factory = new USAContactFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.getAddress(" ", "10", "10001", "New York");
        });
    }
}
