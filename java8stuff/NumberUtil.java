package java8stuff;

import java.util.List;
import java.util.stream.DoubleStream;
import java.lang.Math;
import java.util.stream.Collectors;

public class NumberUtil{
	public static List<Double> randomNumberList(int size){
		//see http://www.leveluplunch.com/java/examples/java-util-stream-doublestream-example/
		
		return = DoubleStream.iterate(?? need seed?? and unaryoperator  Math.random())
									.limit(size).collect(Collectors.toList());
	}
}