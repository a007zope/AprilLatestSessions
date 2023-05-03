package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ArrayListMethods {

	public static void main(String[] args) {

		/*
		 * retainAll
		 */

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Aditya","Naveen","Tom","Jon","Jon"));

		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Aditya","Naveen","Tom","Jolly","lane"));

		System.out.println(list1);

		list1.retainAll(Collections.singleton("Jon"));
		//-- in this case it will retain Aditya
		//list1.retainAll(list2);
		//in this case it will retain the common elements between list1 and list2 using retainAll method

		System.out.println(list1);

		/*
		Cloning the ArrayList
		 */
		//ArrayList<String> cloneList=(ArrayList<String>)list2.clone();

		ArrayList<String>cloneList=(ArrayList<String>)list2.clone();
		System.out.println(cloneList);

		/*
		removeIf
		 */
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

		numbers.removeIf(adit -> adit%2 !=0);

		System.out.println(numbers);

		/*
		lastIndexOf
		 */

		ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Aditya","Sanjay","Naveen","Tom"));

		int i =list3.lastIndexOf("Tom");
		System.out.println(i);


		/*
		 * subList
		 */
		ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,2,1,3,2,2,2,2));

		ArrayList<Integer>subList = new ArrayList<>(numbers1.subList(1, 4));

		System.out.println(subList);

		System.out.println(numbers1.subList(2, 6));


		/*
		 * toArray
		 */

		ArrayList<String> newList = new ArrayList<>(Arrays.asList("Aditya","Sanjay","nandan","gopal","Naveen"));

		Object s[] =	newList.toArray();

		System.out.println(Arrays.toString(s));
		for(Object a:s)
		{
			System.out.println((String)a);
		}






	}

}
