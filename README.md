# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts. This project is implemented incrementally, with each Use Case (UC) introducing new functionality to the Address Book application.

---

# UC9 - View Persons by City or State

## Objective

Implement the ability to maintain a **Dictionary of City and Person** as well as a **Dictionary of State and Person**.

The application groups contacts based on their **City** and **State** using `HashMap<String, List<Contact>>` and displays all persons belonging to a particular City or State.

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
- Creates City and State dictionaries.
- Displays persons grouped by City.
- Displays persons grouped by State.

---

## AddressBook

Responsibilities:

- Stores contacts.
- Adds new contacts.
- Displays contacts.
- Edits contacts.
- Deletes contacts.
- Searches contacts by City or State.
- Returns all contacts for dictionary creation.

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

## HashMap

```java
HashMap<String, AddressBook>
```

Stores multiple Address Books.

---

## City Dictionary

```java
HashMap<String, List<Contact>>
```

Stores contacts grouped by City.

Example:

```text
Hyderabad
   Jyothish
   Rahul

Bangalore
   Kiran
```

---

## State Dictionary

```java
HashMap<String, List<Contact>>
```

Stores contacts grouped by State.

Example:

```text
Telangana
   Jyothish
   Rahul

Karnataka
   Kiran
```

---

## ArrayList

```java
ArrayList<Contact>
```

Stores contacts inside each Address Book.

---

# Java Streams Used

The Stream API is used to display persons from each City or State.

```java
contacts.stream().forEach(System.out::println);
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
- Maintain a City Dictionary.
- Maintain a State Dictionary.
- View all persons grouped by City.
- View all persons grouped by State.

---

# Program Flow

1. Start the application.
2. Create one or more Address Books.
3. Add contacts.
4. Store contacts in City and State dictionaries.
5. Select **View Persons by City or State**.
6. Choose City or State.
7. Display all grouped contacts.

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
9. Exit

Enter Your Choice : 8

View By

1. City
2. State

Enter Your Choice : 1

Persons By City

City : Hyderabad

Contact{firstName='Jyothish', lastName='Mypati', ...}
Contact{firstName='Rahul', lastName='Sharma', ...}

City : Bangalore

Contact{firstName='Kiran', lastName='Kumar', ...}
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

- HashMap
- ArrayList
- List
- Stream API
- `computeIfAbsent()`
- `forEach()`
- Method Reference (`System.out::println`)

---

# Learning Outcome

After completing UC9, the application can:

- Organize contacts using dictionaries.
- Group contacts based on City.
- Group contacts based on State.
- Display grouped contacts efficiently.
- Use Java Collections and Stream API to manage and display grouped data.