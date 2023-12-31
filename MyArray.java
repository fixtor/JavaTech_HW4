public class MyArray {

	private final int iSize = 4;
	private final int jSize = 4;
	public String[][] stringArray;
	public MyArray(String[][] stringArray) {
		   this.stringArray = stringArray;
	}

	public void checkSizeArray(String[][] stringArray) throws MyArraySizeException {
		if (stringArray.length != this.iSize) {
			throw new MyArraySizeException("Размер должен быть 4", stringArray.length);
		}
		for (String[] strings : stringArray) {
			if (strings.length != this.jSize) throw new MyArraySizeException("Размер должен быть 4", strings.length);
		}
	}


	public void checkDataArray(String[][] stringArray) throws MyArrayDataException{
		int number = 0;
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < stringArray[0].length; j++) {
				try {
					number = Integer.parseInt(stringArray[i][j]);
				} catch (NumberFormatException e){
					System.out.println("Индекс: " + i + "." + j);
					throw new MyArrayDataException("Неверные вводные данные по индексу", i, j);

				}
			}
		}
	}


	public int[][] getIntArray(String[][] array) {
		int[][] resultArray = new int[iSize][jSize];
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < resultArray.length; j++) {
				resultArray[i][j] = Integer.parseInt(array[i][j]);
			}
		} return resultArray;
	}

	public int sumValues(int[][] intArray) {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				sum += intArray[i][j];
			}
		} return sum;
	}

	public void getValues(int[][] intArray){
		for (int[] ints : intArray) {
			System.out.println("\n");
			for (int j = 0; j < intArray.length; j++) {
				System.out.print(ints[j] + " ");
			}
		}
	}
}


