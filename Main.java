/** Задача 1:

1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.*/

public class Main {
	public static void main(String[] args) {
		String[][] arr = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
		checkSizeStringArray(arr);
	}

	public static void checkSizeStringArray(String[][] array) {}

	public static int[][] fillArray(String[][] array) {
		int[][] resultArray = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				resultArray[i][j] = Integer.parseInt(array[i][j]);
				System.out.print(resultArray[i][j] + "_");
			}
		}
		return resultArray;
	}
}
