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
