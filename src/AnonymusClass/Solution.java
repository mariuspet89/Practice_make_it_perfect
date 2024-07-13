package AnonymusClass;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
	public static void main(String[] args) throws IOException {
		List<Integer> testNumbers = Arrays.asList(1, 2, 3, 4);




		List<Integer> numbers = Arrays.asList(2, 3, 2, 4, 5, 3, 6);

		List<Integer> equalNumbers = extractEqualNumbers(numbers);

		System.out.println("Equal numbers: " + equalNumbers);

		int x = 10;

		if (x > 5) {
			int y = 20; // Variable 'y' is scoped to this 'if' block.
			System.out.println("Inside 'if': x is " + x + ", y is " + y);
		} else {
			int y = 30; // This 'y' is a separate variable scoped to the 'else' block.
			System.out.println("Inside 'else': x is " + x + ", y is " + y);
		}

	}

	public static  List<Integer> extractEqualNumbers(List<Integer> list) {
		return list.stream()
				.filter(number -> list.indexOf(number) != list.lastIndexOf(number))
				.distinct()
				.collect(Collectors.toList());
	}

}
