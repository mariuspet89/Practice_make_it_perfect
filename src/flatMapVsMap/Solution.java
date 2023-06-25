package flatMapVsMap;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {


	public static void main(String[] args) throws IOException {
		List<String> words = Arrays.asList("Java Dev Journal", "Java", "Spring Boot", "Java 8");
		List<String> words2 = Arrays.asList("JavaDevJournal", "Java");
		//List<Integer> wordsLength = words.stream().map(String::length).collect(Collectors.toList());
		//Stream<R> Stream<String[]>
		 words2.stream().map(s -> s.split(""))

				.collect(Collectors.toList());

//		collect.forEach(System.out::println);
//		wordsLength.forEach(System.out::println);

		//it will take each element of tech stream and process it

	}

}


