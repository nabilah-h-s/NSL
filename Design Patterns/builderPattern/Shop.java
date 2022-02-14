package builderPattern;

public class Shop {
	
	public static void main(String args[]) {
		Phone phoneWithOsBattery = new PhoneBuilder().setBattery(5000).setOs("Android").getPhone();
		System.out.println(phoneWithOsBattery);
		
		Phone phoneWithBatteryRam = new PhoneBuilder().setBattery(6000).setRam(64).getPhone();
		System.out.println(phoneWithBatteryRam);
	}
	
	
}
