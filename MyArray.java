import java.util.Arrays;

public class MyArray {

	private final int iSize = 4;
	private final int jSize = 4;
	public String[][] stringArray;

	public MyArray(String[][] stringArray) {
		this.stringArray = stringArray;
	}

	public int[][] getIntArray(String[][] array) {
		int[][] resultArray = new int[iSize][jSize];
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < resultArray.length; j++) {
				resultArray[i][j] = Integer.parseInt(array[i][j]);
			}
		} return resultArray;
	}

	public void getValues(int[][] intArray) {
		for (int[] ints : intArray) {
			for (int j = 0; j < intArray.length; j++) {
				System.out.print(ints[j] + " ");
			}
		}
	}
}


