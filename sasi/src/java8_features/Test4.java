package java8_features;

import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {
		Predicate<Integer> isEven = (a) -> a % 2 == 0;
		Predicate<Integer> isGreaterThan = (a) -> a > 10;
		Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreaterThan);
		Predicate<Integer> isEvenOrGreaterThan10 = isEven.or(isGreaterThan);
		Predicate<Integer> isNotEven = isEven.negate();

		System.out.println(isEven.test(10));//10%2 ==0 -->true
		System.out.println(isGreaterThan.test(11));//10>11 -->true
		System.out.println(isEvenAndGreaterThan10.test(12));//(12%2==0 and 12>10) -->true
		System.out.println(isEvenOrGreaterThan10.test(11));//(11%2==!0 and 11>10) -->true
		System.out.println(isNotEven.test(11));//11%2==!0 it becomes-->0 -->true
	}

}
