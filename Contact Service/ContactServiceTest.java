import org.junit.Test;

import static org.junit.Assert.*;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        Contact contact = new Contact("1", "John", "Doe", "5555555555", "123 Success Dr.");
        ContactService service = new ContactService();

        service.addContact(contact);
        assertEquals(contact, service.getContactMap().get("1"));
    }

    @Test
    public void testAddContactWithRepeatId() {
        Contact contact = new Contact("1", "John", "Doe", "5555555555", "123 Success Dr.");
        ContactService service = new ContactService();

        service.addContact(contact);

        Contact contact2 = new Contact("1", "Amy", "Chen", "1111111111", "456 Happy Way");
        assertThrows(IllegalArgumentException.class, ()-> {
            service.addContact(contact2);
        });

    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1", "John", "Doe", "5555555555", "123 Success Dr.");
        ContactService service = new ContactService();

        service.addContact(contact);

        service.deleteContact("1");

        assertNull(service.getContactMap().get("1"));

    }

    @Test
    public void testDeleteContactNotFound() {
        ContactService service = new ContactService();

        assertThrows( IllegalArgumentException.class, () -> {
            service.deleteContact("1");
        });


    }

    @Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("1", "John", "Doe", "5555555555", "123 Success Dr.");
        ContactService service = new ContactService();

        service.addContact(contact);

        service.updateFirstName("1", "Amy");

        assertEquals("Amy", contact.getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        Contact contact = new Contact("1", "John", "Doe", "5555555555", "123 Success Dr.");
        ContactService service = new ContactService();

        service.addContact(contact);

        service.updateLastName("1", "Chen");

        assertEquals("Chen", contact.getLastName());
    }

    @Test
    public void testUpdatePhone() {
        Contact contact = new Contact("1", "John", "Doe", "5555555555", "123 Success Dr.");
        ContactService service = new ContactService();

        service.addContact(contact);

        service.updatePhone("1", "7777777777");

        assertEquals("7777777777", contact.getPhone());
    }

    @Test
    public void testUpdateAddress() {
        Contact contact = new Contact("1", "John", "Doe", "5555555555", "123 Success Dr.");
        ContactService service = new ContactService();

        service.addContact(contact);

        service.updateAddress("1", "456 Happy Way");

        assertEquals("456 Happy Way", contact.getAddress());
    }
}
