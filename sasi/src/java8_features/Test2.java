package java8_features;

interface in1 {
	void method(int a);
}

public class Test2 {

	public static void main(String[] args) {
//		in1 i = a -> 
//			System.out.println(a * a * a);

//		in1 i = (int a) -> {
//			System.out.println(a * a * a);
//		};
		in1 i = (a) -> {
			System.out.println(a * a);
		};
		i.method(100);
		i.method(20);

	}

}
