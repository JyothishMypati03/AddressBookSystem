# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts. This project is implemented incrementally, with each Use Case (UC) introducing new functionality to the Address Book application.

---

# UC10 - Count Contact Persons by City or State

## Objective

Implement the ability to count the number of contact persons grouped by **City** or **State**.

The application maintains City and State dictionaries and displays the total number of contacts available in each City or State using **Java Streams**.

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
- Counts contact persons by City.
- Counts contact persons by State.
- Displays the total number of contacts for each City or State.

---

## AddressBook

Responsibilities:

- Stores multiple contacts.
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

Maintains contacts grouped by City.

Example:

```text
Hyderabad
    Jyothish
    Rahul

Bangalore
    Kiran
    Ravi
```

---

## State Dictionary

```java
HashMap<String, List<Contact>>
```

Maintains contacts grouped by State.

Example:

```text
Telangana
    Jyothish
    Rahul

Karnataka
    Kiran
    Ravi
```

---

## ArrayList

```java
ArrayList<Contact>
```

Stores contacts inside each Address Book.

---

# Java Streams Used

The Stream API is used to count the number of contacts in each City or State.

Example:

```java
entry.getValue().stream().count();
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
- View persons grouped by City or State.
- Count contact persons by City.
- Count contact persons by State.

---

# Program Flow

1. Start the application.
2. Create one or more Address Books.
3. Add contacts.
4. Store contacts in City and State dictionaries.
5. Select **Count Persons by City or State**.
6. Choose City or State.
7. Display the number of contacts available for each City or State.

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
10. Exit

Enter Your Choice : 9

Count By

1. City
2. State

Enter Your Choice : 1

Persons Count By City

Hyderabad -> 2 person(s)
Bangalore -> 3 person(s)
Chennai -> 1 person(s)
```

For State:

```text
Count By

1. City
2. State

Enter Your Choice : 2

Persons Count By State

Telangana -> 2 person(s)
Karnataka -> 3 person(s)
Tamil Nadu -> 1 person(s)
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
- `count()`
- `forEach()`
- Method Reference (`System.out::println`)

---

# Learning Outcome

After completing UC10, the application can:

- Maintain City and State dictionaries.
- Count contact persons grouped by City.
- Count contact persons grouped by State.
- Use Java Collections to organize grouped data.
- Use Java Streams to efficiently count grouped contacts.