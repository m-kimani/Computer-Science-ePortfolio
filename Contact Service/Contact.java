public class Contact {
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    protected Contact() {
    }

    protected Contact(String id, String firstName, String lastName, String phone, String address) {
        if(id != null && id.length() <= 10) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Error: Invalid id entered.");
        }
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    protected void setFirstName(String firstName) {
        if(firstName != null && firstName.length() <= 10) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Error: Invalid first name entered." + firstName);
        }
     }

    public String getLastName() {
        return this.lastName;
    }

    protected void setLastName(String lastName) {
        if(lastName != null && lastName.length() <= 10) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Error: Invalid last name entered." + lastName);
        }
    }

    public String getPhone() {
        return this.phone;
    }

    protected void setPhone(String phone) {
        if(phone != null && phone.length() == 10) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Error: Invalid phone number entered." + phone);
        }
    }

    public String getAddress() {
        return this.address;
    }

    protected void setAddress(String address) {
        if(address != null && address.length() <= 30) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Error: Invalid address entered." + address);
        }
    }

}
