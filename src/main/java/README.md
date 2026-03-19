# 🚀 Low Level Design (LLD)

---

## 📌 Low Level Design

---

### 🔹 Encapsulation

Encapsulation is hiding internal state and exposing controlled behavior through methods.  
Encapsulation is the concept of hiding internal state and exposing controlled behavior through methods.

It prevents direct access to variables so that all modifications go through well-defined methods where business rules and validations can be enforced.

For example, in a bank account, the balance cannot be modified directly; deposits and withdrawals are done through methods to ensure consistency and security.

---

### 🔹 Composition over inheritance

Inheritance creates tight coupling. With composition, behavior is delegated, so changes don’t affect other classes.

We prefer composition over inheritance when there is a HAS-A relationship instead of an IS-A relationship.

Inheritance introduces tight coupling, where changes in the base class can impact all subclasses.

Composition avoids this by delegating behavior to another object, making the design more flexible and allowing classes to change their behavior independently.

---

### 🔹 Polymorphism

Polymorphism helps in making systems extensible by allowing new implementations without modifying existing logic.

Polymorphism allows us to treat different implementations uniformly through a common interface.

It helps in extending behavior by adding new implementations without changing existing code, which follows the Open–Closed Principle.

For example, different payment methods can implement the same interface and be used interchangeably without impacting the client code.

---

### 🔹 Encapsulation vs Abstraction

Encapsulation is about hiding internal state and controlling how data is accessed.

Abstraction is about exposing only what the user needs and hiding implementation details.

---

## 📌 SOLID Principles

---

### 🔹 S - Single Responsibility Principle

A class should have only one reason to change, meaning it should be responsible for only one specific functionality or concern.

For example, a class that handles business logic should not handle logging or DB operations.

---

### 🔹 O - Open Closed Principle

Any software entity (class, interface) should be open for extension but closed for modification.

For example, adding a new payment method should be done by creating a new class rather than changing the existing payment logic.

---

### 🔹 L - Liskov Substitution principle

Objects of a superclass should be replaceable with objects of its subclass without interrupting the correctness of the program

Because the child class should not break the expectations set by the parent class.

If a subclass throws new exception the method inherited by parent , it violates LSP

---

### 🔹 I - Interface Segregation Principle

A class should not be forced to implement a method which is irrelevant to its behaviour.

Example - a waiter should not forced to implement prepareFood

---

### 🔹 D - Dependency Inversion Principle

High level modules should not depend on low level modules. Both should depend on abstractions.

It removes tight coupling and increase flexibility

For example - PaymentService should depend on payment interface , not on concrete payment methods like credit card or UPI

---

## 📌 Design Patterns

---

### 🔹 Strategy Design Pattern - Behavioral design pattern

Strategy patterns let us choose different behaviours at runtime without changing the client code.

Context class has a strategy (HAS-A)

We define an interface -> implement multiple strategies -> context class choose one at runtime.

Example - PaymentService has a PaymentStrategy , -> UPI, Credit Card

---

### 🔹 Observer Design Pattern - Behavioral design pattern

Observer pattern allows multiple dependent objects or observers to get notified when the state of another object (subject) got changed and observers are subscribed to it.

Subject has observers (HAS-A)

For example -

Interface Observer  
Void update()

User implements Observer

Interface Subject  
void registerObserver(Observer observer);  
void removeObserver(Observer observer);  
void notifyObservers();

YoutubeChannel implements Subject  
YouTubeChannel  HAS-A  List<Observer>

---

### 🔹 Decorator Design Pattern - Structural Design Pattern

Decoration design pattern allows us to add new functionality/behaviour to an object without changing its existing code.

Decorator IS-A Component  
Decorator HAS-A Component

Example

Interface Pizza  
PlainPizza implements Pizza

abstract PizzaDecortor implements Pizza  (IS-A)

protected Pizza pizza; (HAS-A)

MushroomDecorator extends PizzaDecorator (IS-A)  
CheeseDecorator extends PizzaDecorator

---

### 🔹 Factory Design Pattern - Creational Design Pattern

---

#### ✅ Simple factory pattern

A simple factory is a factory class which decides which concrete product class to instantiate based on client input.

Class Factory HAS-A Product interface (Factory don’t HAS-A product here, it just create the objects of Product)

createProduct(String type) : concrete product

If-else is used here and calls respective concrete product

Interface Product  
ConcreteProd implements Product (IS-A)

SRP, DIP -> followed  
OCP -> violated

---

#### ✅ Factory Method pattern

Factory method defines an interface to create objects, but its subclasses decide which concrete class needs to be instantiated.

Interface Factory  
Interface Product

ConcreteProductsA implements Product  
ConcreteProductsB implements Product

ConcreteFactoryA implements Factory (IS-A)  
ConcreteFactoryA CREATES ConcreteProductA

Client HAS-A Product

ConcreteFactoryB implements Factory (IS-A)  
ConcreteFactoryB CREATES ConcreteProductB

Client HAS-A Product

---

#### ✅ Abstract Factory Method

It provides an interface for creating families of related objects without specifying their concrete classes.

Factory of factories for related objects

ProductA (Burger) interface  
ProductB (GarlicBread) interface

ConcreteProductA1 implements ProductA  
ConcreteProductB1 implements ProductB

Interface Factory (Ex-MealFactory)

createBurger()  
createGarlicBread()

ConcreteFactoryA implements Factory  
ConcreteFactoryA CREATES ConcreteProductA1 and also ConcreteProductB1

ConcreteFactoryB implements Factory -> similar

Abstract Factory Method