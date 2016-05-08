package sampleq4full;

public class SubSubCons extends SubCons{
	private String s;
	
	public SubSubCons(){
		super("item");
		s = super.s;
		x++;
		System.out.println("[6] [s= " + this.s + "]" + this);
	}
	
	public String toString(){
		return "toString from SubSubCons: ****** s= " 
		+ this.s +"   " + super.toString();
	}
}