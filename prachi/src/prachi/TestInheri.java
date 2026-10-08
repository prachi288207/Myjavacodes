package prachi;

class user
{
	int a=10; //global
	public void name() {
		
		System.out.println("i have a username");
	}

}
class child extends parent
{
	int b=15;
	public void AccountNumber() {
		
		System.out.println("i have an account number");
	}



	
	public void name() {
		System.out.println("i have a username with account number");
	}
}


public class TestInheri {
	
	public static void main(String[] args)  {
		
		parent account = new child();
		
		 //instannce
		
		System.out.println("a+b");
		
		
	}

}
