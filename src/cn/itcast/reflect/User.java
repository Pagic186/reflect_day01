package cn.itcast.reflect;

public class User {
	private String username;
	private String password;
	private String hobby; // 1,2
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", hobby=" + hobby + "]";
	}
	
}
