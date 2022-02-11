package singletonPattern;

public class SingletonProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleDeviceLogin singleLogin = SingleDeviceLogin.getInstance();
		System.out.println(singleLogin);
		singleLogin.toString();
		
		SingleDeviceLogin singleLoginChecking = SingleDeviceLogin.getInstance();
		System.out.println(singleLoginChecking);
		singleLoginChecking.toString();
		
		/*
		 * toString is helping here to display the memory location of the instance 
		 * and it is same every time as the object is static
		 */
		 
	}

}
