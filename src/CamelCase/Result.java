package CamelCase;

public class Result {
	public static int camelcase(String s) {
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}