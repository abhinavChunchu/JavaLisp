package com.training.corejava.serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// implement serializable is very important
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String username;
	private transient String password;
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
	
	public void serialize() throws IOException
	{
		FileOutputStream fos = new FileOutputStream("c:\\temp\\userdetails.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(this);
		oos.close();
		fos.close();
	} 

	public User deserialize() throws IOException, ClassNotFoundException{

		FileInputStream fis = new FileInputStream("c:\\temp\\userdetails.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User u = (User) ois.readObject();
		ois.close();
		fis.close();
		return u;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}
