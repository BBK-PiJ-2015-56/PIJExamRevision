package supertest;

public class B extends A{
	private String s;
	int p,q;
	
	public B(){
		s = "I'm a B!";
		p = 3;
		q = 4;
		System.out.println("calling toString from within B cons..." 
			+ this + "..toString finished.  ");
			System.out.println();
	}
	
	public int summing(){
		return sum();
	}
	//RULING THESE METHODS OUT TO CHECK THAT VTHE SUPER IT INHERITS INSTEAD 
	//WILL NOT ACCESS THE FIELDS HERE
	//public String toString(){
		//return " toString from B...s= " + this.s + super.toString();
	//}
	//public int sum(){
	//	return p + q;
	//}
}