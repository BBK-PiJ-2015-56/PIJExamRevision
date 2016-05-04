package java8stuff;

//q3 and 4
	/*
	3. Create a class with a static method called betterString. 
	This method should take two Strings and a lambda as its arguments. 
	This lambda states whether the first of the two strings is better. 
	The method should return the better string; i.e., 
	if the lambda returns true the method should return the first string, 
	otherwise it should return the second string. 
	
	For the lambda,define an interface called TwoStringPredicate with a method that 
	takes two Strings and returns true if the first is better than the second, 
	false otherwise. 
	
	Here are two examples: 
	• returns whichever of test1 and test2 is longer, 
	StringUtils.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length()) 
	
	• always returns test1, StringUtils.betterString(test1, test2, (s1, s2) -> true)
	
	q4
	4. Use generics to replace betterString with betterEntry 
	and TwoStringPredicate with TwoElementPredicate. 
	Make sure your previous examples still work when you only change betterString to betterElement.
	*/ 

public class CompareQ3and4{
	
	public static void main(String[] args){
		//test betterString method
		String str1 = "Peter";
		String str2 = "Paul";
		String longestString = Utilities.betterString(str1, str2, 
			(s1, s2) -> s1.length() > s2.length());
		System.out.println("the longest string should be Peter: " + longestString);

		//test generic version
		System.out.println("testing generic version...");
		String longestStringGen = Utilities.betterEntry(str1, str2, 
			(s1, s2) -> s1.length() > s2.length());
		System.out.println("the longest string should be Peter: " + longestStringGen);

		int p = 5;
		int q = 7;
		int highestInt = Utilities.betterEntry(p, q,  (i, j) -> i > j );
		System.out.println("the highest int should be 7: " + highestInt);
	}
	
}