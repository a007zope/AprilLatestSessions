package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElementsArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("Java","Ruby","Python","c#","Js"));
		ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("Java","Python","Ruby","c#","Php"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1); // [Java, Ruby, Python, c#]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
