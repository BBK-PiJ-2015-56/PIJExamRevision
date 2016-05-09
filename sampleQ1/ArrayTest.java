package sampleQ1;

import java.util.ArrayList;

public class ArrayTest{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add("P");
		list.add("Q");
		list.add("R");
		list.set(2, "s");
		list.add(2, "T");
		list.add("u");
		System.out.println(list);
		
		
		int[] test = new int[2];
		test[0] = test[1] = 5;
		System.out.println(test[0]);
		fiddle(test, test[1]);
		System.out.println(test[0]);
	}
	static void fiddle(int[] test, int elem){
		test[0] = 10;
	}
}