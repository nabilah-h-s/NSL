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
