# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts. This project is implemented incrementally, with each Use Case (UC) adding new functionality to the Address Book.

---

# UC5 - Add Multiple Contacts to Address Book

## Objective

Implement the ability to add multiple contacts to the Address Book using console input.

Each contact is added one at a time and stored in a collection for future operations.

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
* Allows the user to add multiple contacts.
* Creates `Contact` objects.
* Adds contacts to the `AddressBook`.
* Displays all stored contacts.

---

## Contact

Responsibilities:

* Stores contact information.
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

## AddressBook

Responsibilities:

* Stores multiple contacts using `ArrayList<Contact>`.
* Adds a new contact.
* Displays all contacts.
* Edits an existing contact.
* Deletes an existing contact.

---

# Features Implemented

* Add a new contact.
* Add multiple contacts using console input.
* Store contacts using `ArrayList`.
* Display all contacts.
* Edit an existing contact.
* Delete an existing contact.

---

# Collection Used

```java
ArrayList<Contact>
```

The `ArrayList` collection is used to store multiple contacts in the Address Book. Each new contact entered by the user is added to the list.

---

# Program Flow

1. Start the application.
2. Enter contact details.
3. Create a `Contact` object.
4. Add the contact to the `AddressBook`.
5. Ask the user whether to add another contact.
6. Repeat until the user selects **No**.
7. Display all contacts stored in the Address Book.

---

# Sample Output

```text
Enter Contact Details

Enter First Name : Jyothish
Enter Last Name : Mypati
Enter Address : Hyderabad
Enter City : Hyderabad
Enter State : Telangana
Enter Zip Code : 500081
Enter Phone Number : 9876543210
Enter Email : jyothish@gmail.com

Contact Added Successfully.

Do you want to add another contact? (Y/N): y

Enter Contact Details

Enter First Name : Rahul
Enter Last Name : Sharma
Enter Address : Bangalore
Enter City : Bangalore
Enter State : Karnataka
Enter Zip Code : 560001
Enter Phone Number : 9876543211
Enter Email : rahul@gmail.com

Contact Added Successfully.

Do you want to add another contact? (Y/N): n

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

Contact{
firstName='Rahul',
lastName='Sharma',
address='Bangalore',
city='Bangalore',
state='Karnataka',
zip='560001',
phoneNumber='9876543211',
email='rahul@gmail.com'
}
```

---

# OOP Concepts Used

* Class
* Object
* Encapsulation
* Constructors
* Method Overriding (`toString()`)
* Object Composition
* Collection Framework (`ArrayList`)
