# Factory Method Pattern
The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class. 

### When to use :
- When the implementation of an interface or an abstract class is expected to change frequently
- When the current implementation cannot comfortably accommodate new change
- When the initialization process is relatively simple, and the constructor only requires a handful of parameters  

### Example Code :

```java
package factoryMethodPattern;

public interface OS {
	public void viewSpecification();
}
```

```java
package factoryMethodPattern;

public class Android implements OS{

	@Override
	public void viewSpecification() {
		System.out.println("Android");		
	}
}
```

```java
package factoryMethodPattern;

public class Windows implements OS{

	@Override
	public void viewSpecification() {
		System.out.println("Windows");		
	}
}
```

```java
package factoryMethodPattern;

public class IOS implements OS{

	@Override
	public void viewSpecification() {
		System.out.println("IOS");
	}
}
```

```java
package factoryMethodPattern;

public class OperatingSystemFactory {
  
	public OS getInstance(String typeOfOs) {
		if (typeOfOs.equals("Android")){
			return new Android();				
		}
		else if (typeOfOs.equals("Windows")) {
			return new Windows();
		}
		else {
			return new IOS();
		}
	}
}
```

```java
package factoryMethodPattern;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
		
		OS operatingSystem = operatingSystemFactory.getInstance("Android");
		operatingSystem.viewSpecification();
	}
}
```
