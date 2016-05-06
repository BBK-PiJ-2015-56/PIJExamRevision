package samplesq4;

public class SubConstructor extends Constructor{
	private String s;
	
	public SubConstructor(){
		System.out.println("Now making the subconstructor out of the constructor");
		this.s = "string for sub";
		System.out.println(this);
	}
	/*
	public String toString(){
		System.out.println("I am the toString for sub!!!!");
		return "s = " + this.s + " n = " + this.n;
	}
	*/
}