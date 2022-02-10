# Design patterns
- **Observer pattern**
<br> This pattern is a one-to-many dependency between objects so that when one object changes state, all its dependents are notified. This is typically done by calling one of their methods.
- **State pattern**
<br>The state pattern encapsulates the various states a machine can be in, and allows an object to alter its behavior when its internal state changes. 
- **Strategy pattern**
<br>this pattern enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use
	 - **state vs strategy**
	 <br> Both the patterns are pretty similar in practice, and the defining difference between them tends to vary. Some popular choices are:

		- States store a reference to the context object that contains them. Strategies do not.
		- States are allowed to replace themselves (IE: to change the state of the context object to something else), while Strategies are not.
		- Strategies are passed to the context object as parameters, while States are created by the context object itself.
		- Strategies only handle a single, specific task, while States provide the underlying implementation for everything (or most everything) the context object does.



