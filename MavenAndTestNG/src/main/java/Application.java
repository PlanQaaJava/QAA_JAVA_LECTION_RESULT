import model.Concatenator;

import java.util.Scanner;

import static utils.Validator.validateInputString;

public class Application {

    public static void main(String[] args) {

        // Создание объекта Concatenator
        Concatenator concatenator = new Concatenator();

        // Бескоченый цикл, чтобы выполнение программы не прекращалось
        while (true) {

            // Создание сканера, который считывает значение с консоли.
            System.out.println("Input a new string");
            Scanner scanner = new Scanner(System.in);

            // Проверка строки
            String str = validateInputString(scanner.next());

            // Добавление сроки в конкатенатор.
            concatenator.putString(str);
        }
    }
}
