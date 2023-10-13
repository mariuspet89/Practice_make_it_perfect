package max_comparator_example.TimeConversion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class MaxExample {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Apple");
		strings.add("Banana");
		strings.add("Cherry");
		strings.add("Dragonfruit");

		// Define a custom comparator for strings based on their lengths
		Comparator<String> lengthComparator = (str1, str2) -> Integer.compare(str1.length(), str2.length());

		// Find the longest string using the max method with the custom comparator
		String longestString = max(strings, lengthComparator);

		System.out.println("The longest string is: " + longestString); // Output: The longest string is: Dragonfruit
	}

	public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp) {
		if (comp == null)
			return Collections.max(coll, (Comparator<T>) Comparator.naturalOrder());

		java.util.Iterator<? extends T> i = coll.iterator();
		T candidate = i.next();

		while (i.hasNext()) {
			T next = i.next();
			if (comp.compare(next, candidate) > 0)
				candidate = next;
		}
		return candidate;
	}
}
