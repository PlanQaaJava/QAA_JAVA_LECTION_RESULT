package utils;

import exception.BadStringValue;

/**
 * Класс для проверки на валидацию
 */
public class Validator {

    /**
     * Проверяет строку на наличие в ней только латинских и русских букв
     *
     * @param input проверяемая строка
     * @return строка в случае успешной проверки, null в случае неуспешной.
     */
    public static String validateInputString(String input) throws BadStringValue {
        if (input.matches("[a-zA-Zа-яА-Я]*") && !input.isEmpty()) {
            return input;
        } else {
            throw new BadStringValue("String have a bad symbol - " + input);
        }
    }
}
