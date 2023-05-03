import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {

		String names[] = {"java","C","javascript","ruby","java","c++"};
		//System.out.println(names.length);

		/** First solution
		 *  using for loop
		 */

		for(int i=0;i<names.length;i++) {
			for(int j =i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate element is : "+names[i]);
				}
			}
		}

		/**
		 * solution 2 using Set interface which always store unique elements
		 */

		Set<String> store = new HashSet<>();

		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("duplicate element is: "+name);
			}

		}

		/**
		 * Solution 3 using HashMap
		 */
		Map<String,Integer> storeMap = new HashMap<>();
		for(String name : names) {
			Integer count =   storeMap.get(name);
			if(count ==null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name,++ count);
			}
		}

		// Get the values from HashMap

		Set<Map.Entry<String,Integer>> entrySet = storeMap.entrySet();
		for(Map.Entry<String,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate element is:"+entry.getKey());

			
			}
		}


	}

}
