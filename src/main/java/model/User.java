package main.java.model;

public class User implements IModel {

	private int u_id;
	private String name;
	private String email;
	private static User user; // hold itself

	public User(int u_id, String name, String email) {
		this.u_id = u_id;
		this.name = name;
		this.email = email;
		user = this;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static User getUser() {
		return user;
	}

	public static void setUser(User user) {
		User.user = user;
	}

}
