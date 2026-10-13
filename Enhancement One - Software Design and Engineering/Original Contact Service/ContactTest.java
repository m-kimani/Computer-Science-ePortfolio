import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void testContactClass() {
        Contact contact = new Contact("1", "John", "Doe", "5555555555", "123 Success Dr.");
        assertEquals("1", contact.getId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("5555555555", contact.getPhone());
        assertEquals("123 Success Dr.", contact.getAddress());
    }

    @Test
    public void testIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("10000000000", "John", "Doe", "5555555555", "123 Success Dr.");
        });
    }

    @Test
    public void testIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "5555555555", "123 Success Dr.");
        });
    }

    @Test
    public void testSetFirstName() {
        Contact contact = new Contact();
        contact.setFirstName("John");

        assertEquals("John", contact.getFirstName());
    }

    @Test
    public void testFirstNameTooLong() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName("Jonathaniel");
        });
    }

    @Test
    public void testFirstNameNull() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName(null);
        });
    }

    @Test
    public void testSetLastName() {
        Contact contact = new Contact();
        contact.setLastName("Doe");

        assertEquals("Doe", contact.getLastName());
    }

    @Test
    public void testLastNameTooLong() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName("Doofenshmirtz");
        });
    }

    @Test
    public void testLastNameNull() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName(null);
        });
    }

    @Test
    public void testSetPhone() {
        Contact contact = new Contact();
        contact.setPhone("5555555555");

        assertEquals("5555555555", contact.getPhone());
    }

    @Test
    public void testPhoneTooLong() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("55555555551");
        });
    }

    @Test
    public void testPhoneTooShort() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("555555555");
        });
    }

    @Test
    public void testPhoneNull() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone(null);
        });
    }

    @Test
    public void testSetAddress() {
        Contact contact = new Contact();
        contact.setAddress("123 Success Dr.");

        assertEquals("123 Success Dr.", contact.getAddress());
    }

    @Test
    public void testAddressTooLong() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress("123 Success Dr. Santa Monica, CA 90401");
        });
    }

    @Test
    public void testAddressNull() {
        Contact contact = new Contact();
        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress(null);
        });
    }

}
