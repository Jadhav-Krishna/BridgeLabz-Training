# Week 8: Database Management & JDBC

## Day 44 – MySQL Fundamentals

**(Date: 6-Feb-2026)**

- MySQL database installation and configuration
- SQL basics (DDL, DML, DQL, DCL, TCL)
- Database and table creation
- CRUD operations (Create, Read, Update, Delete)
- Constraints (Primary Key, Foreign Key, Unique, Not Null)
- Data types and indexing

### Topics Covered:

**Database Basics:**
- Creating and managing databases
- Table structure and design
- Data types (INT, VARCHAR, DATE, etc.)
- Constraints and relationships

**SQL Commands:**
- CREATE, ALTER, DROP (DDL)
- INSERT, UPDATE, DELETE (DML)
- SELECT queries with WHERE, ORDER BY, LIMIT
- Aggregate functions (COUNT, SUM, AVG, MIN, MAX)
- GROUP BY and HAVING clauses

**Advanced Queries:**
- JOINS (INNER, LEFT, RIGHT, FULL OUTER)
- Subqueries and nested queries
- Views and stored procedures
- Triggers and transactions

**Normalization:**
- 1NF, 2NF, 3NF, BCNF
- Database design principles
- ER diagrams

### Project Structure:
```
dbms-jdbc-practice/
└── gcr-codebase/
    └── sql-scripts/
        ├── basics/
        │   ├── create_database.sql
        │   ├── create_tables.sql
        │   ├── insert_data.sql
        │   └── basic_queries.sql
        ├── joins/
        │   ├── inner_join.sql
        │   ├── left_join.sql
        │   ├── right_join.sql
        │   └── complex_joins.sql
        ├── advanced/
        │   ├── subqueries.sql
        │   ├── views.sql
        │   ├── stored_procedures.sql
        │   └── triggers.sql
        └── normalization/
            └── database_design.sql
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice/gcr-codebase/sql-scripts)

---

## Day 45-46 – Database Scenarios

**(Date: 7-8-Feb-2026)**

- Real-world database design scenarios
- Complex SQL queries for business logic
- Performance optimization techniques
- Database indexing strategies
- Query execution plans

### Scenarios Covered:

**Employee Management System:**
- Employee database design
- Department and role management
- Salary calculations and reports
- Attendance tracking

**E-Commerce Platform:**
- Product catalog management
- Order processing system
- Customer data handling
- Inventory management

**Banking System:**
- Account management
- Transaction processing
- Balance calculations
- Transaction history

**Library Management:**
- Book inventory system
- Member management
- Book issue/return tracking
- Fine calculation

**Hospital Management:**
- Patient records
- Doctor appointments
- Medical history tracking
- Billing system

### Project Structure:
```
dbms-jdbc-practice/
└── gcr-codebase/
    └── database-scenarios/
        ├── employeeManagement/
        ├── ecommercePlatform/
        ├── bankingSystem/
        ├── libraryManagement/
        └── hospitalManagement/
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice/gcr-codebase/database-scenarios)

---

## Day 47 – JDBC Programming

**(Date: 9-Feb-2026)**

- JDBC architecture and drivers
- Establishing database connections
- Statement, PreparedStatement, CallableStatement
- ResultSet and data retrieval
- CRUD operations with JDBC
- Transaction management
- Connection pooling

### Concepts Covered:

**JDBC Basics:**
- Loading JDBC drivers
- Connection string and DriverManager
- Establishing database connections
- Closing resources properly

**Statement Types:**
- Statement - Simple SQL execution
- PreparedStatement - Parameterized queries
- CallableStatement - Stored procedure calls
- Batch processing

**Data Operations:**
- INSERT operations
- SELECT and ResultSet traversal
- UPDATE operations
- DELETE operations
- Transaction handling (commit, rollback)

**Advanced Topics:**
- Connection pooling (HikariCP, Apache DBCP)
- Metadata (DatabaseMetaData, ResultSetMetaData)
- Blob and Clob handling
- Batch updates

### Project Structure:
```
dbms-jdbc-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── jdbc/
                    ├── basics/
                    │   ├── JDBCConnection.java
                    │   ├── StatementExample.java
                    │   ├── PreparedStatementExample.java
                    │   └── CallableStatementExample.java
                    ├── crud/
                    │   ├── InsertOperation.java
                    │   ├── SelectOperation.java
                    │   ├── UpdateOperation.java
                    │   └── DeleteOperation.java
                    ├── transactions/
                    │   ├── TransactionManagement.java
                    │   ├── CommitRollback.java
                    │   └── SavepointExample.java
                    └── advanced/
                        ├── ConnectionPooling.java
                        ├── MetadataExample.java
                        ├── BatchProcessing.java
                        └── BlobClobHandling.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice/gcr-codebase/src/main/java/jdbc)

---

## Day 48 – BridgeLabz Mock Test

**(Date: 10-Feb-2026)**

- Comprehensive evaluation of all concepts learned
- Core Java fundamentals assessment
- OOP concepts testing
- Data Structures & Algorithms problems
- Collections Framework questions
- Java 8 features evaluation
- Database and JDBC queries
- Problem-solving and coding challenges

### Test Coverage:

**Core Java (20%):**
- Syntax and fundamentals
- Control structures
- Arrays and Strings

**OOP Concepts (15%):**
- Encapsulation and Inheritance
- Polymorphism and Abstraction
- Interface and Abstract classes

**DSA (20%):**
- LinkedList, Stack, Queue
- Sorting and Searching
- Time complexity analysis

**Collections & Streams (15%):**
- List, Set, Map operations
- Stream API
- Lambda expressions

**Database & JDBC (20%):**
- SQL queries
- JDBC operations
- Database design

**Problem Solving (10%):**
- Logical reasoning
- Algorithm design
- Code optimization

### Project Structure:
```
dbms-jdbc-practice/
└── gcr-codebase/
    └── mock-test/
        ├── coreJava/
        ├── oopConcepts/
        ├── dataStructures/
        ├── collections/
        └── databaseJDBC/
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice/gcr-codebase/mock-test)

---

## Day 49-51 – JDBC Scenarios

**(Date: 11-13-Feb-2026)**

- Real-world JDBC applications
- Enterprise-level database connectivity
- DAO (Data Access Object) pattern
- Repository pattern implementation
- Connection pooling in production
- Error handling and logging

### Scenarios Implemented:

**Student Management System:**
- Student CRUD operations
- Course enrollment
- Grade management
- Report generation

**Inventory Management:**
- Product management
- Stock tracking
- Order processing
- Supplier management

**Customer Relationship Management:**
- Customer data management
- Sales tracking
- Follow-up system
- Analytics dashboard

**Hotel Booking System:**
- Room management
- Reservation system
- Customer management
- Billing integration

**Payroll Management:**
- Employee salary management
- Attendance integration
- Tax calculations
- Payslip generation

### Design Patterns Used:

- **DAO Pattern** - Data Access layer abstraction
- **Singleton Pattern** - Connection management
- **Factory Pattern** - Object creation
- **MVC Pattern** - Application architecture

### Project Structure:
```
dbms-jdbc-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── scenarios/
                    ├── studentManagement/
                    │   ├── dao/
                    │   ├── model/
                    │   ├── service/
                    │   └── util/
                    ├── inventoryManagement/
                    ├── customerRelationship/
                    ├── hotelBooking/
                    └── payrollManagement/
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice/gcr-codebase/src/main/java/scenarios)

---

## Day 52 – PowerSkill Session: Professional Email Writing

**(Date: 14-Feb-2026)**

- Professional communication skills
- Email structure and formatting
- Business email etiquette
- Formal vs informal communication
- Email subject lines and salutations
- Effective communication strategies

### Topics Covered:

**Email Fundamentals:**
- Subject line best practices
- Proper salutations and closings
- Email structure (greeting, body, closing)
- Tone and language

**Business Communication:**
- Formal business emails
- Request emails
- Follow-up emails
- Thank you emails
- Apology emails

**Professional Etiquette:**
- Response time expectations
- CC and BCC usage
- Attachment best practices
- Email signatures

**Common Scenarios:**
- Job application emails
- Meeting requests
- Project updates
- Client communication
- Internal team communication

### Project Structure:
```
dbms-jdbc-practice/
└── powerSkill/
    └── emailWriting/
        ├── templates/
        │   ├── jobApplication.txt
        │   ├── meetingRequest.txt
        │   ├── projectUpdate.txt
        │   ├── thankYou.txt
        │   └── followUp.txt
        └── guidelines/
            └── emailEtiquette.md
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dbms-jdbc-practice/dbms-jdbc-practice/powerSkill/emailWriting)

---
