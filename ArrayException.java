public class ArrayException extends Exception{

private int lenght;

	public ArrayException(String message, int lenght) {
		super(message);
		this.lenght = lenght;
	}
}
