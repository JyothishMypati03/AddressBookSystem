# 📌 Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts. This project is implemented incrementally, with each Use Case (UC) introducing new functionality to the Address Book application.

---

# UC8 - Search Person by City or State Across Multiple Address Books

## Objective

Implement the ability to search persons living in a particular **City** or **State** across multiple Address Books.

The search should display all matching persons from every Address Book using **Java Streams**.

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
- Maintains multiple Address Books using a `HashMap`.
- Allows users to search persons by **City** or **State**.
- Displays matching contacts from all Address Books.

---

## AddressBook

Responsibilities:

- Stores contacts.
- Adds, edits, displays, and deletes contacts.
- Searches contacts by **City** using Java Streams.
- Searches contacts by **State** using Java Streams.

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

Example:

- Family
- Friends
- Office

---

## ArrayList

```java
ArrayList<Contact>
```

Stores contacts within each Address Book.

---

## Java Streams

```java
contacts.stream()
```

Used to filter contacts by **City** or **State**.

---

# Features Implemented

- Create multiple Address Books.
- Add contacts to different Address Books.
- Display contacts.
- Edit contacts.
- Delete contacts.
- Prevent duplicate contacts.
- Search persons by **City** across all Address Books.
- Search persons by **State** across all Address Books.

---

# Program Flow

1. Start the application.
2. Create one or more Address Books.
3. Add contacts to Address Books.
4. Select **Search by City or State**.
5. Enter the City or State name.
6. System searches all Address Books.
7. Display all matching contacts.

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
8. Exit

Enter Your Choice : 7

Search By

1. City
2. State

Enter Your Choice : 1

Enter City : Hyderabad

Search Results

Address Book : Family

Contact{firstName='Jyothish', lastName='Mypati', city='Hyderabad', state='Telangana', ...}

Address Book : Friends

Contact{firstName='Rahul', lastName='Sharma', city='Hyderabad', state='Telangana', ...}
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
- HashMap
- ArrayList
- Java Streams

---

# Java Features Used

- HashMap
- ArrayList
- Stream API
- `filter()`
- `collect()`
- `Collectors.toList()`

---

# Git Branch

```text
feature/UC8-SearchPersonByCityOrState
```

---

# Commit Message

```text
feat(UC8): search persons by city or state across multiple address books
```