package com.brlab.addressbooksystem;

class ContactPerson
{
    String firstName;
    String lastName;
    String city;
    String state;
    int zip;
    long mobileNo;
    String email;

    public ContactPerson(String firstName, String lastName, String city, String state, int zip, long mobileNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobileNo = mobileNo;
        this.email = email;
    }
}
public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in AddressBook Main class on Master Branch");
        ContactPerson contactPerson = new ContactPerson("Rohan","R","Mysuru","Karnataka",57008,9902508574L,"rohanrmanu99@gmail.com");

    }
}
