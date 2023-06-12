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
		String[][] arr = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
		fillArray(arr);
	}

	public static void checkSizeStringArray(String[][] array) {}

	public static int[][] fillArray(String[][] array) {
		int[][] resultArray = new int[4][4];
		int sumElemsInArray = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				resultArray[i][j] = Integer.parseInt(array[i][j]);
				sumElemsInArray += sumElemsInArray + resultArray[i][j];
				System.out.println(resultArray[i][j] + "_" + "Summ = " + sumElemsInArray);
			}
		}
		return resultArray;
	}
}
