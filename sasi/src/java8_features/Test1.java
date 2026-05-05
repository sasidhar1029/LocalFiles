package java8_features;

interface TestIn1 {
	void method();
}

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TestIn1 t1 = () -> 
		System.out.println("method called");
		System.out.println("method called");
		t1.method();
	

}}
