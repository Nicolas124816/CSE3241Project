package Entities.Superclasses;

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private int phone;
    private String email;

    public Person(String firstName, String lastName, String address, int phone,
            String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String person = "First Name: " + this.firstName + "\nLast Name: "
                + this.lastName + "\nAddress: " + this.address
                + "\nPhone number: " + this.phone + "\nEmail Address: "
                + this.email;
        return person;
    }

}
