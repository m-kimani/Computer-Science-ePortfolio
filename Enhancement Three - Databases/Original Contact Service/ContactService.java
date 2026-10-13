import java.util.HashMap;

public class ContactService {

    private final HashMap<String, Contact> contactMap = new HashMap<>();

    public void addContact(Contact contact) {

        if(!contactMap.containsKey(contact.getId())) {
            contactMap.put(contact.getId(), contact);
        } else {
            throw new IllegalArgumentException("Error: contact id must be unique.");
        }
    }

    public void deleteContact(String id) {
        if(contactMap.containsKey(id)) {
            contactMap.remove(id);
        } else {
            throw new IllegalArgumentException("This contact does not exist.");
        }
    }

    public void updateFirstName(String id, String firstName) {
        Contact contact = contactMap.get(id);
        contact.setFirstName(firstName);
    }

    public void updateLastName(String id, String lastName) {
        Contact contact = contactMap.get(id);
        contact.setLastName(lastName);
    }

    public void updatePhone(String id, String phone) {
        Contact contact = contactMap.get(id);
        contact.setPhone(phone);
    }

    public void updateAddress(String id, String address) {
        Contact contact = contactMap.get(id);
        contact.setAddress(address);
    }

    public HashMap<String, Contact> getContactMap() {
        return contactMap;
    }

}

