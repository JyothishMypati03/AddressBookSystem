# Address Book System

A Java console-based Address Book application developed using Object-Oriented Programming (OOP) concepts.

## UC1 - Create Contact

### Objective

Create a Contact in the Address Book with the following details:

- First Name
- Last Name
- Address
- City
- State
- ZIP Code
- Phone Number
- Email Address


## Project Structure

```
AddressBookSystem
│
├── src
│   └── com
│       └── bridgelabz
│           └── addressbook
│               ├── AddressBookSystem.java
│               └── Contact.java
│
├── README.md
└── .gitignore
```

## Features Implemented

- Created the `Contact` class.
- Added the following contact fields:
    - First Name
    - Last Name
    - Address
    - City
    - State
    - ZIP Code
    - Phone Number
    - Email Address
- Implemented:
    - Default Constructor
    - Parameterized Constructor
    - Getter Methods
    - Setter Methods
    - `toString()` Method
- Created the `AddressBookSystem` class.
- Created a sample `Contact` object.
- Displayed the contact details using the `toString()` method.

## Sample Output

```
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

## Future Enhancements

- UC2 - Add Contact using Console Input
- UC3 - Edit Existing Contact
- UC4 - Delete Contact

