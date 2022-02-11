package statePattern;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User userGen = new User();
		userGen.setUserType(new GeneralUser());
		userGen.displayUserType();
		
		User userPrem = new User();
		userPrem.setUserType(new PremiumUser());
		userPrem.displayUserType();		

	}

}
