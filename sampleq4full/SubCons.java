package sampleq4full;

public class SubCons extends Cons{
	protected String s;
	
	public SubCons(int x){
		super("label");
		x = this.x; // THIS WAY AROUND DOES NOTHING!
		System.out.println("[4] x= " + x);
	}
	public SubCons(String s){
		this(12);
		this.s = s;
		x = 19;
		System.out.println("[5] x= " + x);
		System.out.println("calling toString....");
		System.out.println(this.toString());
		System.out.println("calling toString from super...");
		System.out.println(super.toString());
		
	}
}