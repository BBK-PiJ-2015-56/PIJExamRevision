package paper2015q8;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public class Encoding{
	public static void main(String[] args){
		//System.out.println(encode("Amy loved her dog", "dl", "gd"));
		encode("Amy loved here dog", "dl", "gd");
	}
	
	public static void encode(String source, String from, String to){
		List<Character> fromList = from.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		List<Character> toList = to.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		// HOW COME IT IS A CHAR AND NOT AN OBJ????it is supposed to be an object valued stream
		//ANS)  by object-based stream, they mean an implementation of Stream<> as opposed to 
		// an IntStream - so mapToObj converts an IntStream into a Stream<> eg here into a Stream<Char>
		
		Map<Character,Character> fromTo = new HashMap<>();
		// need to work out how to do thgis kinda thing without old for loops
		// also stuff like reverse() method
		for(int i = 0; i < fromList.size(); i++){
			fromTo.put(fromList.get(i), toList.get(i));
		}
		//convert source string into list of characters
		List<Character> sourceList = source.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		
		//make the new string
		//MUST LEARN HOW TO DO WITHOUT OLD FOR LOOP		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< sourceList.size(); i++){
			char next = sourceList.get(i);
			if(fromList.contains(next))
				sb.append(fromTo.get(next));
			else
				sb.append(next);	
		}	
		String result = sb.toString();
		System.out.println(result);
	}

}

	
	