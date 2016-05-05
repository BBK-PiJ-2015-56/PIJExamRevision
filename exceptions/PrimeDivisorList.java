package exceptions;


//q5

public interface PrimeDivisorList{
	
	// note these are unchecked exceptions so we dont have to throw them, 
	// but this way we can catch it
	// Q) is that the point?  because otherwise, what is the point in throwing
	// when the JVM will throw it anyway at runtme if need be? 
	// I suppose the only other point would be to inform clients of the API..????????????
	//
	//Q2) isnt an NPE already thrown anyway when a reference to a null value is passed as an int?
	// answer - NO!! see class NPEEXperiment -it prints null as it is instantiated and points to null
	void add(Integer n) throws NullPointerException, IllegalArgumentException;
	
	Integer remove(Integer n);
	
	@Override
	String to String();
	
}