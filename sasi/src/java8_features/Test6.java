package java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sasi","arjun", "reddy", "name", "triven", "subbaro", "surya", "triven",
				"nagaraju");

		List<String> list = names.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
		for (String s : list) {
			System.out.print(s + " ");
		}
	}

}
