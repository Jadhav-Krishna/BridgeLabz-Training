# Week 4: Java Collections – Generics, Collections, Streams, Regex, Annotations & Reflection

## Day 30 – Generics

**(Date: 9-Jan-2026)**

- Generic classes, interfaces, and methods with type parameters
- Bounded type parameters and wildcards
- Type safety and code reusability

### Projects Implemented:

- **AI-Driven Resume Screening System** - Generic-based candidate filtering
- **Dynamic Online Marketplace System** - Multi-type product management
- **Multi-Level University Course Management** - Generic course & student handling
- **Personalized Meal Plan Generator** - Type-safe meal planning
- **Smart Warehouse Management System** - Generic inventory tracking

### Project Structure:
```
java-collections-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── generics/
                    ├── AIDrivenResumeScreeningSystem/
                    ├── dynamicOnlineMarketplaceSystem/
                    ├── multiLevelUniversityCourseManagementSystem/
                    ├── personalizedMealPlanGenerator/
                    └── smartWarehouseManagementSystem/
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/generics)

---

## Day 31 – Collections Framework

**(Date: 16-Jan-2026)**

- Java Collections Framework (List, Set, Map, Queue)
- ArrayList, LinkedList, HashSet, TreeSet implementations
- HashMap, LinkedHashMap, TreeMap operations
- PriorityQueue, ArrayDeque, and Iterators

### Problems Solved:

**List Interface:**
- Frequency of Elements
- Nth Element from End
- Remove Duplicates Preserving Order
- Reverse List
- Rotate Elements in List

**Set Interface:**
- Convert Set to Sorted List
- Generate All Subsets
- Symmetric Difference Between Sets
- Check if Two Sets Are Equal
- Union and Intersection of Sets

**Map Interface:**
- Group Objects by Property
- Invert Map (Swap Keys and Values)
- Find Key with Maximum Value
- Merge Multiple Maps
- Word Frequency Counter

**Queue Interface:**
- Circular Buffer Implementation
- Generate Binary Numbers Using Queue
- Hospital Triage System
- Reverse Queue
- Stack Using Queues

### Project Structure:
```
java-collections-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── collections/
                    ├── ListInterface/
                    │   ├── FrequencyElements.java
                    │   ├── NthElementfromEnd.java
                    │   ├── RemoveDuplicatesPreservingOrder.java
                    │   ├── ReverseList.java
                    │   └── RotateElementsList.java
                    ├── SetInterface/
                    │   ├── SetToSortedList.java
                    │   ├── Subsets.java
                    │   ├── SymmetricDifference.java
                    │   ├── TwoSetsAreEqual.java
                    │   └── UnionIntersectionSets.java
                    ├── MapInterface/
                    │   ├── GroupObjectsProperty.java
                    │   ├── InvertMap.java
                    │   ├── MaxValueKey.java
                    │   ├── MergeMaps.java
                    │   └── WordFrequencyCounter.java
                    └── QueueInterface/
                        ├── CircularBuffer.java
                        ├── GenerateBinaryNumbersUsingQueue.java
                        ├── HospitalTriageSystem.java
                        ├── ReverseQueue.java
                        └── StackUsingQueues.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/collections)

---

## Day 32 – Java Streams & File I/O

**(Date: 19-Jan-2026)**

- Stream API with intermediate and terminal operations
- Buffered, Data, ByteArray, Piped, and Filter Streams
- File handling, serialization, and large file processing

### Concepts Covered:

- Buffered Streams, Byte Array Streams, Data Streams
- File Handling, Filter Streams, Piped Streams
- Serialization/Deserialization, Large File Processing
- Word Count, User Input from Console

### Project Structure:
```
java-collections-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── streams/
                    ├── BufferedStreams.java
                    ├── ByteArrayStream.java
                    ├── CountWordsFile.java
                    ├── DataStreams.java
                    ├── FileHandling.java
                    ├── FilterStreams.java
                    ├── PipedStreams.java
                    ├── ReadLargeFileLBL.java
                    ├── Serialization.java
                    └── UserInputfromConsole.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/streams)

---

## Day 33 – Exception Handling

**(Date: 20-Jan-2026)**

- Checked vs Unchecked Exceptions
- Custom exception creation and handling
- Try-catch-finally blocks and exception propagation
- Try-with-resources for automatic resource management

### Concepts Covered:

- Checked Exception - File handling, I/O operations
- Unchecked Exception - Runtime errors
- Custom Exception - Domain-specific error handling
- Exception Propagation - Call stack error flow
- Finally Block Execution - Cleanup operations
- Multiple Catch Blocks - Specific exception handling
- Nested Try-Catch - Complex error scenarios
- Throw vs Throws - Exception declaration
- Try-With-Resources - Automatic resource cleanup
- Bank System Custom Exception - Real-world application

### Project Structure:
```
java-collections-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── exceptionHandling/
                    ├── BankSystemCustomException.java
                    ├── CheckedException.java
                    ├── CustomException.java
                    ├── ExceptionPropagation.java
                    ├── FinallyExecution.java
                    ├── MultipleCatchBlocks.java
                    ├── NestedTryCatch.java
                    ├── ThrowVsThrows.java
                    ├── TryWithResources.java
                    └── UncheckedException.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/exceptionHandling)

---

## Day 34 – Regular Expressions & JUnit Testing

**(Date: 21-Jan-2026)**

- Regular expressions with Pattern and Matcher classes
- Input validation, text parsing, and data extraction
- JUnit testing framework with assertions and test cases

### Regex Problems Solved:

- Extract Capitalized Words
- Censor Bad Words
- Validate and Extract Email Addresses
- Extract Currency Values
- Extract Dates (Multiple Formats)
- Extract URLs and Links
- Extract Programming Language Names
- Validate Hex Color Codes
- Validate License Plate Numbers
- Find Repeating Words
- Replace Multiple Spaces with Single Space
- Validate Credit Card Numbers
- Validate IP Addresses
- Validate Social Security Numbers
- Validate Usernames

### JUnit Test Cases Implemented:

- BankAccount - deposit, withdraw, transfer tests
- Calculator - arithmetic operations validation
- DatabaseConnection - connection lifecycle tests
- FileProcessor - file operations testing
- ListManager - list manipulation tests
- MathUtils - mathematical functions validation
- NumberUtils - number operations testing
- PasswordValidator - password strength checks
- PerformanceUtils - execution time tests
- StringUtils - string manipulation validation
- TemperatureConverter - conversion accuracy tests
- UserRegistration - registration workflow testing

### Project Structure:
```
java-collections-practice/
└── gcr-codebase/
    └── src/
        ├── main/
        │   └── java/
        │       └── regexJUnit/
        │           ├── regex/
        │           │   ├── CapitalizedWords.java
        │           │   ├── CensorBadWords.java
        │           │   ├── EmailAddresses.java
        │           │   ├── ExtractCurrencyValue.java
        │           │   ├── ExtractDate.java
        │           │   ├── ExtractLinks.java
        │           │   ├── ExtractProgrammingLanguageNames.java
        │           │   ├── HexColorCode.java
        │           │   ├── LicencePlateNumber.java
        │           │   ├── RepeatingWords.java
        │           │   ├── ReplaceMspaceToSspace.java
        │           │   ├── ValidateCreditCardNumber.java
        │           │   ├── ValidateIPAddress.java
        │           │   ├── ValidateSocialSecurityNo.java
        │           │   └── ValidateUsername.java
        │           └── JUnit/
        │               ├── BankAccount.java
        │               ├── Calculator.java
        │               ├── DatabaseConnection.java
        │               ├── FileProcessor.java
        │               ├── ListManager.java
        │               ├── MathUtils.java
        │               ├── NumberUtils.java
        │               ├── PasswordValidator.java
        │               ├── PerformanceUtils.java
        │               ├── StringUtils.java
        │               ├── TemperatureConverter.java
        │               └── UserRegistration.java
        └── test/
            └── java/
                └── regexJUnit/
                    ├── BankAccountTest.java
                    ├── CalculatorTest.java
                    ├── DatabaseConnectionTest.java
                    ├── FileProcessorTest.java
                    ├── ListManagerTest.java
                    ├── MathUtilsTest.java
                    ├── NumberUtilsTest.java
                    ├── PasswordValidatorTest.java
                    ├── PerformanceUtilsTest.java
                    ├── StringUtilsTest.java
                    ├── TemperatureConverterTest.java
                    └── UserRegistrationTest.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/regexJUnit)

---

## Day 35 – Annotations & Reflection

**(Date: 22-Jan-2026)**

- Built-in and custom annotations with retention policies
- Reflection API for runtime metadata access
- Dynamic object creation and method invocation

### Custom Annotations Implemented:

- @BugReport - track known bugs
- @CacheResult - caching method results
- @ImportantMethod - mark critical methods
- @JsonField - JSON serialization mapping
- @LogExecutionTime - performance monitoring
- @MaxLength - field validation
- @RoleAllowed - security and authorization
- @TaskInfo - task documentation
- @Todo - development tracking
- Built-in @Override and @Deprecated usage

### Reflection Use Cases:

- Access and Modify Static Fields
- Access Private Fields
- Custom Object Mapper (JSON-like)
- Dependency Injection using Reflection
- Dynamically Create Objects
- Dynamic Method Invocation
- Get Class Information (methods, fields, constructors)
- Invoke Private Methods
- JSON Representation Generator
- Logging Proxy using Reflection
- Method Execution Timing
- Retrieve Annotations at Runtime

### Project Structure:
```
java-collections-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── annotationsReflection/
                    ├── annotations/
                    │   ├── BugReportA.java
                    │   ├── CacheResultA.java
                    │   ├── ImportantMethodA.java
                    │   ├── JsonFieldA.java
                    │   ├── LogExecutionTimeA.java
                    │   ├── MaxLengthA.java
                    │   ├── RoleAllowedA.java
                    │   ├── SuppressWarningss.java
                    │   ├── TaskInfoA.java
                    │   ├── TodoA.java
                    │   ├── UseDeprecated.java
                    │   └── UseOverride.java
                    └── reflection/
                        ├── AccessModifyStaticFields.java
                        ├── AccessPrivateField.java
                        ├── CustomObjectMapper.java
                        ├── DependencyInjectionReflection.java
                        ├── DynamicallyCreateObjects.java
                        ├── DynamicMethodInvocation.java
                        ├── GetClassInformation.java
                        ├── InvokePrivateMethod.java
                        ├── JSONRepresentation.java
                        ├── LoggingProxyReflection.java
                        ├── MethodExecutionTiming.java
                        └── RetrieveAnnotationsRuntime.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/src/main/java/annotationsReflection)

---
