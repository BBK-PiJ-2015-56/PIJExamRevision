package exceptions;

public class NPEExperiment{
	public static void main(String args[]){
		/*
		int n;
		System.out.println(n);
		WE CANNOT DO THIS - IT HAS NOT BEEN INITIALISED SO THE METHOD CALL WILL NOT COMPILE
		 when a variable is not initialised and we print it, it doesn't compile 
		- it says     error: variable might not have been initialised
		Q) has a runtime exception been thrown here? which one? could we throw it and catch it?
		*/
		/*
		int p = null;
		System.out.println(p);
		This says     error: incompatible types null cannot ne converted to int.
		Q) Is this a runtime exception? which one? could we throw it and catch it?
		*/
		/*
		Integer q = null;
		System.out.println(q);
		This works and prints   null
		*/
		//NOW TRY BY CALLING A METHOD, AND THROWING AN NPE OURSELVES IF NULL
		
		/*
		int a;
		testMethodA(a);
		WE CANNOT DO THIS - IT HAS NOT BEEN INITIALISED SO THE METHOD CALL WILL NOT COMPILE
		*/
		/*
		Integer b = null;
		testMethodB(b);
		THIS DOESN'T COMPILE AND GIVES THE FOLLOWING MESSAGE:
			error: non-static method testMethodB(Integer) cannot be referenced from a static context
			Q) ??????????????????What does this mean here????????????????WHY DO WE GET THIS???????
			Ans) you cant call a non-static (ie instance) method or reference a non-static(ie instance) variable from a static context,
			because how would the static method know which instance it is reerring to? 
			ie you could instantiate the class (here, NPEExperiment) and override the instance methoids and change the instance variables.
			If you did this for several classes (or even just one) the main method would have no way of knowing which instance I am referring to.
			So need to either  a) mae the methoid/variable static   or b) instantiate the class and call teh methoid from within another non-static method
			ie a method that is part of the same instance and hence will refer to the method implementation 
			and variable values of it's own instance
		*/
		
		Integer c = null;
		testMethodC(c);
	}
	
	public void testMethodA(int a){
		System.out.println("Method A called and now printing the int..." + a);
	}
	
	public void testMethodB(Integer b){
		System.out.println("Method B called and now printing the int..." + b);
	}
	// make it static - see note above
	public static void testMethodC(Integer c){
		System.out.println("Method C called and now printing the int..." + c);
	}
}

/*
CONCLUSION:
1) primitive types cannot point to NULL. They cannot point to anything in the heap. 
They are just values in the stack.

2) A (non-primitive) variable pointing to NULL is not the same as it not being initialised. 
A variable can be initialised to NULL. In fact, if it is pointing to NULL, it must be initialised, 
because if it is not initialised then it doesn't yet point anywhere.

3) see note above about static and non-static contexts
*/