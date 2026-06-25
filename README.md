# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts. This project is implemented incrementally, with each Use Case (UC) developed in a separate Git feature branch and merged into the `dev` and `main` branches.

---

# UC2 - Add a New Contact to Address Book

## Objective

Implement the ability to add a new contact to the Address Book by accepting user input from the console.

The application stores the following information for each contact:

* First Name
* Last Name
* Address
* City
* State
* ZIP Code
* Phone Number
* Email Address

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
* Reads contact details from the console using `Scanner`.
* Creates a `Contact` object.
* Creates an `AddressBook` object.
* Adds the contact to the address book.
* Displays the stored contact.

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

* Manages the relationship between the Address Book and Contact.
* Stores the contact object.
* Adds a contact to the address book.
* Displays the contact information.

---

# Features Implemented

* Read contact details from the console.
* Create a `Contact` object using the parameterized constructor.
* Store the contact in the `AddressBook`.
* Display the contact details using the overridden `toString()` method.
* Follow Object-Oriented Programming concepts.

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

Contact Details

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
```

---

# OOP Concepts Used

* Class
* Object
* Encapsulation
* Constructor
* Method
* Object Relationship
* Method Overriding (`toString()`)

---


