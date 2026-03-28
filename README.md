[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title: Library Management System using Object-Oriented Programming


---

## Problem Statement:

In many educational institutions and small libraries, book management is still handled manually or with inefficient systems. This leads to issues such as difficulty in tracking available books, errors in issuing and returning records, lack of proper user management, and data loss. Manual systems are time-consuming, prone to human errors, and do not provide efficient search or tracking capabilities.

The objective of this project is to develop a console-based Library Management System using Object-Oriented Programming principles. The system aims to manage books, users, and issuing records in a structured and efficient way. It allows adding and viewing books, registering users, issuing books, and tracking which user has borrowed which book.

The system will also incorporate key OOP concepts such as abstraction, inheritance, and polymorphism to model real-world entities like books and users. Additionally, it will include exception handling to manage invalid inputs and file handling to ensure data persistence. This project demonstrates how software solutions can improve efficiency, reduce errors, and provide a scalable approach to managing library operations.

---

## Target User:

- Students
- Faculty
- Librarians

---

## Core Features:

- Add books
- Add users
- Issue books
- View books

---

## OOP Concepts Used:

Abstraction:
Abstract classes Book and User.

Inheritance:
Student and Faculty inherit from User, FictionBook and ReferenceBook inherit from Book.

Polymorphism:
canBeIssued() behaves differently.

Exception Handling:
Handled invalid user input using try-catch.

Collections:
Used ArrayList for storing data.


---

## Proposed Architecture Description:

The Library Management System follows a modular object-oriented architecture with clear separation of responsibilities.

The abstract classes Book and User define common properties and behaviors, while their subclasses (FictionBook, ReferenceBook, Student, Faculty) extend them using inheritance and enable polymorphism.

The LibraryManager class acts as the core logic layer, handling operations such as adding books, registering users, issuing books, and searching records. It uses ArrayList collections for dynamic data management.

The IssueRecord class maintains the relationship between books and users by tracking issued books.

The FileHandler class manages data persistence by saving book data to files.

The Main class provides a menu-driven user interface, handles user input using exception handling, and interacts with the LibraryManager.

This design ensures proper separation of concerns:
Data (Book, User, IssueRecord), Logic (LibraryManager), Persistence (FileHandler), and Interface (Main).

Book → FictionBook / ReferenceBook  
User → Student / Faculty  
LibraryManager → handles operations  
FileHandler → manages file storage

---

## How to Run:

Compile using: javac *.java  
Run using: java Main

---

## Git Discipline Notes:
This project is developed using multiple meaningful commits

1. Initial project setup with base classes and README
2. Implemented inheritance and polymorphism for Book hierarchy
3. Implemented inheritance and polymorphism for User hierarchy
4. Added LibraryManager for managing books and users
5. Implemented book issuing functionality using IssueRecord
6. Integrated core functionality into Main for system execution
7. Implemented menu-driven system for interactive user input
8. Added exception handling for invalid inputs
9. Implemented file persistence for storing book data
10. Added search and issued books tracking functionality
11. Completed documentation and finalized project structure
