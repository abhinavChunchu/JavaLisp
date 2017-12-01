package com.training.corejava.clone;

public class Person implements Cloneable {

	private String name;
	private Integer age;
	private String city;
	private String Phone;
	private float height;
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + ", Phone=" + Phone + ", height=" + height
				+ "]";
	}

	public Person clone() throws CloneNotSupportedException{
		return (Person) super.clone();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	
}
