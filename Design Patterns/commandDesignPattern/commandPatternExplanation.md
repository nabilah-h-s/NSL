# Command Pattern
Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation allows pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

## When to use :
- when we want to parametrize objects with operations.
- when we want to queue operations, schedule their execution, or execute them remotely.
- when we want to implement reversible operations.

## Example Code :
```java
package commandPattern;

public class Button {
	private String label;
	private Command command;
	
	

	public Button(Command command) {
		//super();
		this.command = command;
	}

	public void click() {
		command.execute();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
```

```java
package commandPattern;

public interface Command {

	void execute();
}
```

```java
package commandPattern;

import customerServiceForCommandPattern.AddCustomerCommand;
import customerServiceForCommandPattern.CustomerService;

public class CommandPatternMain {

	public static void main(String[] args) {

		var service = new CustomerService();
		var command = new AddCustomerCommand(service);
		var button = new Button(command);
		button.click();
		
	}
}
```

```java
package customerServiceForCommandPattern;

import commandPattern.Command;

public class AddCustomerCommand implements Command{
	private CustomerService service;
	

	public AddCustomerCommand(CustomerService service) {
		//super();
		this.service = service;
	}


	@Override
	public void execute() {
		service.addCustomer();
		
	}
	

}
```
```java
package customerServiceForCommandPattern;

public class CustomerService {

	public void addCustomer() {
		System.out.println("Customer added Succesfully");
	}
}

```


## References :
- [Command Pattern with Example](https://refactoring.guru/design-patterns/command)
- [Command Pattern javapoint](https://www.javatpoint.com/command-pattern)
