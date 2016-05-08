package supertest;

public class A{
	private String s;
	int p,q;
	
	public A(){
		s = "I'm an A!";
		p = 1;
		q = 2;
		System.out.println("calling toString from within A cons..." 
			+ this + "..toString finished.  ");
			System.out.println();
	}
	
	public String toString(){
		return " toString from A...s= " + this.s;
	}
	public int sum(){
		return p + q;
	}
}