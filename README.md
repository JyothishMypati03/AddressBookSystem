# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts.

---

# UC3 - Edit Existing Contact

## Objective

Implement the ability to edit an existing contact in the Address Book using the contact's **first name**.

The application allows the user to:

* Search for an existing contact using the first name.
* Update the contact details using console input.
* Display the updated contact information.

---

# Project Structure

```text
AddressBookSystem
│
├── src
│   └── com
│       └── bridgelabz
│           └── addressbook
│               ├── AddressBookSystem.java
│               ├── AddressBook.java
│               └── Contact.java
│
├── README.md
└── .gitignore
```

---

# Classes

## AddressBookSystem

Responsibilities:

* Starts the application.
* Reads contact details from the console.
* Creates a `Contact` object.
* Adds the contact to the `AddressBook`.
* Accepts the contact name to edit.
* Displays the updated contact information.

---

## Contact

Responsibilities:

* Stores contact information.
* Provides constructors.
* Provides getter and setter methods.
* Overrides the `toString()` method to display contact details.

Fields:

* First Name
* Last Name
* Address
* City
* State
* ZIP Code
* Phone Number
* Email Address

---

## AddressBook

Responsibilities:

* Stores contacts.
* Adds new contacts.
* Displays contact details.
* Searches for a contact using the first name.
* Updates an existing contact.

---

# Features Implemented

* Add a new contact.
* Display contact details.
* Search a contact using the first name.
* Edit:

    * Address
    * City
    * State
    * ZIP Code
    * Phone Number
    * Email Address
* Display the updated contact information.

---

# Sample Output

```text
Enter First Name : Jyothish
Enter Last Name : Mypati
Enter Address : Hyderabad
Enter City : Hyderabad
Enter State : Telangana
Enter Zip Code : 500081
Enter Phone Number : 9876543210
Enter Email : jyothish@gmail.com

Contact Added Successfully

Enter First Name to Edit : Jyothish

Enter New Address : Bangalore
Enter New City : Bangalore
Enter New State : Karnataka
Enter New Zip Code : 560001
Enter New Phone Number : 9999999999
Enter New Email : jyothish@gmail.com

Contact Updated Successfully

Updated Contact Details

Contact{
firstName='Jyothish',
lastName='Mypati',
address='Bangalore',
city='Bangalore',
state='Karnataka',
zip='560001',
phoneNumber='9999999999',
email='jyothish@gmail.com'
}
```

---

# OOP Concepts Used

* Class
* Object
* Encapsulation
* Constructors
* ArrayList
* Getter and Setter Methods
* Method Overriding (`toString()`)
* Object Composition
