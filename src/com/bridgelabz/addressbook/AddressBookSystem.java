package com.bridgelabz.addressbook;
import java.util.*;

public class AddressBookSystem {

    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        char choice;

        do {

            System.out.println("\nEnter Contact Details");

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

            addressBook.addContact(contact);

            System.out.print("\nDo you want to add another contact? (Y/N): ");
            choice = scanner.next().charAt(0);
            scanner.nextLine();

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nAll Contacts");

        addressBook.displayContacts();


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
