package java8stuff;

@FunctionalInterface
public interface TwoElementPredicate<T>{
	boolean firstEntryBetter(T firstEntry, T secondEntry);
}