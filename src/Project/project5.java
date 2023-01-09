package Project;

public class project5 {

	public static void main(String[] args) {

		int[] array = new int[] { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4 };

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					System.out.println("repeted numbers are :" + array[j]);
					// System.out.println( array[i] +" is repeated "+array[j]+" times ");

				}

			}

		}

	}

}
