package com.java.testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelData {

	public List<Hotel> storeAllHotels()
	{
		List<Hotel> hotels=new ArrayList<Hotel>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many hotels");
		int count=scanner.nextInt();
		System.out.println("ENter Name,rooms, price");
		for(int i=0;i<count;i++)
		{
		Hotel hotel=new Hotel(i+1, scanner.next(), scanner.next(), scanner.nextInt());
		hotels.add(hotel);
		}
		
		
		
		
		return hotels;
		
	}
}