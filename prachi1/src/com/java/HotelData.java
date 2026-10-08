package com.java;

import java.util.List;
import java.util.ArrayList;

public class HotelData {
	
	public List<Hotel> storeAllHotels(){
		
		Hotel h1=new Hotel(1,"crown1","L1",5000);
		Hotel h2=new Hotel(2,"crown2","L2",15000);
		Hotel h3=new Hotel(3,"crown3","L3",55000);
		
		List<Hotel> hotels=new ArrayList<Hotel>();
		hotels.add(h1);
		hotels.add(h2);
		hotels.add(h3);
		return hotels;
		
	}

}
