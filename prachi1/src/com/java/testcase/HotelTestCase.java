package com.java.testcase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HotelTestCase {
	public List<Hotel> storeAllHotels()
	{
		List<Hotel> hotels=new ArrayList<Hotel>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many hotels");
		int count=scanner.nextInt();
		System.out.println("ENter Name,rooms, price");
		for(int i=0;i<count;i++)
		try
		{
		Hotel hotel=new Hotel(i+1, scanner.next(), scanner.next(), scanner.nextInt());
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/seca22026", "root","root");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("SELECT * FROM seca22026.hotel;");
		while(set.next())
		{
		Hotel hotel1=new Hotel(set.getInt(1), set.getString(2), set.getString(3), set.getInt(4));
		hotels.add(hotel1);
		}



		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return hotels;

	}
}