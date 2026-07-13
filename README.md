# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts. This project is implemented incrementally, with each Use Case (UC) introducing new functionality to the Address Book application.

---

# UC11 - Sort Contacts Alphabetically by Person's Name

## Objective

Implement the ability to sort contacts alphabetically by **Person's Name** within an Address Book.

The application uses the **Java Collection Framework** and **Java Streams** to sort contact entries before displaying them on the console.

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

- Starts the application.
- Maintains multiple Address Books.
- Accepts user choices.
- Displays contacts sorted alphabetically by person's name.

---

## AddressBook

Responsibilities:

- Stores multiple contacts.
- Adds contacts.
- Displays contacts.
- Edits contacts.
- Deletes contacts.
- Searches contacts.
- Sorts contacts alphabetically by person's name.

---

## Contact

Responsibilities:

- Stores contact details.
- Provides constructors.
- Provides getter and setter methods.
- Overrides `toString()`.
- Overrides `equals()` and `hashCode()` for duplicate checking.

Contact Fields:

- First Name
- Last Name
- Address
- City
- State
- ZIP Code
- Phone Number
- Email Address

---

# Collection Framework Used

## ArrayList

```java
ArrayList<Contact>
```

Stores all contacts inside an Address Book.

---

## Comparator

```java
Comparator.comparing(Contact::getFirstName)
```

Used to sort contacts alphabetically by person's name.

---

# Java Streams Used

The Stream API is used to sort contacts before displaying them.

Example:

```java
contacts.stream()
        .sorted(Comparator.comparing(Contact::getFirstName))
        .forEach(System.out::println);
```

---

# Features Implemented

- Create multiple Address Books.
- Add contacts.
- Prevent duplicate contacts.
- Display contacts.
- Edit contacts.
- Delete contacts.
- Search persons by City or State.
- View persons by City or State.
- Count persons by City or State.
- Sort contacts alphabetically by person's name.

---

# Program Flow

1. Start the application.
2. Create one or more Address Books.
3. Add contacts.
4. Select an Address Book.
5. Choose **Sort Contacts by Name**.
6. Display contacts in alphabetical order.

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
7. Search Person by City or State
8. View Persons by City or State
9. Count Persons by City or State
10. Sort Contacts by Name
11. Exit

Enter Your Choice : 10

Sorted Contacts

Contact{firstName='Abhishek', lastName='Sharma', ...}

Contact{firstName='Jyothish', lastName='Mypati', ...}

Contact{firstName='Rahul', lastName='Verma', ...}

Contact{firstName='Ravi', lastName='Kumar', ...}
```

---

# OOP Concepts Used

- Class
- Object
- Encapsulation
- Constructors
- Method Overriding (`toString()`, `equals()`, `hashCode()`)
- Object Composition
- Collection Framework

---

# Java Features Used

- ArrayList
- Comparator
- Java Stream API
- `sorted()`
- `forEach()`
- Method Reference (`System.out::println`)

---

# Learning Outcome

After completing UC11, the application can:

- Store multiple contacts.
- Sort contacts alphabetically by person's name.
- Display sorted contacts using Java Streams.
- Use `Comparator` for custom sorting.
- Improve the readability of contact information through ordered display.