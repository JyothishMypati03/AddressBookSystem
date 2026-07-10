# 📌 Address Book System - UC7

## 🎯 Goal

Ensure that there is **no duplicate entry of the same person** in a particular Address Book.

The duplicate check is done using the person's name while adding a contact. The use case also mentions using collection methods, overriding `equals()`, and Java Streams for duplicate detection. :contentReference[oaicite:0]{index=0}

---

## 👤 Actor

**User**

---

## 🔄 Flow

1. User selects an Address Book.
2. User tries to add a new contact.
3. System checks whether the person already exists in that Address Book.
4. If the person already exists, the duplicate contact is not added.
5. If the person does not exist, the contact is added successfully.

---

## 💡 Java Concepts Covered

- Collection Methods
- `equals()` Method Overriding
- Java Streams
- Duplicate Detection
- Object Comparison
- Encapsulation

---

## 📋 Functional Requirements

- Check for duplicate contacts while adding a person.
- Use the person's name as the duplicate check key.
- Search existing contacts in the Address Book.
- Prevent adding the same person more than once.
- Display a meaningful message when a duplicate is found.

---

## 📂 Project Structure

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