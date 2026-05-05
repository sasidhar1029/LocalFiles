package java8_features;

interface in2{
	int multiplication(int n);

	default void method2() {
		System.out.println("method 2 called");
	}

	default void method3() {
		System.out.println("method 3 called");
	}

	static void method4() {
		System.out.println("method 4 called");
	}

}

public class Test3 {

	public static void main(String[] args) {
		in2 i = n -> n * n;
		System.out.println(i.multiplication(10));
		i.method2();
		i.method3();
		in2.method4();

	}

}
