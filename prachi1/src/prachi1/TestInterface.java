package prachi1;

interface one 
{
	int a=10;
	public abstract void call();
	public abstract void newcall();
	
}

interface two 
{
	int b=10;
	public abstract void call();
	
}

class three extends one ,two;

public class TestInterface {
	
	public static void main(String[] args) {
		
	}

}
