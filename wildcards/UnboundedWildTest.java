package wildcards;

import java.util.Arrays;
import java.util.List;

/*
I am testing to see if the toStirng is used from Object or from Integer, when calling it through
a parameterised type List<?> applied to List<Integer>.
I expect it to use the toString in Object, because List<?> is precisely for when the methods used do not depend 
on teh type parameter. You could not do this with the toString from Integer, because the type is erased at compile time.
So actually List<?> still follows the restrictions due to type erasure, its just that
none of the methods inside it depend on knowing the type, other than that it is an object.

RESULT: It actually uses the toString() in Integer, so type erasure is not an issue here. This seems to 
contradict the java tutorial where it says such wild cards unbounded are for times when the methods 
don't depend on knowing the type. But it doesn't because teh key pont of teh unbounded wildcard is 
that all the methods it uses only depend on functionality that can be implemented in Object class, if need be. 
In this case, there is a toStirng() in INteger, but is there were not, the code can still be implemented. 

What you must not do is use List<?>   or    Class<?> etc, 
and then use methods that are not implementable if they are just objects. 
That way we ensure whatever is used will wortk.
*/

public class UnboundedWildTest{
public class UnboundedWildTest{
	public static void main(String[] args){
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);

	}
	public static void printList(List<?> list) {
    for (Object elem: list)
		// even though it says for(Object elem: list), this is not a separate method invocation, 
		// so it doesn't cast it up to an Object
        System.out.print(elem + " ");
    System.out.println();
	}
}

