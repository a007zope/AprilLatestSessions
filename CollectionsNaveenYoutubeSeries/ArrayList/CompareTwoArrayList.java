package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
	
		
		Collections.sort(l1);// Sorts the specified list into ascending order, according to the natural ordering of its elements. 
	
		Collections.sort(l2);
		Collections.sort(l3);
		
		// comparing two arrayList in java using .equals() method
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		
		
		
		
		
				
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
