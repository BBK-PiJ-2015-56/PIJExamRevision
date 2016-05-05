package java8stuff;

import java.util.Arrays;
import java.util.List;
 

//q8
/*
7. (*) Create a static method called transformedList. It should take a List of
Strings and a Function<String,String> and return a new List that contains the
results of applying the function to each element of the original list. For example:
List<String> excitingWords =
StringUtils.transformedList(words, s -> s + "!");
List<String> eyeWords =
StringUtils.transformedList(words, s -> s.replace("i", "eye"));
List<String> upperCaseWords =
StringUtils.transformedList(words, String::toUpperCase);
8. (**) Rewrite transformedList so it works with generic types. Verify that your
examples from the previous question still work.
*/

public class TransformedListQ8{
	public static void main(String args[]){
		List<String> words = Arrays.asList("Junior", "Nigel", "Brian", "Ben");
		List<Integer> numbers = Arrays.asList( 2, 4, 6, 8, 10);
		
		
		List<String> wordsTrans = Utilities.transformedListNoStream(words, s -> s + "!");
		System.out.println("Here is the transformed string list, no stream " + wordsTrans);
		
		List<Integer> numbersDoubled = Utilities.transformedListNoStream(numbers, n -> 2 * n);
		System.out.println("Here is the transformed number list, no stream " + numbersDoubled);
		/*
		wordsTrans = Utilities.transformedListWithStream(words, s -> s + "!");
		System.out.println("Here is the transformed string list, with stream " + wordsTrans);
		numbersDoubled2 = Utilities.transformedListWithStream(numbers, n -> 2 * n);
		System.out.println("Here is the transformed number list, with stream " + numbersDoubled);
		*/
	}
}