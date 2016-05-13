package extraQ3map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapTest{
	public static void main(String[] args){
		MapTest m = new MapTest();
		m.run();
	}
	public void run(){
		Map<String, Integer> studentAges = new HashMap<>();
		studentAges.put("Peter", 18);
		studentAges.put("Paul", 19);
		studentAges.put("Marian", 19);
		studentAges.put("Jen", 18);
		studentAges.put("Joe", 17);
		studentAges.put("Carl", 19);
		studentAges.put("Mary",	19);
		int rarest = rarestAge(studentAges);
		System.out.println("rarest age is " +rarest);
	}
	
	public int rarestAge(Map<String, Integer> studentAges) throws IllegalArgumentException{
		if(studentAges == null)
			throw new IllegalArgumentException();
		else{
			System.out.println("Calculating rarest age...");
			Map<Integer,Integer> ageFrequencies = new HashMap<>();
			studentAges.forEach((s,a) -> {
				if (ageFrequencies.containsKey(s)){
					final int currentFreq = ageFrequencies.get(s);
					ageFrequencies.remove(s);
					ageFrequencies.put(a, currentFreq + 1);
				}else{
					ageFrequencies.put(a, 1);
				}
			});
	
			//now find rarest
			//set lowestFreq to the max possible size
			int lowestFreq = studentAges.size();
			int rarestAge = -1;
			for (Map.Entry<Integer, Integer> entry : ageFrequencies.entrySet()){
				if(entry.getValue() < lowestFreq){
					lowestFreq = entry.getValue();
					rarestAge = entry.getKey();
				}
			}
			return rarestAge;
		}
		
	}
}