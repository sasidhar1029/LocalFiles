import java.util.Scanner;

public class PerfectOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum =0;
		for(int i = 0;i<=num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
	  if(sum==num) {
		  System.out.println("the given number is perfect number:"+num);
	  }else {
		  System.out.println("the given number is not perfect number");
	  }

	}

}