package Project;

import java.util.Scanner;

public class LimitNum {
	
	public static void main(String[] arg) {

Scanner sc = new Scanner (System.in);
int num1;
int num2;
while(true) {
	System.out.println("Enter first Number ");
	num1 =sc.nextInt();
	
	System.out.println("Enter Second Number ");
	num2 =sc.nextInt();
	
	if (num1>= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100) {
		System.out.println("The enterd number is "+ num1 + " / "+ num2 + " Thank you. ");	
		break;
	}
	else {
		System.out.println(" The number is out of range 1-100 Please try again ");	
	
	}
}

}
}


