package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class RemoveDuplicateElementsArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5,6,7,8,9,8,9,9,9,6,5));

		// 1 using LinkedHashSet ( cannot have duplicate elements)

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
		//System.out.println(linkedHashSet);

		ArrayList<Integer> numberWithoutDuplicateEntry = new ArrayList<>(linkedHashSet);

		System.out.println(numberWithoutDuplicateEntry);
		
		
		// 2 using JDK 8 Stream 
		
		ArrayList<Integer> marksList = new ArrayList<>(Arrays.asList(1,2,3,4,4,5,5,6,6,2,1,2));
		
		List<Integer> marksListUnique =marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		










	}

}
