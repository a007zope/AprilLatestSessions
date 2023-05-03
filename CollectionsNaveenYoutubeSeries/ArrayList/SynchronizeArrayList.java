package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeArrayList {
	
	public static void main(String[] args) {
		
		/*
		 * synchronization in ArrayList can be achieved using below two methods 
		 * 
		 * 1) using Collections.synchronizedList() method will return synchronized ArrayList
		 * 2) using CopyOnWriteArrayList - class -which is a thread safe variant of ArrayList
		 * 
		 */
		
		List<String> nameList =Collections.synchronizedList(new ArrayList<>());		
		
		nameList.add("Java");
		nameList.add("python");
		nameList.add("ruby");
		nameList.add("C#");
		
		/*for adding, removing we don't need explicit synchronization but to traverse or fetch the values from this list we have to use 
		 explicit synchronization
		 */
		
		synchronized(nameList)
		{
			Iterator<String> it =nameList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		
		/*
		 * using CopyOnWriteArrayList class  its a class which is thread safe as well as synchronized
		 * 
		 */
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Aditya");
		empList.add("Naveen");
		empList.add("Rohan");
		
		// here we dont need any explicit sunchronization for any operation : i e add/remove/traverse
		
		Iterator<String>it =  empList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
	}

}
