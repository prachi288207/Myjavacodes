package com.java;

public class Users {
	int id;
	String name;
	int age;
	String address;
	public Users(int id,String name, int age ,String address) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=address;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return age;
	}
	public String getAddress() {
		return address;
	}
}


