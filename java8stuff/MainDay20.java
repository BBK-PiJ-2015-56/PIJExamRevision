package java8stuff;

import java.util.List;


/*
10. Write a static method that produces a List of a specified length of random numbers. E.g.:
List<Double> nums = StreamUtils.randomNumberList(someSize);
Result is something like [0.7096867136897776, 0.09894202723079482, ...]
*/

public class MainDay20{
	public static void main(String[] args){
		List<Double> numbers = NumberUtil.randomNumberList(8);
		System.out.println("size of list should be 8: " + numbers.size());
		System.out.print("list: ");
		numbers.forEach(n -> System.out.print(n));
	}

}