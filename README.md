# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts. The project is implemented incrementally, with each Use Case (UC) adding new functionality to the Address Book.

---

# UC4 - Delete Contact

## Objective

Implement the ability to delete an existing contact from the Address Book using the contact's **first name**.

The application allows the user to:

* Add a new contact.
* Display all contacts.
* Edit an existing contact.
* Delete an existing contact using the first name.

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
* Adds the contact to the Address Book.
* Accepts the contact name to delete.
* Displays the remaining contacts.

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

* Store multiple contacts using `ArrayList`.
* Add a new contact.
* Display all contacts.
* Search a contact using the first name.
* Edit an existing contact.
* Delete an existing contact.

---

# Features Implemented

* Add a new contact.
* Display all contacts.
* Edit an existing contact.
* Delete a contact using the first name.
* Display the updated contact list after deletion.

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

All Contacts

Contact{
firstName='Jyothish',
lastName='Mypati',
address='Hyderabad',
city='Hyderabad',
state='Telangana',
zip='500081',
phoneNumber='9876543210',
email='jyothish@gmail.com'
}

Enter First Name to Delete : Jyothish

Contact Deleted Successfully.

Remaining Contacts

No Contacts Found.
```
