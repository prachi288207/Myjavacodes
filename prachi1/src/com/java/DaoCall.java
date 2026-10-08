package com.java;


public class DaoCall {
	
	public void user(){
		user u1=new user(1,"Test",234.56f);
		user u2=new user(2,"User",435.67f);
		
		System.out.println(u1.getId()+" "+u1.getName() +" "+u1.getFees());
		System.out.println(u2.getId()+" "+u2.getName() +" "+u2.getFees());
		System.out.println(u1+" "+u2);
        //List<user> list=new ArrayList<User>();
		//list.add(u1);
		//list.add(u2);
	}

}
