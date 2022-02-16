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
