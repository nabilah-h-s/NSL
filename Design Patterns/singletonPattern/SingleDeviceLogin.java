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
