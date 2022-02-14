package factoryMethodPattern;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
		
		OS operatingSystem = operatingSystemFactory.getInstance("Android");
		operatingSystem.viewSpecification();
		

	}

}
