# Design patterns
Design patterns represent the best practices used by experienced object-oriented software developers. Design patterns are solutions to general problems that software developers faced during software development. These solutions were obtained by trial and error by numerous software developers over quite a substantial period of time.  
Design patterns can be divided into three fundamental groups. They are :
- [Creational Design Pattern](#creational-design-pattern)
- [Structural Design Pattern](#structural-design-pattern)
- [Behavioral Design Pattern](#behavioral-design-pattern)
 # Creational Design Pattern
 These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. This gives program more flexibility in deciding which objects need to be created for a given use case.
 ## Singleton Pattern  
The concept of Singleton pattern is - a class must ensure that only single instance should be created and single object can be used by all other classes.  

It is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc. 

To create Singleton Pattern we basically use-  
- **Static member :** It gets memory only once because of static, it contains the instance of the Singleton class.
- **Private constructor :** It will prevent to instantiate the Singleton class from outside the class.
- **Static factory method :** This provides the global point of access to the Singleton object and returns the instance to the caller.
 
 ## Builder Pattern
The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation.

 ## Prototype Pattern
 The Prototype pattern is generally used when we have an instance of the class (prototype) and we'd like to create new objects by just copying the prototype. One of the ways we can implement this pattern in Java is by using the clone() method. To do this, we'd implement the Cloneable interface. When we're trying to clone, we should decide between making a shallow or a deep copy.

 ## Factory Method Pattern
* According to GoF(Gang of Four), this pattern  **“defines an interface for creating an object, but let subclasses decide which class to instantiate.**  The Factory method lets  a class defer instantiation to subclasses”.
* This pattern delegates the responsibility of initializing a class from the client to a particular factory class by creating a type of virtual constructor.
* To achieve this, we rely on a factory which provides us with the objects, hiding the actual implementation details. The created objects are accessed using a common interface.

 ## Abstract Factory Pattern
 Abstracr factory pattern describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.  
 The Abstract Factory design pattern solves problems like:
- How can an application be independent of how its objects are created?
- How can a class be independent of how the objects it requires are created?
- How can families of related or dependent objects be created?


# Structural Design Pattern
## Facade Pattern
A facade is a wrapper class that encapsulate the subsystem in order to hide the subsystem's complexity.  
The facade design pattern 
- is a means to hide the complexity of a subsystem by encapsulating it behind a unifying wrapper called a facade class
- removes the need for client classes to manage a subsystem on their own, resulting in less coupling between the subsystem and the client classes
- handles instantiation and redirection of tasks to the appropriate class within the subsystem; provides client classes with a simplified interface for the subsystem
- acts simply as a point of entry to a subsystem and does not add more functionality to the subsystem.
# Behavioral Design Pattern

	

 ## Observer pattern
This pattern is a one-to-many dependency between objects so that when one object changes state, all its dependents are notified. This is typically done by calling one of their methods.

## State pattern
The state pattern encapsulates the various states a machine can be in, and allows an object to alter its behavior when its internal state changes. 

## Strategy pattern
this pattern enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use

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


## Draft guideline

 - **Factory Method Pattern** vs **Abstract Factory Pattern**