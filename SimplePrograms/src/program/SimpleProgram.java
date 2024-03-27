package program;

public class SimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find Maximum Element: Find the maximum element in an array.
		int[] array = { 15, 12, 55, 14, 25, 42 };
		int maximumElement = array[0];
		

		for (int i = 1; i < array.length; i++) {
			if (maximumElement > array[i]) {
				maximumElement = array[i];
			}
		}
		System.out.println(maximumElement);
	}

}
