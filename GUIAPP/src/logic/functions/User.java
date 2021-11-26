package logic.functions;

public class User {
	
	private String Username;
	private String Password;
	
	User(String username, String password) {
		Username = username;
		Password = password;
	}
	
	public String GetUsername() {
		return this.Username;
	}
	
	public String GetPassword() {
		return this.Password;
	}
	
	public void SetUsername(String username) {
		Username = username;
	}
	
	public void SetPassword(String password) {
		Password = password;
	}


}
