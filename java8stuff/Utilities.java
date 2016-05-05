package java8stuff;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
 

public class Utilities{
	public static String betterString(String str1, String str2, TwoStringPredicate pred){
		if(pred.firstStringBetter(str1, str2)) 
			return str1;
		else 
			return str2;
	}

	public static <T> T betterEntry(T firstEntry, T secondEntry, TwoElementPredicate<T> pred){
		if(pred.firstEntryBetter(firstEntry, secondEntry)) 
			return firstEntry;
		else 
			return secondEntry;
	}
	
	public static <T> List<T> allMatchesNoStream(List<T> list, Predicate<T> pred){
		List<T> newList = new ArrayList<>();
		list.forEach(s -> {
			if(pred.test(s))
				newList.add(s);
		});
		return newList;
	}
	
	public static <T> List<T> allMatchesWithStream(List<T> list, Predicate<T> pred){
		return list.stream().filter(pred).collect(Collectors.toList());
	}
	
	public static <T> List<T> transformedListNoStream(List<T> list, Predicate<T> pred){
		return list;
	}
	
	public static <T> List<T> transformedListWithStream(List<T> list, Predicate<T> pred){
		return list;
	}
}