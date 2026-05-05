package java8_features;

import java.util.function.Function;

public class Test5 {

	public static void main(String[] args) {
		Function <Integer,Integer>  f1 = (a) ->a*a;
		System.out.println(f1.apply(10));
		Function<String,Integer> f2 = s -> s.length();
		System.out.println(f2.apply("sasidharreddy"));
		Function<String,String> f3 = s -> s.toUpperCase();
		System.out.println(f3.apply("sasi"));
		Function<String,Boolean> f4 = s ->s.contains("s");
		System.out.println(f4.apply("sasidhar"));
		Function<Integer,Boolean> f5 = i ->i%2==0;
		System.out.println(f5.apply(5));
		
	}

}
