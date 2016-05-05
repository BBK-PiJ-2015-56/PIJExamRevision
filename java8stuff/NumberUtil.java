package java8stuff;

import java.util.List;
import java.util.stream.DoubleStream;
import java.lang.Math;
import java.util.stream.Collectors;

public class NumberUtil{
	public static List<Double> randomNumberList(int size){
		//see http://www.leveluplunch.com/java/examples/java-util-stream-doublestream-example/
		
		List<Double> numbers = DoubleStream.iterate(Math.random())

		DoubleStream.Builder b = DoubleStream.builder();
		
		// !!!!!!!!!!!!!!!!!!! NEED TO LOOK INTO HOW TO DO WITHOUT LOOP!!!!!!!!!!!!!!!!
		while(b.size() < size){
			b.accept(Math.random());
		}
		DoubleStream d = b.build();
		return d.boxed().collect(Collectors.toList());
	}
}