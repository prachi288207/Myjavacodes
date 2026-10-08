package com.java;

import java.util.List;

public class UserVisible {

	public static void main(String[] args) 
	{
		HotelData data=new HotelData();
		
		
		System.out.println("available hotels are:");
		
		List<Hotel> list=data.storeAllHotels();
		
		for(Hotel h:list)
		{
			System.out.println(h.getName()+ " "+h.getPrice());
		}
		
		System.out.println("Enter Hotel name");
		
		System.out.println("Enter How many days");
		
		System.out.println("Total bill is 75000 ");
	}


}

