package com.java.testcase;

import java.util.List;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you  like to add any more hotels Y or N : ");
		String choice =scanner.next();
		if (choice.equals("Y"))
		{
		
		System.out.println("Enter Password");
			String pass=scanner.next();
			if(pass.equals("1234"))
			{
				InsertHotel.AddHotel();
			}
			
		}
		else
		{
			List<Hotel> list= UserVisible.avaiableHotels();
			System.out.println(UserVisible.enterUserData());
		}
		Tester.main(args);
	}
}
