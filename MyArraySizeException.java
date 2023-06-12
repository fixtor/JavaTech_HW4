public class MyArraySizeException extends ArrayException{


	public MyArraySizeException(String message, String nameArray, int iIndex, int jIndex) {
		super(message, nameArray, iIndex, jIndex);
	}
}
