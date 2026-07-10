package com.bridgelabz.addressbook;
import java.util.*;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Adds a contact to the address book
    public void addContact(Contact contact) {

        boolean duplicate = contacts.stream().anyMatch(existing -> existing.equals(contact));

        if(boolean){
            System.out.println("Duplicate Contact Found. Contact Not Added.");
            return fasle;
        }

        contacts.add(contact);
        System.out.println("Contact Added Successfully.");
        return true;
    }

    // Display all contacts
    public void displayContacts() {
        for (Contact contact : contacts) {

            System.out.println(contact);
        }
    }

    // Display a particular contact using first name
    public void displayContact(String firstName) {

        for (Contact contact : contacts) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println(contact);
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    // Edit contact using first name
    public void editContact(String firstName) {

        Scanner scanner = new Scanner(System.in);

        for (Contact contact : contacts) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                System.out.println("Enter New Address : ");
                contact.setAddress(scanner.nextLine());

                System.out.println("Enter New City : ");
                contact.setCity(scanner.nextLine());

                System.out.println("Enter New State : ");
                contact.setState(scanner.nextLine());

                System.out.println("Enter New Zip Code : ");
                contact.setZip(scanner.nextLine());

                System.out.println("Enter New Phone Number : ");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.println("Enter New Email : ");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact Updated Successfully.");

                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    // Delete contact using first name
    public void deleteContact(String firstName) {

        for (Contact contact : contacts) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                contacts.remove(contact);

                System.out.println("Contact Deleted Successfully.");

                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    public List<Contact> searchByCity(String city){

        return  contacts.stream().filter(contact -> contact.getCity() != null && contact.getCity().equalsIgnoreCase(city).collect(Collector.toList()));
    }

    public List<Contact> searchByState(String  state){

        return contacts.stream.filter(contact -> contact.getState() != null && contact.getState().equalsIgnoreCase(city).collect(Collector.toList()));

    }



}