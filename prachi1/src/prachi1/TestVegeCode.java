package prachi1;

import java.util.Scanner;


public class TestVegeCode {
	
	public static void main(String args[]) {
		
		System.out.println();
		Scanner scanner=new Scanner(System.in);
		int total= scanner.nextInt();
		int id[] = new int[total];
		String name[]=new String[total];
		int quantity[]=new int[total];
		float cost[]=new float[total];
		for(int i=0;i<total; i++)
		{
			System.out.println("Enter item at "+(i+1)+" position");
			id[i]= i+1;
			name[i]=scanner.next();
			quantity[i]=scanner.nextInt();
			float[i]=scanner.nextFloat();
			
		}
		
	

	}
