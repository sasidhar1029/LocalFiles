package Synatax_and_variables;

public class five_subject {

	public static void main(String[] args) {
		int maths = 10;
		int social = 20;
		int english = 50;
		int hindi = 60;
		int physics = 79;
		int total = maths + social + english + hindi + physics;
		double percentage = (maths + social + english + hindi + physics) / 5;
		char grade;
		if (percentage >= 90) {
			grade = 'A';
		} else if (percentage >= 75) {
			grade = 'B';
		} else if (percentage >= 60) {
			grade = 'C';
		} else if (percentage >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Total:" + total);
		System.out.println("Percentage:" + percentage);
		System.out.println("grade:" + grade);

	}

}
