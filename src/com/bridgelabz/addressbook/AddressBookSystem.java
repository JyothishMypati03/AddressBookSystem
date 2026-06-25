package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dictionary to store multiple Address Books
        HashMap<String, AddressBook> addressBooks = new HashMap<>();

        while (true) {

            System.out.println("\n========== ADDRESS BOOK SYSTEM ==========");
            System.out.println("1. Create Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Display Address Books");
            System.out.print("Enter Your Choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Address Book Name : ");
                    String bookName = scanner.nextLine();

                    if (addressBooks.containsKey(bookName)) {
                        System.out.println("Address Book Already Exists.");
                    } else {
                        addressBooks.put(bookName, new AddressBook());
                        System.out.println("Address Book Created Successfully.");
                    }
                    break;

                case 2:

                    System.out.print("Enter Address Book Name : ");
                    bookName = scanner.nextLine();

                    if (!addressBooks.containsKey(bookName)) {
                        System.out.println("Address Book Not Found.");
                        break;
                    }

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

                    addressBooks.get(bookName).addContact(contact);

                    System.out.println("Contact Added Successfully.");
                    break;

                case 3:

                    System.out.print("Enter Address Book Name : ");
                    bookName = scanner.nextLine();

                    if (addressBooks.containsKey(bookName)) {
                        addressBooks.get(bookName).displayContacts();
                    } else {
                        System.out.println("Address Book Not Found.");
                    }
                    break;

                case 4:

                    System.out.print("Enter Address Book Name : ");
                    bookName = scanner.nextLine();

                    if (!addressBooks.containsKey(bookName)) {
                        System.out.println("Address Book Not Found.");
                        break;
                    }

                    System.out.print("Enter First Name to Edit : ");
                    String editName = scanner.nextLine();

                    addressBooks.get(bookName).editContact(editName);

                    break;

                case 5:

                    System.out.print("Enter Address Book Name : ");
                    bookName = scanner.nextLine();

                    if (!addressBooks.containsKey(bookName)) {
                        System.out.println("Address Book Not Found.");
                        break;
                    }

                    System.out.print("Enter First Name to Delete : ");
                    String deleteName = scanner.nextLine();

                    addressBooks.get(bookName).deleteContact(deleteName);

                    break;

                case 6:

                    if (addressBooks.isEmpty()) {
                        System.out.println("No Address Books Available.");
                    } else {

                        System.out.println("\nAvailable Address Books");

                        for (Map.Entry<String, AddressBook> entry : addressBooks.entrySet()) {
                            System.out.println("- " + entry.getKey());
                        }
                    }

                    break;


                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}