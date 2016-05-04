package java8stuff;

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
}