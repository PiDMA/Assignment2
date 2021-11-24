package com.project.assignmenttwo;

public class Contact {
    private String firstName;
    private String lastName;
    private String homePhone;
    private String workPhone;
    private Address homeAddress;
    private String email;
    private MyDate birthday;
    private String notes;

    //Constructor
    public Contact(String firstName, String lastName,
                   String homePhone, String workPhone,
                   Address homeAddress, String email,
                   MyDate birthday, String notes) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.homeAddress = homeAddress;
        this.email = email;
        this.birthday = birthday;
        this.notes = notes;
    }
    Address address = new Address();
    MyDate mydate = new MyDate();
    Contact Ctest = new Contact("Bob", "Tester", "123-home", "123-work", address, "Email-Test", mydate, "Notes-Test");

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", homeAddress=" + homeAddress +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", notes='" + notes + '\'' +
                '}';
    }
}
