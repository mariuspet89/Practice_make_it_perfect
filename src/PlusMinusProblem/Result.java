package PlusMinusProblem;

import java.util.List;

public class Result {
	public static void plusMinus(List<Integer> arr) {
		
		float p = 0;
		float n = 0;
		float z = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 0) {
				z++;
			} else {
				if (arr.get(i) > 0) {
					p++;
				} else {
					n++;
				}
			}
		}
		p = p / arr.size();
		n = n / arr.size();
		z = z / arr.size();
		System.out.println(
				String.format("%.6f", p)
		);
		System.out.println(
				String.format("%.6f", n)
		);
		System.out.println(
				String.format("%.6f", z)
		);
	}
}
