# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts. This project is implemented incrementally, with each Use Case (UC) introducing new functionality to the Address Book application.

---

# UC6 - Maintain Multiple Address Books

## Objective

Implement the ability to maintain multiple Address Books in the application.

Each Address Book has a unique name (for example, **Family**, **Friends**, or **Office**) and stores its own collection of contacts.

The application allows the user to:

* Create multiple Address Books.
* Store contacts in different Address Books.
* Display contacts from a selected Address Book.
* Edit contacts within a selected Address Book.
* Delete contacts from a selected Address Book.
* View all available Address Books.

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
* Creates multiple Address Books.
* Maintains all Address Books using a `HashMap`.
* Allows users to select an Address Book.
* Performs contact operations on the selected Address Book.

---

## AddressBook

Responsibilities:

* Stores multiple contacts.
* Adds new contacts.
* Displays all contacts.
* Displays a particular contact.
* Edits an existing contact.
* Deletes an existing contact.

---

## Contact

Responsibilities:

* Stores contact details.
* Provides constructors.
* Provides getter and setter methods.
* Overrides the `toString()` method.

Contact Fields:

* First Name
* Last Name
* Address
* City
* State
* ZIP Code
* Phone Number
* Email Address

---

# Collection Framework Used

## HashMap

```java
HashMap<String, AddressBook>
```

The `HashMap` stores multiple Address Books.

Example:

* Family
* Friends
* Office

Each key is the Address Book name, and each value is an `AddressBook` object.

---

## ArrayList

```java
ArrayList<Contact>
```

Each `AddressBook` maintains its own list of contacts using an `ArrayList`.

---

# Features Implemented

* Create multiple Address Books.
* Store contacts in different Address Books.
* Add contacts to a selected Address Book.
* Display contacts from a selected Address Book.
* Edit an existing contact.
* Delete an existing contact.
* Display all available Address Books.

---

# Program Flow

1. Start the application.
2. Create one or more Address Books.
3. Select an Address Book.
4. Add contacts to the selected Address Book.
5. Display, edit, or delete contacts.
6. View all available Address Books.
7. Exit the application.

---

# Sample Output

```text
========== ADDRESS BOOK SYSTEM ==========

1. Create Address Book
2. Add Contact
3. Display Contacts
4. Edit Contact
5. Delete Contact
6. Display Address Books
7. Exit

Enter Your Choice : 1

Enter Address Book Name : Family

Address Book Created Successfully.

Enter Your Choice : 1

Enter Address Book Name : Friends

Address Book Created Successfully.

Enter Your Choice : 2

Enter Address Book Name : Family

Enter First Name : Jyothish
Enter Last Name : Mypati
Enter Address : Hyderabad
Enter City : Hyderabad
Enter State : Telangana
Enter Zip Code : 500081
Enter Phone Number : 9876543210
Enter Email : jyothish@gmail.com

Contact Added Successfully.

Enter Your Choice : 2

Enter Address Book Name : Friends

Enter First Name : Rahul
Enter Last Name : Sharma
...

Contact Added Successfully.

Enter Your Choice : 6

Available Address Books

- Family
- Friends
```

---

# OOP Concepts Used

* Class
* Object
* Encapsulation
* Constructors
* Method Overriding (`toString()`)
* Object Composition
* Collection Framework
* HashMap
* ArrayList

