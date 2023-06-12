public class ArrayException extends Exception{

private String nameArray;
private int iIndex;
private int jIndex;

	public String getName() {
		return nameArray;
	}

	public int getiIndex() {
		return iIndex;
	}

	public int getjIndex() {
		return jIndex;
	}

	public ArrayException(String message, String nameArray, int iIndex, int jIndex) {
		super(message);
		this.nameArray = nameArray;
		this.iIndex = iIndex;
		this.jIndex = jIndex;
	}
}
