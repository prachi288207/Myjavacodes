package prachi1;

abstract class P
{

	abstract void call(); {
		
		System.out.println("hi");
	}
	public void a() {
		int x=10;
		System.out.println(x);
	}
}



public class TestAbs {

	
	public static void main(String[] args ) {

		P p=new P() {
			
			@Override
			void call() {
				// TODO Auto-generated method stub
				
			}
		}; 
		p.call();
		System.out.println(p);   
  }

}


