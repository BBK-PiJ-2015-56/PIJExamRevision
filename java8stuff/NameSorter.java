package java8stuff;

//note: I could add implemebtation easily so it looks at
//alphabetical order if both or neither have 'e'
public class NameSorter{
	public static int eSort(String str1, String str2){
		if(str1.contains("e"))
			return -1;
		else if(str2.contains("e"))
			return 1;
		else 
			return 0;
	}
}