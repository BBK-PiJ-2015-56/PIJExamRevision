package sampleq4full;

public class Cons{
	protected int x;
	private String s;
	
	public Cons(){
		s = "random word";
		System.out.println("[1]" + this);
	}
	
	public Cons(String s){
		this();
		this.s = s;
		System.out.println("[2]" + this);
	}
	
	public String toString(){
		return "toString from Cons: s= " + this.s + " x= " + this.x;
	}
}

