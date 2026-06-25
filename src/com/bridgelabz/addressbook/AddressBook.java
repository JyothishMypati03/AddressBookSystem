package com.bridgelabz.addressbook;

public class AddressBook {

    private Contact contact;

    // Adds a contact to the address book
    public void addContact(Contact contact) {
        this.contact = contact;
    }

    // Displays the contact details
    public void displayContact() {
        System.out.println(contact);
    }
}