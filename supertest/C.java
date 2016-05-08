package supertest;

public class C extends B{
	private String s;
	int p,q;
	
	public C(){
		s = "I'm a C!";
		p = 8;
		q = 9;
		System.out.println("calling toString from within C cons..." 
			+ this + "..toString finished.  " );
			System.out.println();
	}
	
	public String toString(){
		return " toString from C...s= " + this.s + "   " + super.toString();
	}
	public int sum(){
		System.out.println("doing sums.....");
		System.out.println("printing super sum....." + super.sum());
		System.out.println("returning sum");
		return p + q;
	}
}