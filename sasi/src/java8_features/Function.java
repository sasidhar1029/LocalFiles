//package java8_features;
//
//class Student {
//
//	String name;
//	int marks;
//
//	Student(String name, int marks) {
//		this.name = name;
//		this.marks = marks;
//	}
//}
//
//public class Function {
//	Function<Student, String> f1 = (Student) -> {
//		String grade = "";
//		int marks = Student.marks;
//		if (marks >= 80)
//			grade = "A";
//		else if (marks >= 60)
//			grade = "B";
//		else if (marks >= 50)
//			grade = "c";
//		else if (marks >= 35)
//			grade = "D";
//		else
//			grade = "fail";
//	};
//	Student [] students = {
//				new Student("sasi",96),
//				new Student("subbu",66),
//				new Student("surya",76),
//				new Student("raju",86),
//	};for(
//	Student student:students)
//	{
//
//	}
//}