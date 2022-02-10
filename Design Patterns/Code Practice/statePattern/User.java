package statePattern;

public class User {
	private UserType userType;

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	public void displayUserType() {
		userType.displayUserType();
		
	}


}
