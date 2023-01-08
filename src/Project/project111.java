package Project;

public class project111 {
	public static void main(String[] arg) {

	int [] numbers = new int [] { 1,2,22,2};
	int MaxNum=numbers[0];
	for(int i =1; i < numbers.length; i++) {
		if(numbers[i]>MaxNum) {
	
	MaxNum=numbers[i];
	
}
	}
	System.out.println("The given Number is : ");
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
	System.out.println("The Largest Number is : "+MaxNum);
	}
}