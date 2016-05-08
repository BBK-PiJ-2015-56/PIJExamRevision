package supertest;

public class Main{
	public static void main(String args[]){
		C letterC = new C();
		System.out.println("printing sum from main method");
		System.out.println(letterC.sum());
		/* 
		YOU CANNOT CALL B METHODS BECAUSE THERE IS NO B INSTANCE. 
		JUST BECAUSE C INHERITS FROM B, THAT DOESN'T MEAN WE CAN REFERENCE B 
		AS IF IT EXISTS. SO THE ONLY WAY TO REFERENCE METHODS IN SUPERCLASSES IS VIA THE 
		KEYWORD SUPER.
		System.out.println("calling the method summing from B. This calls sum(), which is inherited from A.");
		System.out.println(" If it can access fields in B, then answer should be 3 + 4 = 7:  " 
							+ B.sum() );
		
		HOWEVER, WE CAN DO TEH SDAME EXPERIMENT BY INSTANTIATING A B*/
		B b = new B();
		System.out.println("calling the method summing from B. This calls sum(), which is inherited from A.");
		System.out.println(" If it can access fields in B, then answer should be 3 + 4 = 7:  ");
		System.out.println(b.sum());
		
	}
}