package com.bridgelabz.addressbook;

public class AddressBookSystem {

    public  static  void main(String[] args){

        // Create a Contact object with sample details
        Contact contact = new Contact(
                "Jyothish",
                "Mypati",
                "Hyderabad",
                "Hyderabad",
                "Telangana",
                "500081",
                "9876543210",
                "jyothish@gmail.com"
        );
        // Display the contact information
        System.out.println(contact);
    }
}
