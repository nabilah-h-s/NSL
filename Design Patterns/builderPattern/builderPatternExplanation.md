# Builder Pattern
Builder pattern is designed to deal with the construction of comparatively complex objects.  
When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object (a builder) to construct the object.  
This builder can then be used to create many other similar representations using a simple step-by-step approach.  

### When to Use Builder Pattern
- When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
- When an increase in the number of constructor parameters leads to a large list of constructors
- When client expects different representations for the object that's constructed

### Example Code
```java
package builderPattern;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return " [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}	

}
```

```java
package builderPattern;

public class PhoneBuilder {

	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(os,ram,processor,screenSize,battery);
	}	

}
```

```java
package builderPattern;

public class Shop {
	
	public static void main(String args[]) {
		Phone phoneWithOsBattery = new PhoneBuilder().setBattery(5000).setOs("Android").getPhone();
		System.out.println(phoneWithOsBattery);
		
		Phone phoneWithBatteryRam = new PhoneBuilder().setBattery(6000).setRam(64).getPhone();
		System.out.println(phoneWithBatteryRam);
	}
	
}
```

## References :
- [Builder Pattern Wikipedia](https://en.wikipedia.org/wiki/Builder_pattern)
- [Builder Design Pattern in Java](https://www.journaldev.com/1425/builder-design-pattern-in-java)
- [Builder Design Pattern](https://www.baeldung.com/creational-design-patterns#builder)
