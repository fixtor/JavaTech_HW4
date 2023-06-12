public class ArrayException extends Exception{

private String name;
private int iIndex;
private int jIndex;

	public String getName() {
		return name;
	}

	public int getiIndex() {
		return iIndex;
	}

	public int getjIndex() {
		return jIndex;
	}

	public ArrayException(String message, String name, int iIndex, int jIndex) {
		super(message);
		this.name = name;
		this.iIndex = iIndex;
		this.jIndex = jIndex;
	}
}
