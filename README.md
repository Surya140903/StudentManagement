# Student Management System

## Description
A simple Java-based console application to manage student records.  
It supports adding, viewing, and searching student details using JDBC to connect with a MySQL database.

## Technologies Used
- Java (JDK 8 or higher)  
- MySQL database  
- JDBC for database connectivity

## Features
- Add new student records (ID, Name, Department, Marks)  
- View all student records  
- Search students by name or ID  
- Update and delete student records (optional - if implemented)

## Setup and Installation

1. **Install Java JDK**  
   Make sure Java is installed on your system.

2. **Install MySQL**  
   Set up MySQL server and create a database named `studentdb`.

3. **Create the Students Table**  
   Run this SQL command in your MySQL client:
   ```sql
   CREATE TABLE students (
       id INT PRIMARY KEY,
       name VARCHAR(50),
       department VARCHAR(50),
       marks INT
   );
