# Design patterns
Design patterns represent the best practices used by experienced object-oriented software developers. Design patterns are solutions to general problems that software developers faced during software development. These solutions were obtained by trial and error by numerous software developers over quite a substantial period of time.  
Design patterns can be divided into three fundamental groups. They are :
- Creational Design Pattern
- Structural Design Pattern
- Behavioral Design Pattern
 ## Creational Design Pattern
 
 - [ ] **Singleton Pattern**
<br>The concept of Singleton pattern is - a class must ensure that only single instance should be created and single object can be used by all other classes. It is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc. To create Singleton Pattern we basically use-
	- **Static member :** It gets memory only once because of static, it contains the instance of the Singleton class.
	- **Private constructor :** It will prevent to instantiate the Singleton class from outside the class.
	- **Static factory method :** This provides the global point of access to the Singleton object and returns the instance to the caller.
 
 - [ ] **Builder Pattern**
 - [ ] **Prototype Pattern**
 - [ ] **Factory Method Pattern**

	 - According to GoF(Gang of Four), this pattern  **“defines an interface for creating an object, but let subclasses decide which class to instantiate.**  The Factory method lets a class defer instantiation to subclasses”.
	- This pattern delegates the responsibility of initializing a class from the client to a particular factory class by creating a type of virtual constructor.
	- To achieve this, we rely on a factory which provides us with the objects, hiding the actual implementation details. The created objects are accessed using a common interface.

 - [ ] **Abstract Factory Pattern**
	 - [ ] **Factory Method Pattern** vs **Abstract Factory Pattern**

## Structural Design Pattern
## Behavioral Design Pattern

	

 - [ ] **Observer pattern**
<br> This pattern is a one-to-many dependency between objects so that when one object changes state, all its dependents are notified. This is typically done by calling one of their methods.

 - [ ] **State pattern**
<br>The state pattern encapsulates the various states a machine can be in, and allows an object to alter its behavior when its internal state changes. 

 - [ ] **Strategy pattern**
<br>this pattern enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use

	- [ ] **State Pattern** vs **Strategy Pattern**
	<br> Both the patterns are pretty similar in practice, and the defining difference between them tends to vary. Some popular choices are:
		- States store a reference to the context object that contains them.   
   Strategies do not.
 		- States are allowed to replace themselves (IE: to change the state of the context object to something else), while Strategies are not.
		- Strategies are passed to the context object as parameters, while States are created by the context object itself.
		- Strategies only handle a single, specific task, while States provide the underlying implementation for everything (or most   
   everything) the context object does.
