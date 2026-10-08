package prachi;

import java.util.Scanner;

class LogicofSOD {

	public int sumOfDigits(int num)
	{
		int sum=0;
		//i=0; i<10;i++
		while(num>0) //  0
		{
			
			int rem=num%10;
			sum=sum+rem;
			//System.out.println("sum0="+sum);
			num=num/10;
		}
		return sum;
}

public class sumOfDigits {
	
	public static void main(String[] args) {
		
		LogicofSOD sod=new LogicofSOD();
		Scanner scanner= new Scanner (System.in);
		System.out.println("enter your value");
		System.out.println(sod.sumOfDigits(scanner.nextInt()));
		
		
	}}
}

