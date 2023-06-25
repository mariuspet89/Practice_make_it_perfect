package TimeConversion;


import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		String s = bufferedReader.readLine();
		
		String result = Result.timeConversion(s);
		
		bufferedReader.close();
		System.out.println(result);
	}

}
