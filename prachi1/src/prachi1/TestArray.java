
package prachi1;

import java.util.Scanner;

public class TestArray {
	
	public static void main(String [] args) {
	
		
		int a[]=new int[5];
		
		Scanner scanner=new Scanner(System.in);
		String s="javacode";
        
		for(int i=0;i<s.length();i++)
		System.out.println(s.charAt(i));
		
		System.out.println("Enter your Array");
		for(int i=0; i<5;i++)
		{
			a[i]=scanner.nextInt();
		}
		for(int i=0; i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
