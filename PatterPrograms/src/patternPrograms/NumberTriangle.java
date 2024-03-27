package patternPrograms;

public class NumberTriangle {

	int num = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		numTriangle(num);
	}

	public static void numTriangle(int n) {

		int i, j;

		for (i = 1; i < n; i++) {
			for (j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
