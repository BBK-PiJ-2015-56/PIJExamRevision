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
		//List<Character> chars = new ArrayList<Character>(source.toCharArray());
		List<Character> fromList = from.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		List<Character> toList = to.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		Map<Character,Character> fromTo = new HashMap<>();
		// need to work out how to do thgis kinda thing without old for loops
		// also stuff like reverse() method
		for(int i = 0; i < fromList.size(); i++){
			fromTo.put(fromList.get(i), toList.get(i));
		}
		
		List<Character> newList = source.chars().mapToObj(e->(char)e)
												.map(c -> {
													if(from.contains(c)) return fromTo.get(c);
													else                 return c;
												})
												.collect(Collectors.toList());
		System.out.println(newList);
	}
}

	
	