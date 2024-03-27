package patternPrograms;

public class NumberIncreasingPramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberIncreasingPramid n = new NumberIncreasingPramid();
		n.numberPramid();

	}
	
	public void numberPramid() {
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}System.out.println("");
		}
	}

}
