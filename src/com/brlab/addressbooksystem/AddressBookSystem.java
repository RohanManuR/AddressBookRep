package com.brlab.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

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
    public void displayPersonDetails()
    {
        System.out.println("First name : "+this.firstName);
        System.out.println("Last name : "+this.lastName);
        System.out.println("city : "+this.city);
        System.out.println("state : "+this.state);
        System.out.println("zip : "+this.zip);
        System.out.println("Mobile no : "+this.mobileNo);
        System.out.println("Email : "+this.email);
    }
}
public class AddressBookSystem {
   static ArrayList<ContactPerson> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in AddressBook Main class on Master Branch");
        ContactPerson contactPerson = new ContactPerson("Rohan","R","Mysuru","Karnataka",57008,9902508574L,"rohanrmanu99@gmail.com");
        list.add(contactPerson);
        contactPerson.displayPersonDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name");
        String firstName = scanner.next();
        System.out.println("Enter Last name");
        String lastName = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter state");
        String state = scanner.next();
        System.out.println("Enter Zip");
        int zip = scanner.nextInt();
        System.out.println("Enter Mobile number");
        long mob = scanner.nextLong();
        System.out.println("Enter email");
        String email = scanner.next();

        ContactPerson contactPerson2 = new ContactPerson(firstName,lastName,city,state,zip,mob,email);
        list.add(contactPerson2);
        contactPerson2.displayPersonDetails();

        System.out.println("Enter Person name to update person details");
        String name = scanner.next();
        for (int i=0;i<list.size();i++)
        {
            if(list.get(i).firstName.equals(name))
            {
                System.out.println("Yes, Person details present you can update,...");
            }
            else {
                System.out.println("Sorry, Person details not present you can't update,...");
            }
        }

    }
}
