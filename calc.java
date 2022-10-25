import java.util.*;

public class calc {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter two numbers : ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
	
		System.out.println("select the operator :");
		System.out.println("Press: \n1 for sum\n2 for Subtract \n3 for Multiply \n4 for Divide");

		int calculator = sc.nextInt();
		double calc = 0;
		
		switch(calculator){
			case 1:
				calc = num1/num2;
				System.out.println(calc);
				break;
			case 2:
				calc = num1*num2;
				System.out.println(calc);
				break;
			case 3:
				calc = num1+num2;	
				System.out.println(calc);
				break;
			case 4:
				calc = num1-num2;
				System.out.println(calc);	
				break;
			default:
				System.out.println("Wrong Command");


		}

	}
}
