package java8stuff;

@FunctionalInterface
public interface TwoStringPredicate{
	boolean firstStringBetter(String str1, String str2);
}