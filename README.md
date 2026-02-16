# Week 6: Java 8 Features – Lambda Expressions & Functional Interfaces

## Day 36 – Lambda Expressions

**(Date: 27-Jan-2026)**

- Lambda expression syntax and functional programming
- Method references and constructor references
- Simplifying anonymous inner classes 
- Stream operations with lambda expressions
- Predicate, Function, Consumer, and Supplier interfaces

### Concepts Covered:

- Basic Lambda Syntax
- Lambda with Collections (List, Set, Map)
- Lambda for Sorting and Filtering
- Method References (Static, Instance, Constructor)
- Lambda with Streams API
- Custom Functional Interface with Lambda
- Lambda for Event Handling
- Lambda with Multithreading (Runnable)
- Lambda for Mathematical Operations
- Lambda with Optional Class

### Project Structure:
```
java8-programming-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── lambdaExpressions/
                    ├── BasicLambdaSyntax.java
                    ├── LambdaWithCollections.java
                    ├── LambdaSortingFiltering.java
                    ├── MethodReferences.java
                    ├── LambdaWithStreams.java
                    ├── CustomFunctionalInterface.java
                    ├── LambdaEventHandling.java
                    ├── LambdaMultithreading.java
                    ├── LambdaMathOperations.java
                    └── LambdaWithOptional.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/src/main/java/lambdaExpressions)

---

## Day 37 – Functional Interfaces

**(Date: 27-Jan-2026)**

- Understanding @FunctionalInterface annotation
- Built-in functional interfaces (Predicate, Function, Consumer, Supplier)
- Custom functional interface creation
- Function composition and chaining
- BiFunction, BiPredicate, BiConsumer interfaces

### Functional Interfaces Implemented:

**Built-in Functional Interfaces:**
- Predicate - Boolean-valued functions
- Function - Transformation operations
- Consumer - Operations with no return
- Supplier - Value generation
- BiFunction - Two-argument functions
- BiPredicate - Two-argument predicates
- BiConsumer - Two-argument consumers
- UnaryOperator - Same type input/output
- BinaryOperator - Binary operations

**Custom Functional Interfaces:**
- Calculator Operations
- String Manipulator
- Validator Interface
- Transformer Interface
- Combiner Interface

### Project Structure:
```
java8-programming-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── functionalInterface/
                    ├── functionalInterface/
                    │   ├── PredicateDemo.java
                    │   ├── FunctionDemo.java
                    │   ├── ConsumerDemo.java
                    │   ├── SupplierDemo.java
                    │   ├── BiFunctionDemo.java
                    │   ├── BiPredicateDemo.java
                    │   ├── BiConsumerDemo.java
                    │   ├── UnaryOperatorDemo.java
                    │   └── BinaryOperatorDemo.java
                    └── implementingInterfaces/
                        ├── CalculatorInterface.java
                        ├── StringManipulator.java
                        ├── ValidatorInterface.java
                        ├── TransformerInterface.java
                        └── CombinerInterface.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/src/main/java/functionalInterface)

---

## Day 38 – Stream API, Collectors & Java 8 Features

**(Date: 28-Jan-2026)**

- Stream API operations (filter, map, reduce, collect)
- Intermediate and terminal operations
- Collectors utility class and grouping operations
- Parallel streams for performance optimization
- Real-world scenarios with Java 8 features

### Topics Covered:

- Stream Creation and Basic Operations
- Filtering and Mapping Data
- Sorting and Distinct Elements
- Min/Max and Finding Elements
- Reduce and Accumulation
- Collectors (toList, toSet, toMap, groupingBy, partitioningBy)
- Joining and Summarizing
- Parallel Streams
- FlatMap and Complex Transformations
- Stream API with Collections

### Project Structure:
```
java8-programming-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                ├── streamAPI/
                │   ├── StreamCreation.java
                │   ├── FilterMapOperations.java
                │   ├── SortingDistinct.java
                │   ├── MinMaxFinding.java
                │   ├── ReduceOperations.java
                │   ├── FlatMapOperations.java
                │   └── ParallelStreams.java
                └── collectors/
                    ├── CollectorsDemo.java
                    ├── GroupingByDemo.java
                    ├── PartitioningByDemo.java
                    ├── JoiningDemo.java
                    └── SummarizingDemo.java
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/src/main/java)

---

## Day 39 – Scenario Questions

**(Date: 31-Jan-2026)**

- 120+ practical scenario-based questions
- Real-world problem-solving with Java 8 features
- Interview preparation with lambda expressions
- Stream API practical applications
- Complex data manipulation scenarios

### Scenario Categories:

**Lambda & Functional Programming (30 scenarios)**
- Lambda expression applications
- Functional interface implementations
- Method reference usage
- Custom functional interfaces

**Stream API Operations (40 scenarios)**
- Data filtering and transformation
- Grouping and partitioning
- Sorting and searching
- Complex stream pipelines

**Collectors & Data Processing (25 scenarios)**
- Custom collectors
- Data aggregation
- Statistical operations
- Map/Reduce patterns

**Real-World Applications (25 scenarios)**
- Employee management systems
- Product inventory operations
- Banking transactions
- E-commerce data processing
- Social media analytics

### Project Structure:
```
java8-programming-practice/
└── gcr-codebase/
    └── src/
        └── main/
            └── java/
                └── scenarios/
                    ├── lambdaScenarios/
                    ├── streamScenarios/
                    ├── collectorsScenarios/
                    └── realWorldApplications/
```

**GitHub Repository:** [View on GitHub](https://github.com/Jadhav-Krishna/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/src/main/java/scenarios)

---
