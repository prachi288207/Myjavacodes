package com.java;

public class Hotel {
	int id;
	String name;
	String room;
	int price;
	public Hotel(int id,String name,String room, int price) {
		this.id=id;
		this.name=name;
		this.room=room;
		this.price=price;					
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
}

