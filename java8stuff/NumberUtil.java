package java8stuff;

import java.util.List;
import java.util.stream.DoubleStream;
import java.lang.Math;
import java.util.stream.Collectors;

public class NumberUtil{
	public static List<Double> randomNumberList(int size){
		
		return DoubleStream.iterate(0, n -> Math.random())
							.boxed()
							.filter(n -> n != 0.0)
							.limit(size).collect(Collectors.toList());
		//note this is a bodge job where I filter out the seed- it would be better to find the method for 
		//creating a stream of doubles without a seed. Obv I could create a list of 0s first 
		//of the right size and then map to random,  but I want to know how to do it this way around.
	}
}