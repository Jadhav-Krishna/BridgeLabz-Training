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


---

## 📂 Project Structure

```
BridgeLabz-Training/
│
├── 📁 core-java-practice/
│   ├── 📁 gcr-codebase/
│   │   ├── 📁 prerequisites/          # Basic Java programs (Day 2)
│   │   ├── 📁 programming-elements/   # Level 1 & 2 exercises (Day 3)
│   │   ├── 📁 control-flows/          # If-else, loops, switch (Day 4)
│   │   ├── 📁 arrays/                 # Array operations (Day 5)
│   │   ├── 📁 methods/                # Method practices (Day 6)
│   │   ├── 📁 strings/                # String manipulation (Day 7)
│   │   └── 📁 Extras/                 # Built-in methods & recursion (Day 8)
│   ├── 📁 leet-code-codebase/         # LeetCode solutions (Day 9)
│   └── 📁 scenario-based-codebase/    # Real-world problems (Day 9-10)
│
├── 📁 java-oops-practice/
│   ├── 📁 gcr-codebase/
│   │   └── 📁 JavaOopsConcepts/
│   │       └── 📁 src/com/bridgelabz/
│   │           ├── 📁 oops/
│   │           │   ├── levelone/      # Basic OOPs (Day 5)
│   │           │   └── leveltwo/      # Advanced OOPs
│   │           ├── 📁 constructor/    # Constructors (Day 6)
│   │           ├── 📁 inbuiltfunction/# Inbuilt Functions (Day 7)
│   │           ├── 📁 object-modeling/# Object Modeling (Day 8)
│   │           ├── 📁 inheritance/    # Inheritance (Day 9)
│   │           └── 📁 encapsulation/  # Encapsulation (Day 10)
│   └── 📁 scenario-based-codebase/    # OOPs Applications (Day 11-15)
│
├── 📁 dsa-practice/
│   ├── 📁 gcr-codebase/
│   │   └── 📁 src/main/java/org/bridgelabz/
│   │       ├── 📁 linkedList/              # LinkedList Implementation (Day 16)
│   │       ├── 📁 stacksQueues/            # Stack, Queue & HashMap (Day 17)
│   │       ├── 📁 sortingAlgorithms/       # Sorting Algorithms (Day 18)
│   │       ├── 📁 linearAndBinarysearch/   # Search Algorithms (Day 19)
│   │       └── 📁 runTimeAnalysis/         # Performance Analysis (Day 20)
│   └── 📁 scenario-based-codebase/         # DSA Scenarios (Day 21-29)
│
├── 📁 java-collections-practice/
│   └── 📁 gcr-codebase/
│       └── 📁 src/main/java/
│           ├── 📁 generics/                # Generics (Day 30)
│           ├── 📁 collections/             # Collections Framework (Day 31)
│           ├── 📁 streams/                 # Streams & File I/O (Day 32)
│           ├── 📁 exceptionHandling/       # Exception Handling (Day 33)
│           ├── 📁 regexJUnit/              # Regex & JUnit (Day 34)
│           └── 📁 annotationsReflection/   # Annotations & Reflection (Day 35)
│
├── 📁 java-iostream-practice/
│   └── 📁 gcr-codebase/
│       └── 📁 src/main/
│           ├── 📁 java/
│           │   ├── 📁 CSVDataHandling/     # CSV Operations (Day 36)
│           │   └── 📁 JSONData/            # JSON Operations (Day 37)
│           └── 📁 resources/
│
└── 📁 java8-programming-practice/
    └── 📁 gcr-codebase/
        └── 📁 src/main/java/
            ├── 📁 lambdaExpressions/       # Lambda Expressions (Day 36)
            └── 📁 functionalInterface/     # Functional Interfaces (Day 37)
```

---

##  Learning Milestones

### **Week 1: Core Java Fundamentals**

| Day | Date | Topic | Programs Completed |
|-----|------|-------|-------------------|
| 1 | 15-Dec | Git & GitHub Setup | Repository initialization, basic Git commands |
| 2 | 16-Dec | Java Basics | 10 prerequisite programs |
| 3 | 17-Dec | Programming Elements | 31 programs (Level 1 & 2) |
| 4 | 18-Dec | Control Flows | 43 programs (3 levels) |
| 5 | 19-Dec | Arrays | 18 programs (2 levels) |
| 6 | 20-Dec | Methods | 35 programs (3 levels) |

### **Week 2: Advanced Java & OOPs**

| Day | Date | Topic | Programs Completed |
|-----|------|-------|-------------------|
| 7 | 22-Dec | Strings | 30 programs (3 levels) |
| 8 | 23-Dec | Built-In Methods | Recursion, date/time operations |
| 9 | 24-Dec | LeetCode & Scenarios | 3 LeetCode + 2 real-world problems |
| 10-15 | 26-Dec to 1-Jan | Scenario-Based | 20 business logic applications |
| 10 | 26-Dec | OOPs Concepts | 10 programs (2 levels) |
| 11 | 27-Dec | Constructors | 13 programs with constructor types |

### **Week 3: Advanced OOPs & DSA**

| Day | Date | Topic | Programs Completed |
|-----|------|-------|-------------------|
| 12 | 29-Dec | Inbuilt Functions | 7 domain-based applications |
| 13 | 30-Dec | Object Modeling | 8 complex system models |
| 14 | 31-Dec | Inheritance | 10 inheritance patterns |
| 15 | 1-Jan | Encapsulation | 8 domain-specific applications |
| 16 | 2-Jan | DSA - LinkedList | 9 LinkedList implementations |
| 17 | 3-Jan | DSA - Stack, Queue & HashMap | 10 DSA problems |
| 18 | 5-Jan | DSA - Sorting Algorithms | 7 sorting implementations |
| 19 | 6-Jan | DSA - Linear & Binary Search | Search algorithms & I/O operations |
| 20 | 7-Jan | DSA - Runtime Analysis | Performance benchmarking |
| 21 | 10-Jan | OOPs Scenarios | MediStore, TourMate |
| 22 | 8-Jan | DSA Scenarios | BookShelf, BrowserBuddy, AmbulanceRoute |
| 23 | 9-Jan | OOPs Scenarios | Artify, FoodLoop |
| 24 | 12-Jan | DSA Scenarios | CallCenter, TrainCompanion, TextEditor, TrafficManager |
| 25 | 13-Jan | DSA Scenarios | SmartCheckout, ParcelTracker, ExamProctor |

### **Week 4: Java Collections & Advanced Concepts**

| Day | Date | Topic | Programs Completed |
|-----|------|-------|-------------------|
| 30 | 9-Jan | Generics | 5 generic-based systems |
| 31 | 16-Jan | Collections Framework | 20 problems (List, Set, Map, Queue) |
| 32 | 19-Jan | Java Streams & File I/O | 10 stream operations |
| 33 | 20-Jan | Exception Handling | 10 exception patterns |
| 34 | 21-Jan | Regex & JUnit | 15 regex + 12 JUnit tests |
| 35 | 22-Jan | Annotations & Reflection | 10 annotations + 12 reflection programs |

### **Week 5: Java I/O Streams – CSV & JSON**

| Day | Date | Topic | Programs Completed |
|-----|------|-------|-------------------|
| 36 | 23-Jan | CSV Data Handling | 15 CSV operations |
| 37 | 24-Jan | JSON Data Handling | 8 JSON operations |

### **Week 6: Java 8 Features**

| Day | Date | Topic | Programs Completed |
|-----|------|-------|-------------------|
| 38 | 27-Jan | Lambda Expressions | 10 lambda implementations |
| 39 | 27-Jan | Functional Interfaces | 9 built-in + 5 custom interfaces |

---

##  Key Concepts Covered

### Core Java (core-java-practice)
-  **Fundamentals**: Variables, data types, operators
-  **Control Structures**: If-else, loops, switch-case
-  **Arrays**: Single & multi-dimensional arrays
-  **Methods**: Parameters, return types, overloading
-  **Strings**: Manipulation, comparisons, exceptions
-  **Built-In Methods**: Date/time operations, recursion
-  **Problem Solving**: LeetCode challenges, real-world scenarios

### Object-Oriented Programming (java-oops-practice)
-  **Classes & Objects**: Creating and instantiating objects
-  **Encapsulation**: Data hiding and access modifiers
-  **Constructors**: Default, parameterized, overloading
-  **Inbuilt Functions**: String manipulation, Object class methods
-  **Object Modeling**: One-to-Many, Many-to-Many relationships
-  **Inheritance**: Single, Multilevel, Hierarchical, Hybrid
-  **Abstraction**: Interface-based design patterns
-  **Real-World Applications**: 15+ domain-based systems

### Data Structures & Algorithms (dsa-practice)
-  **LinkedList**: Singly, Doubly, Circular linked lists
-  **Stack & Queue**: LIFO, FIFO operations
-  **HashMap**: Custom implementation, collision handling
-  **Sorting Algorithms**: Bubble, Selection, Insertion, Merge, Quick, Heap, Counting
-  **Searching**: Linear search, Binary search, 2D matrix search
-  **String & I/O**: StringBuilder, StringBuffer, FileReader, InputStreamReader
-  **Runtime Analysis**: Performance benchmarking and optimization
-  **Scenario-Based**: 20+ real-world DSA applications
-  **Time Complexity**: Analysis and optimization

### Java Collections & Advanced Concepts (java-collections-practice)
-  **Generics**: Type parameters, bounded types, wildcards
-  **Collections Framework**: List, Set, Map, Queue interfaces
-  **Java Streams**: Intermediate and terminal operations
-  **File I/O**: Buffered, Data, ByteArray, Piped streams
-  **Exception Handling**: Checked, unchecked, custom exceptions
-  **Regular Expressions**: Pattern matching and validation
-  **JUnit Testing**: Unit tests, assertions, test cases
-  **Annotations**: Built-in and custom annotations
-  **Reflection**: Runtime metadata access and manipulation

### Java I/O Streams – CSV & JSON (java-iostream-practice)
-  **CSV Operations**: Reading, writing, parsing CSV files
-  **JSON Handling**: Parsing and generating JSON data
-  **Data Transformation**: Converting between formats (CSV ↔ JSON, JSON ↔ XML)
-  **File Operations**: Merging, filtering, sorting data files
-  **Data Validation**: Structure and content validation
-  **Object Mapping**: Converting between Java objects and data formats
-  **Encryption**: Securing data files
-  **Large File Processing**: Efficient handling of large datasets

### Java 8 Features (java8-programming-practice)
-  **Lambda Expressions**: Functional programming syntax
-  **Functional Interfaces**: Predicate, Function, Consumer, Supplier
-  **Method References**: Static, instance, constructor references
-  **Stream API**: Filtering, mapping, reduction operations
-  **Optional Class**: Null-safe programming

---

## 🛠️ Technologies Used

- **Language**: Java (JDK 17+)
- **Version Control**: Git & GitHub
- **IDE**: Eclipse
- **Build Tool**: Maven (optional)
- **Testing**: JUnit 5

---

##  Training Statistics

- **Total Days**: 39 days (15-Dec-2025 to 29-Jan-2026)
- **Total Programs**: 370+ Java programs
- **Levels Covered**: Beginner → Intermediate → Advanced
- **Practice Platforms**: LeetCode, Scenario-based challenges, Real-world applications
- **Branches**: 6 (Core Java, OOPs, DSA, Collections, I/O Streams, Java 8)
- **Project Categories**: 50+ domain applications
- **DSA Implementations**: 30+ data structure problems
- **Scenario Projects**: 20+ real-world applications
- **Coding Hours**: 230+ hours

---

## 🔗 Quick Links

### Core Java Practice
- 📌 [Prerequisites Programs](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/core-java-practice/gcr-codebase/prerequisites)
- 📌 [Control Flows Solutions](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/core-java-practice/gcr-codebase/control-flows)
- 📌 [Arrays & Methods](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/core-java-practice/gcr-codebase)
- 📌 [Strings & Extras](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/core-java-practice/gcr-codebase)
- 📌 [LeetCode Solutions](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/core-java-practice/leet-code-codebase)
- 📌 [Scenario-Based Problems](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/core-java-practice/scenario-based-codebase)

### OOPs Practice
- 📌 [OOPs Concepts](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-oops-practice/gcr-codebase/JavaOopsConcepts/src/com/bridgelabz/oops)
- 📌 [Constructors](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-oops-practice/gcr-codebase/JavaOopsConcepts/src/com/bridgelabz/constructor)
- 📌 [Inheritance Patterns](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-oops-practice/gcr-codebase/JavaOopsConcepts/src/com/bridgelabz/inheritance)
- 📌 [Encapsulation Examples](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-oops-practice/gcr-codebase/JavaOopsConcepts/src/com/bridgelabz/encapsulation)
- 📌 [OOPs Scenario-Based](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-oops-practice/scenario-based-codebase)

### DSA Practice
- 📌 [LinkedList Implementation](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/src/main/java/org/bridgelabz/linkedList)
- 📌 [Stack & Queue Problems](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/src/main/java/org/bridgelabz/stacksQueues)
- 📌 [Sorting Algorithms](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/src/main/java/org/bridgelabz/sortingAlgorithms)
- 📌 [Linear & Binary Search](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/src/main/java/org/bridgelabz/linearAndBinarysearch)
- 📌 [Runtime Analysis](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dsa-practice/gcr-codebase/src/main/java/org/bridgelabz/runTimeAnalysis)
- 📌 [DSA Scenario-Based](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/dsa-practice/scenario-based-codebase)

### Java Collections Practice
- 📌 [Generics](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/generics)
- 📌 [Collections Framework](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/collections)
- 📌 [Java Streams](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/streams)
- 📌 [Exception Handling](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/exceptionHandling)
- 📌 [Regex & JUnit](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/regexJUnit)
- 📌 [Annotations & Reflection](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/annotationsReflection)

### Java I/O Streams Practice
- 📌 [CSV Data Handling](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-iostream-practice/java-iostream-practice/gcr-codebase/src/main/java/CSVDataHandling)
- 📌 [JSON Data Handling](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-iostream-practice/java-iostream-practice/gcr-codebase/src/main/java/JSONData)

### Java 8 Features Practice
- 📌 [Lambda Expressions](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/src/main/java/lambdaExpressions)
- 📌 [Functional Interfaces](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/src/main/java/functionalInterface)

---

##  Sample Programs

<details>
<summary><b>View Sample Code Structure</b></summary>

**Core Java - Control Flow (FizzBuzz.java)**
```java
core-java-practice/gcr-codebase/control-flows/Level-2/FizzBuzz.java
- Conditional logic implementation
- Loop structures practice
```

**OOPs - Basic (Circle.java)**
```java
java-oops-practice/gcr-codebase/JavaOopsConcepts/src/com/bridgelabz/oops/levelone/Circle.java
- Encapsulation demonstration
- Area and circumference calculations
```

**OOPs - Inheritance (Vehicle Management)**
```java
java-oops-practice/gcr-codebase/JavaOopsConcepts/src/com/bridgelabz/inheritance/HybridInheritance/
- Multiple inheritance patterns
- Polymorphism implementation
```

**DSA - LinkedList (Inventory Management)**
```java
dsa-practice/gcr-codebase/src/main/java/org/bridgelabz/linkedList/inventoryManagementSystem/
- Custom LinkedList implementation
- Node manipulation and traversal
```

**DSA - Sorting (Merge Sort)**
```java
dsa-practice/gcr-codebase/src/main/java/org/bridgelabz/sortingAlgorithms/MergeSortBookPrices.java
- Divide and conquer approach
- Time complexity: O(n log n)
```

**Collections - Generics (AI Resume Screening)**
```java
java-collections-practice/gcr-codebase/src/main/java/generics/AIDrivenResumeScreeningSystem/
- Generic type parameters
- Type-safe candidate filtering
```

**I/O Streams - CSV/JSON Handling**
```java
java-iostream-practice/gcr-codebase/src/main/java/CSVDataHandling/FilterCSVRecords.java
- CSV data filtering and processing
- JSON to CSV conversion
```

**Java 8 - Lambda Expressions**
```java
java8-programming-practice/gcr-codebase/src/main/java/lambdaExpressions/LambdaWithStreams.java
- Functional programming approach
- Stream operations with lambda
```

**Scenario-Based (BMI Calculator)**
```java
core-java-practice/scenario-based-codebase/BMICalculator.java
- Real-world health application
- User input validation
```
</details>

---

## 🎓 Learnings & Best Practices

-  **Code Organization**: Following industrial standards and package structures
-  **Naming Conventions**: Camel case and meaningful names
-  **Version Control**: Regular commits with descriptive messages across branches
-  **Problem-Solving**: Breaking complex problems into smaller, manageable tasks
-  **OOPs Principles**: SOLID principles, design patterns, and code reusability
-  **Data Structures**: Efficient memory management and algorithm optimization
-  **Time Complexity**: Analyzing and optimizing algorithm performance
-  **Real-World Applications**: Implementing domain-specific business logic
-  **Documentation**: Clear comments, README files, and code documentation
-  **Functional Programming**: Leveraging Java 8 features for cleaner code
-  **Type Safety**: Using generics for compile-time type checking
-  **Testing**: Writing comprehensive unit tests with JUnit

---

<!-- ## 🌟 Future Plans

- [ ] Advanced OOPs (Inheritance, Polymorphism)
- [ ] Collections Framework
- [ ] Exception Handling
- [ ] File I/O Operations
- [ ] Multithreading
- [ ] JDBC & Database Connectivity

---