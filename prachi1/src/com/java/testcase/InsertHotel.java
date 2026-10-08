package com.java.testcase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertHotel {

    public static void AddHotel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hotel name:");
        String name = scanner.nextLine();

        System.out.println("Enter hotel room type:");
        String room = scanner.nextLine();

        System.out.println("Enter hotel price:");
        int price = scanner.nextInt();

        try {

        	Connection  connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/seca22026", "root","root");

            String query =
                    "INSERT INTO hotel (name, room, price) VALUES (?, ?, ?)";

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setString(1, name);
            statement.setString(2, room);
            statement.setInt(3, price);

            int x = statement.executeUpdate();

            if (x > 0) {
                System.out.println("Hotel inserted successfully!");
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}