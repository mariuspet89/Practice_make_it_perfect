package test1practice;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

		private static int[] searchForValue(int[][] list, int v) {
			for (int i = 0; i < list.length; i++) {
				for (int j = 0; j < list[i].length; j++) {
					if (list[i][j] == v) {
						return new int[] {i,j};
					}
				}
			}
			return null;
		}


	public static void main(String[] args) throws IOException {
		List<Integer> testNumbers = Arrays.asList(1, 2, 3, 4);

		long wolf = 5;
		long coyote = (wolf=3);
		System.out.println(wolf); // 3
		System.out.println(coyote); // 3

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };
		int searchValue = 2;


		int[] ints = searchForValue(list, searchValue);
		System.out.println("Nested loops result " + Arrays.toString(ints));
//		short mouse = 10;
//		short hamster = 3;
//		short capybara = mouse * hamster;

		byte hat = 1;
		byte gloves = 7 * 10;
		short scarf = 5;

		short mouse = 10;
		short hamster = 3;
		short capybara = (short)(mouse * hamster);
		short boots = 2 + 1;




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

		Car car1 = Car.getCar("Rosie");
		Car car2 = Car.getCar("Albastra");
		Car car3 = Car.getCar("Rosie");

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);

		System.out.println("Car1 and Car3 are the same instance: " + (car1 == car3));

	}

	public static  List<Integer> extractEqualNumbers(List<Integer> list) {
		return list.stream()
				.filter(number -> list.indexOf(number) != list.lastIndexOf(number))
				.distinct()
				.collect(Collectors.toList());
	}

}
