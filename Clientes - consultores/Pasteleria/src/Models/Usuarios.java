package Models;

import java.util.function.BooleanSupplier;

public class Usuarios {
	
	
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public boolean setUsername(String username) {
		this.username = username;
		return true;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		
	}

	public Usuarios(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	@Override
		public String toString() {
			return String.format("Usuarios [username=%s, password=%s]", username, password);
	}

}
