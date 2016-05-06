package samplesq4;

public class Constructor{

	private String s;
	protected int n;
	
	public Constructor(){
		System.out.println("Now making the constructor");
		this.s = "string for cons";
		System.out.println("[1] " + this);
	}
	
	public String toString(){
		System.out.println("I am the toString for Cons!!!!");
		return "s = " + this.s + " n = " + this.n;
	}
}