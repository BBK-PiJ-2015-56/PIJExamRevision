package thistest;

public class ThisTest{
	int x;
	String s;
	
	public ThisTest(int x , String s){
		x = this.x; // doing it this way does nothing - its a tautology
		s = this.s;
		
		System.out.println(this);
	}
		
	public String toString(){
		return "x= " + this.x + " s= " + this.s;
	}
}