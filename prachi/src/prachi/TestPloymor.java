// over load over ride;
package prachi;

import java.util.Scanner;

class TestOverload
{
	public void add(int a) {
		int b=10;
		System.out.println(a+b);
		//system.exit(1);      (exit from console)
	}
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	}

public class TestPloymor {
	
	public static void main(String [] args) {
		
		System.out.println("called fisrt");
		
		TestOverload overload=new TestOverload();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter value");
		overload.add(scanner.nextInt());
		
		System.out.println("enter two value");
		overload.add(scanner.nextInt(), scanner.nextInt());
	}
	

}
