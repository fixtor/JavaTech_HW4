public class MyArrayDataException extends ArrayException{

	public MyArrayDataException(String message, String nameArray, int iIndex, int jIndex) {
		super(message, nameArray, iIndex, jIndex);
	}
}
