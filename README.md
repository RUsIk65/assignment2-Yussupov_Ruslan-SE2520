Assignment 2 — Vehicle Management System\

project is to demonstrate the use of inheritance, abstraction, composition, aggregation, and polymorphism.
The system is built around an abstract superclass Vehicle, which represents common properties and behaviors of all vehicles.
Concrete subclasses such as Car, Motorcycle, and Truck extend this superclass and provide their own specific implementations of engine-related behavior.
A separate Driver class is used to demonstrate composition and aggregation by associating drivers with vehicles.

Through this project, the following OOP concepts are applied:
  1.Inheritance through a multi-class hierarchy
  2.Abstraction using an abstract class and abstract methods
  3.Method overriding in subclasses
  4.Composition and aggregation between Vehicle and Driver
  5.Polymorphism using an array of Vehicle objects
  
Vehicle:
  Fields:
    String brand;
    int year;
Abstract methods:
  startEngine();
  stopEngine();
Concrete method:
  displayInfo();
The Vehicle class defines a common interface for all types of vehicles and ensures that each subclass implements its own engine behavior.

Subclass of Vehicle
  Car:
    Fields:
      int doors;
      String fuelType;
    Uses super(brand, year) to initialize inherited fields
    Overrides startEngine() and stopEngine() 
  Motorcycle:
    Fields:
      hasSidecar;
      Uses super(brand, year) to initialize inherited fields
    Overrides startEngine() and stopEngine()
  Truck:
    Fields:
      double capacity;
      int numAxles;
    Uses super(brand, year) to initialize inherited fields
    Overrides startEngine() and stopEngine() 

Driver class
  Flieds:
    String name;
    String licenseNumber;
    String professional;
  Method:
    displayDriverInfo()

Inheritance significantly simplified the system design by allowing common vehicle attributes and behaviors to be defined once in the Vehicle superclass and reused across all subclasses.
This reduced code duplication and improved maintainability.
Abstract methods ensured that all vehicle types implemented essential behaviors such as starting and stopping the engine.

Method overriding made it possible for each vehicle type to define its own engine behavior while still being treated uniformly through a Vehicle reference.
One of the main challenges was correctly using protected access modifiers to allow subclass access without breaking encapsulation.
Understanding when to use composition versus aggregation also required careful design consideration.
Open a terminal in the src directory
Compile all Java files:
  javac *.java
Run the program:
  java Main    
