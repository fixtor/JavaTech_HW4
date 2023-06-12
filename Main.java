import java.util.Scanner;

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
	public static String[][] correctArr;
	public static String[][] incorrectSizeArr;

	public static String[][] incorrectDataArr;
	public static void main(String[] args) {
		correctArr =       new String[][] {{"1", "1", "1", "1"},
								           {"1", "1", "1", "1"},
										   {"1", "1", "1", "1"},
										   {"1", "1", "1", "1"}}; // Создаем корректный массив

		incorrectSizeArr = new String[][]  {{"5", "1", "1", "1", "1"},
									        {"1", "1", "1", "1"},
									        {"1", "1", "1", "1"},
									        {"1", "1", "1", "1"}}; // Создаем некорректный массив по количеству

		 incorrectDataArr = new String[][] {{"abc", "1", "1", "1"},
									        {"1", "1", "1", "1"},
									        {"1", "1", "1", "1"},
									        {"1", "1", "1", "1"}}; // Создаем некорректный массив по содержимому

		runProgram(); //TODO "Сделать в case проверки сначала на длину, затем закончить с блоком DataException, Доделать меню выбора
	}

	    public static void runProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите вариант запуска программы:");
        System.out.println("1 - Корректный массив");
        System.out.println("2 - Некорректный массив по размеру");
        System.out.println("3 - Некорректный массив по данным");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Выполнить правильный вариант запуска программы
                showExceptionsSize(correctArr);
				MyArray correctMyArray = new MyArray(correctArr);
				int[][] mainArr = correctMyArray.getIntArray(correctArr);
				correctMyArray.getValues(mainArr);
                break;
            case 2:
                // Выполнить исключение по количеству элементов
	            System.out.println(incorrectSizeArr.length);
	            showExceptionsSize(incorrectSizeArr);
				break;
			case 3:
                // Выполнить исключение по количеству элементов
	            MyArray incorrectDataArray = new MyArray(incorrectDataArr);
				incorrectDataArray.checkDataArray(incorrectDataArr);
				break;
            case 4:
                // Выход из программы
                System.out.println("Вы выбрали вариант 3 - Выход");
                System.exit(0);
                break;
            default:
                System.out.println("Некорректный вариант. Пожалуйста, выберите 1, 2 или 3.");
                // Повторно вызываем метод для выбора варианта
                runProgram();
                break;
        }

        scanner.close();
    }

	public static void showExceptionsSize(String[][] array) {
		MyArray myArray = new MyArray(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					myArray.checkSizeArray(array);
				} catch (MyArraySizeException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}

