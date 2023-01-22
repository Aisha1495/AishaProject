package Project;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class practice1 implements Serializable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter patient name: ");
		String pacName =sc.next();
		
		System.out.println("Enter patient Id: ");
		int pacId = sc.nextInt();
		
		try {
			FileOutputStream fOut = new FileOutputStream("Output.txt");
			ObjectOutputStream out = new ObjectOutputStream(fOut);
			
			out.writeObject(pacName);
			out.writeObject(pacId);
			out.flush();
			out.close();
			System.out.println("sirialize is been successful");
		}
			
			catch (Exception e) {
				System.out.println(e);
			}
			try {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("Output.txt"));
				in.readObject();
				in.close();
				System.out.println("Enter patient name: "+pacName);
				System.out.println("Enter patient Id: "+ pacId);
				System.out.println("Desirialize is been successful");
			}
			
catch (Exception e) {
	System.out.println(e);
}
		}
		
		
	}
		
		
		
		
