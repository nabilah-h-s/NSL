# Adapter Design Pattern
An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

The main motive behind using this pattern is to convert an existing interface into another interface that the client expects. It's usually implemented once the application is designed.

## When to use :
- When an outside component provides captivating functionality that we'd like to reuse, but it's incompatible with our current application. A suitable Adapter can be developed to make them compatible with each other.
- When our application is not compatible with the interface that our client is expecting.
- When we want to reuse legacy code in our application without making any modification in the original code.

## How to Implement :
- Using Composition
- Using Inheritance

## Example Code :
```java
package adapterPattern;

public class Image {

}
```
```java
package adapterPattern;

public interface Filter {

	void apply(Image image);
}
```
```java
package adapterPattern;

public class VividFilter implements Filter{

	@Override
	public void apply(Image image) {
		//may be a long logical code for applying the filter
		System.out.println("Applying Vivid Filter");
		
	}

}
```
```java
package adapterPattern;

import thirdPartyFilter.CaramelFilter;

public class AdapterPattern {

	public static void main(String[] args) {

		var imageView = new ImageView(new Image());
		imageView.applyFilter(new VividFilter());
		
	}

}
```
```java
package thirdPartyFilter;
import adapterPattern.Image;

public class CaramelFilter {
	
	public void init() {
		
	}
	
	public void render(Image image) {
		System.out.println("Applying Caramel Filter");
	}

}
```
### Adapter Pattern Using Composition :
```java
package adapterPattern;

import thirdPartyFilter.CaramelFilter;

public class CaramelAdapter implements Filter {

	private CaramelFilter caramel;
	
	public CaramelAdapter(CaramelFilter caramel) {
		this.caramel = caramel;
	}

	@Override
	public void apply(Image image) {
		caramel.init();
		caramel.render(image);
	}

}
```

```java
package adapterPattern;

import thirdPartyFilter.CaramelFilter;

public class AdapterPattern {

	public static void main(String[] args) {
		
		var imageViewThirdPartyFilter = new ImageView(new Image());
		imageViewThirdPartyFilter
        .applyFilter(new CaramelAdapter(new CaramelFilter()));
	}

}
```
### Adapater Pattern using Inheritance :
```java
package adapterPattern;

import thirdPartyFilter.CaramelFilter;

public class CaramelAdapter extends CaramelFilter implements Filter {

	
	@Override
	public void apply(Image image) {
		init();
		render(image);
	}

}
```
```java
package adapterPattern;

public class AdapterPattern {

	public static void main(String[] args) {
		
		var imageViewThirdPartyFilter = new ImageView(new Image());
		imageViewThirdPartyFilter.applyFilter(new CaramelAdapter());
	}

}
```
