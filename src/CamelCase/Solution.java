package CamelCase;

import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bufferedReader.readLine();
		
		int result = Result.camelcase(s);
		
		bufferedReader.close();
		System.out.println(result);
	}
}
