package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingElementArrayList {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		
		l2.removeAll(l1);
		
		System.out.println(l2);//E
	}

}
