public class ArrayException extends Exception{

private int lenght;
private int iIndex;
private int jIndex;

	public ArrayException(String message, int lenght) {
		super(message);
		this.lenght = lenght;
	}

	public ArrayException(String message, int iIndex, int jIndex) {
		super(message);
		this.iIndex = iIndex;
		this.jIndex = jIndex;
	}
}
