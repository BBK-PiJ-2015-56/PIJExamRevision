package java8stuff;

//q3
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
	*/
	public class CompareQ3{
	
	public static void main(String[] args){
		String str1 = "Peter";
		String str2 = "Paul";
		betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
	}
	
	public static String betterString(String str1, String str2, TwoStringPredicate pred){
		if(pred(str1, str2)) 
			return str1;
		else 
			return str2;
	}
}