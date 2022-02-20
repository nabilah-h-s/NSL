# Design patterns
Design patterns represent the best practices used by experienced object-oriented software developers. Design patterns are solutions to general problems that software developers faced during software development. These solutions were obtained by trial and error by numerous software developers over quite a substantial period of time.  
Design patterns can be divided into three fundamental groups. They are :
- [Creational Design Pattern](#creational-design-pattern)
- [Structural Design Pattern](#structural-design-pattern)
- [Behavioral Design Pattern](#behavioral-design-pattern)
 
 # Creational Design Pattern
 These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.
 
 ## [Singleton Pattern](https://github.com/haliban25/NSL/blob/main/Design%20Patterns/singletonPattern/singletonPatternExplanation.md)  
The concept of Singleton pattern is - a class must ensure that only single instance should be created and single object can be used by all other classes.  

Where to use singleton pattern :  
- For resources that are expensive to create (like database connection objects)
- It's good practice to keep all loggers as Singletons which increases performance
- Classes which provide access to configuration settings for the application
- Classes that contain resources that are accessed in shared mode

 ## [Builder Pattern](https://github.com/haliban25/NSL/blob/main/Design%20Patterns/builderPattern/builderPatternExplanation.md)
The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation.  

The Builder design pattern solves problems like :
- How can a class (the same construction process) create different representations of a complex object?
- How can a class that includes creating a complex object be simplified?

 ## [Prototype Pattern](https://github.com/haliban25/NSL/blob/main/Design%20Patterns/prototypePattern/prototypePatternExplanation.md)
 The Prototype pattern is generally used when we have an instance of the class (prototype) and we'd like to create new objects by just copying the prototype. One of the ways we can implement this pattern in Java is by using the clone() method. To do this, we'd implement the Cloneable interface. When we're trying to clone, we should decide between making a shallow or a deep copy.  

When to use Prototype Pattern : 
- When the process of making an object is expensive or takes a long time.
- When the client application must be unaware of the creation of an object.
- When you need to keep the number of classes in your application to a minimum level.
- When the classes are instantiated at runtime.

 ## [Factory Method Pattern](https://github.com/haliban25/NSL/blob/main/Design%20Patterns/factoryMethodPattern/factoryMethodPatternExample.md)
 In Factory pattern, object can be created without exposing the creation logic to the client and refered to newly created object using a common interface. It defines an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. Factory Method Pattern is also known as Virtual Constructor.  
 In this method, We  rely on a factory which provides us with the objects, hiding the actual implementation details. The created objects are accessed using a common interface.  

 When to Use Factory Method Design Pattern :
- When the implementation of an interface or an abstract class is expected to change frequently
- When the current implementation cannot comfortably accommodate new change
- When the initialization process is relatively simple, and the constructor only requires a handful of parameters

 ## Abstract Factory Pattern
 Abstract factory pattern describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse. It is similar to Factory pattern and it is a factory of factories. In factory design pattern, a single Factory class returns the different sub-classes based on the input provided and the factory class uses if-else or switch statements to achieve this.

In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class and then an Abstract Factory class that will return the sub-class based on the input factory class.  

 The Abstract Factory design pattern solves problems like :
- How can an application be independent of how its objects are created?
- How can a class be independent of how the objects it requires are created?
- How can families of related or dependent objects be created?


# Structural Design Pattern
Structural design patterns are those that simplify the design of large object structures by identifying relationships between them. They describe common ways of composing classes and objects so that they become repeatable as solutions.  

## [Adapter Pattern](https://github.com/haliban25/NSL/blob/main/Design%20Patterns/adapterPattern/adapterPatternExplanation.md)
An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

When to use :
- When an outside component provides captivating functionality that we'd like to reuse, but it's incompatible with our current application. A suitable Adapter can be developed to make them compatible with each other.
- When our application is not compatible with the interface that our client is expecting.
- When we want to reuse legacy code in our application without making any modification in the original code.

## Bridge Pattern

## Composite Pattern
The composite pattern is meant to allow treating individual objects and compositions of objects, or “composites” in the same way. It can be viewed as a tree structure made up of types that inherit a base type, and it can represent a single part or a whole hierarchy of objects.

When to use :
- When we want to represent part-whole hierarchies of objects.
- When we want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly.

## Proxy Pattern

## Decorator Pattern

## Facade Pattern
A facade is a wrapper class that encapsulate the subsystem in order to hide the subsystem's complexity.  
The facade design pattern -
- is a means to hide the complexity of a subsystem by encapsulating it behind a unifying wrapper called a facade class
- removes the need for client classes to manage a subsystem on their own, resulting in less coupling between the subsystem and the client classes
- handles instantiation and redirection of tasks to the appropriate class within the subsystem; provides client classes with a simplified interface for the subsystem
- acts simply as a point of entry to a subsystem and does not add more functionality to the subsystem.  

## Flyweight Pattern

# Behavioral Design Pattern
These patterns are designed depending on how one class communicates with others.

 ## Observer pattern
This pattern is a one-to-many dependency between objects so that when one object changes state, all its dependents are notified. This is typically done by calling one of their methods.

## State pattern
The state pattern encapsulates the various states a machine can be in, and allows an object to alter its behavior when its internal state changes. 

## Strategy pattern
This pattern enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use

- **State Pattern** vs **Strategy Pattern**  
Both the patterns are pretty similar in practice, and the defining difference between them tends to vary. Some popular choices are:
* States store a reference to the context object that contains them but Strategies do not.
* States are allowed to replace themselves (IE: to change the state of the context object to something else), while Strategies are not.
* Strategies are passed to the context object as parameters, while States are created by the context object itself.
* Strategies only handle a single, specific task, while States provide the underlying implementation for everything (or most everything) the context object does.

## Reference :
- [The 3 Types of Design Patterns All Developers Should Know](https://www.freecodecamp.org/news/the-basic-design-patterns-all-developers-need-to-know/)
- [Introduction to Creational Design Patterns](https://www.baeldung.com/creational-design-patterns)
- [Structural Patterns in Core Java](https://www.baeldung.com/java-core-structural-patterns)
- [Behavioral Patterns in Core Java](https://www.baeldung.com/java-behavioral-patterns-jdk)
- [Java design patterns - example tutorial](https://www.journaldev.com/1827/java-design-patterns-example-tutorial)
