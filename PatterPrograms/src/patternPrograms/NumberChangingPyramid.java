package patternPrograms;

public class NumberChangingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberChangingPyramid n = new NumberChangingPyramid();
		n.numPyramid();

	}
	
	public void numPyramid() {
		int num=0;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				num++;
				System.out.print(num);
			}System.out.println();
		}
	}

}
