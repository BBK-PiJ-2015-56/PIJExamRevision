package java8stuff;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

//q5
/*
5. (*) Create a static method called allMatches. It should take a List of Strings
and a Predicate<String>, and return a new List of all the values that passed the
test. Test it with several examples. For example:
List<String> shortWords = StringUtils.allMatches(words,
s -> s.length() < 4);
List<String> wordsWithB = StringUtils.allMatches(words,
s -> s.contains('b'));
List<String> evenLengthWords = StringUtils.allMatches(words,
s -> (s.length() % 2) == 0);
*/
public class GenericMatchQ6{
	public static void main(String args[]){
		List<String> words = Arrays.asList("Junior", "Nigel", "Brian", "Ben");
		
		//test the method with no stream
		List<String> wordsBelowFour = Utilities.allMatchesNoStream(words, p -> p.length() < 4);
		System.out.println("no stream: words below 4 are: " + wordsBelowFour);
		
		//test the method with a stream
		List<String> wordsBelowFourAgain = Utilities.allMatchesWithStream(words, p -> p.length() < 4);
		System.out.println("using stream: words below 4 are: " + wordsBelowFourAgain);
	}
}