package Project;

import java.util.Scanner;

public class LimitNum {
	
	public static void main(String[] arg) {

Scanner sc = new Scanner (System.in);
int result;
do {
	System.out.println("Enter Number btween 1- 100 ");
	result =sc.nextInt();
	
	
}
while (result< 0 || result > 100);
System.out.println("Correct "+result);

	
	while (result> 0 || result < 100);
System.out.println("Wrong "+result);
	
}
}


