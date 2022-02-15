# Singleton Pattern
The concept of Singleton pattern is - a class must ensure that only single instance should be created and single object can be used by all other classes.  

It is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc. 

To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.

- **Private constructor** to restrict instantiation of the class from other classes.
- **Private static variable** of the same class that is the only instance of the class.
- **Public static method** that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.

The following example can illustrate how singleton pattern works.

Here we are using **SingleDeviceLogin** class for creating a single object.

```java
package singletonPattern;

public class SingleDeviceLogin {
	String name;
	String email;
	static SingleDeviceLogin object = new SingleDeviceLogin();

	private SingleDeviceLogin() {
		this.name = "nabilah";
		this.email = "nabilah.sarker@neural-semiconductor.com";
	}

	public static SingleDeviceLogin getInstance() {
		return object;
	}

}
```

```java
package singletonPattern;

public class SingletonProject {

	public static void main(String[] args) {

		SingleDeviceLogin singleLogin = SingleDeviceLogin.getInstance();
		System.out.println(singleLogin);
		singleLogin.toString();

		SingleDeviceLogin singleLoginChecking = SingleDeviceLogin.getInstance();
		System.out.println(singleLoginChecking);
		singleLoginChecking.toString();

	}

}
```

## References :
- [Java Singleton Design Pattern Best Practices with Examples](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)
- [Design Patterns course (Coursera)](https://www.coursera.org/learn/design-patterns)
