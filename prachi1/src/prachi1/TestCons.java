package prachi1;

class TestConsN {
	public TestConsN() {   // public and no return type
		System.out.println("hi from constructor");
	}
	
	public TestConsN(int a) {    //public and no return type

		System.out.println("hi from constructor overload");
	}
	
	public void call() {
		System.out.println("hi from call");
	}
}

class CallPrevious extends TestConsN 
{
	//overridde
	public void call() { 
		System.out.println("hi from call 2");
	}
}


public class TestCons {
	
	public static void main(String[] args) {
		
		CallPrevious previous = new CallPrevious();
		previous.call();
		new TestConsN();
	    new	TestConsN(0);
	}
}
