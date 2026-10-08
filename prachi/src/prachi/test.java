
package prachi;

import java.util.Scanner;

class LogicofSOD
{
	public int sumOfDigits(int num)
	{
		int sum=0;
		int rem=num%10;
		sum=sum+rem;
		System.out.println("sum0="+sum);
		
		num=num/10;
		int rem1=num%10;
		sum=sum+rem1;
		System.out.println("sum1="+sum);
		
		num=num/10;
		int rem2=num%10;
		sum=sum+rem2;
		System.out.println("sum2="+sum);
	}
	
	system.out.println("final")
	return sum;
}

public class test {
	
	public static void main(String[] args)
	
	LogicofSOD sod=new LogicofSOD();
	Scanner scanner= new Scanner (System.in);
	System.out.println("enter your value");
	System.out.println(sod.sumOfDigits(scanner.nextInt()));

	
	
	

}
