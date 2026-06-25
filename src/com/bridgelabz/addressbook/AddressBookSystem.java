package com.bridgelabz.addressbook;
import java.util.*;

public class AddressBookSystem {

    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Read contact details from the user
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name : ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address : ");
        String address = scanner.nextLine();

        System.out.print("Enter City : ");
        String city = scanner.nextLine();

        System.out.print("Enter State : ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip Code : ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number : ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email : ");
        String email = scanner.nextLine();

        // Create Contact object
        Contact contact = new Contact(
                firstName,
                lastName,
                address,
                city,
                state,
                zip,
                phoneNumber,
                email
        );

        // Create AddressBook object
        AddressBook addressBook = new AddressBook();

        // Add contact to address book
        addressBook.addContact(contact);

        // Display contact details
        System.out.println("Contact Details");
        addressBook.displayContact(firstName);

        // Edit Contact
        System.out.print("Enter First Name to Edit : ");
        String name = scanner.nextLine();

        addressBook.editContact(name);

        System.out.println("Updated Contact Details");
        addressBook.displayContacts();

        // Delete Contact
        System.out.print("Enter First Name to Delete : ");
        String userName = scanner.nextLine();

        addressBook.deleteContact(userName);

        System.out.println("Remaining Contacts");

        addressBook.displayContacts();
    }


}
