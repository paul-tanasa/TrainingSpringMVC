package co.uk.endava.model;

public class User {
	private String username;
	private String email;
	private String password;
	
	public User(){
		this.setUsername("");
		this.setPassword("");
		this.setEmail("");
	}
	
	public User(String username, String email, String password){
		this.setUsername(username);
		this.setEmail(email);
		this.setPassword(password);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
