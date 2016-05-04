package java8stuff;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Comparator;

public class SortingQ1and2{
	public static void main(String[] args){
		SortingQ1and2 s = new SortingQ1and2();
		s.q1();
		s.q2();
	}
	/*
	1. Create an array containing some Strings. Sort the array by
	 • length  (i.e., shortest to longest)
	 • reverse length (i.e., longest to shortest) 
	 • first character 
	• Strings that contain 'e' first, everything else second. 
	 Remember that the compare method of Comparator should return 
	 a negative number if the first entry is less than the second, 
	 a positive number if the first entry is greater than the second, 
	 and 0 if they are the same. 
	*/ 

	public void q1(){
		List<String> names = Arrays.asList("Peter", "Mark",
		 "Yvonne", "Sabrina");
		System.out.println(names);
		//sorted by length ascending - uses natural sorting 
		List<String> sortedByLength = names.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("sorted using names.stream() " + sortedByLength);

		//sorted by length ascending - uses natural sorting 
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//ERROR - INCOMPAT BOUNDS WHEN I DO IT THIS WAY - NEED TO LEARN!!!!!!!!!!!!!!
		/*List<String> sortedByLength2 = Stream.of(names)
				.sorted()
				.collect(Collectors.toList());
		System.out.println("sorted using Stream.of(names) " + sortedByLength2);
		*/

		//sorted descending - explicitly states how to do it
		List<String> sortedByLengthReversed = names.stream()
				.sorted( (n1,n2) -> n2.length()-n1.length() )
				.collect(Collectors.toList());
		System.out.println(sortedByLengthReversed);

		//sorted by alphabetical for first character
		List<String> sortedByFirstLetter = names.stream()
				.sorted((p1,p2) -> p1.compareTo(p2))
				.collect(Collectors.toList());
		System.out.println("sorted by 1st letter " + sortedByFirstLetter);

		//sorted by 'e' first then everything else
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
//Q) why cant I do a method ref here, 
// seeing as all I am doing is passing p1,p2 through?
		List<String> sortedByE = names.stream()
				.sorted((p1,p2) -> p1.compareTo(p2))
				.sorted((p1,p2) -> eSort(p1,p2))
				.collect(Collectors.toList());
		System.out.println("sorted by those that contain e first " + sortedByE);

	}

	// a helper method to put names with e first. 
	// I could easily make it do it in alphabetical too
	public static int eSort(String str1, String str2){
		if(str1.contains("e"))
			return -1;
		else if(str2.contains("e"))
			return 1;
		else 
			return 0;
	}
	//q2
	/*
	2. For the last sorting example (strings with 'e' first), 
	move the logic that computes the number to a separate static method. 
	For example, StringUtils.eChecker(s1, s2) will return • -1 if s1 is less 
	(i.e., it contains 'e' but s2 doesn’t), • 1 if s1 is greater, and • 0 otherwise. 
	Now, rewrite the final lambda sorting example, 
	but use a method reference in place of an explicit lambda. 
	*/

	public void q2(){
		System.out.println("q2");
		List<String> names = Arrays.asList("Peter", "Mark",
		 "Yvonne", "Sabrina");

		List<String> sortedByE = names.stream()
				.sorted(NameSorter::eSort)
				.collect(Collectors.toList());
		System.out.println("sorted by e, with method ref from NameSorter class "
			+ sortedByE);

		List<String> sortedByEAgain = names.stream()
				.sorted(SortingQ1and2::eSort)
				.collect(Collectors.toList());
		System.out.println("sorted by e, with method ref from this class "
			+ sortedByEAgain);

		//use Comparator.comparing to do it by e and alphabetical
		//First need to define two functions that comparing can use 
		//to create a comparator with
		//final Function<String,String> alpha = name -> ????
		//List<String> sortedByEAndAlpha = names.stream()
			//	.sorted(Comparing)

	}

}