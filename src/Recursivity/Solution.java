package Recursivity;

public class Solution {
	public static void main(String[] args) {
		System.out.println(factorialUsingRecursion(4));
		System.out.println(factorialUsingIteration(4));
	}

	static int factorialUsingRecursion(int n) {
		int tempVariable = 0;
		if (n == 0)
			return 1;
		tempVariable = n * factorialUsingRecursion(n - 1);
		return tempVariable;
	}

	static int factorialUsingIteration(int n) {
		int result = 1, i;

		for (i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
