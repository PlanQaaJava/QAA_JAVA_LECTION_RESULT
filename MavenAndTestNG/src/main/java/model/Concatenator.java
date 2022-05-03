package model;

/**
 * Класс "конкатенатор" хранит в себе значение строки и увеличивает ее
 */
public class Concatenator {

    /**
     * Переменная для хранения строки
     */
    private String string = "";

    /**
     * Возвращает значение параметра string
     * @return значение параметра string
     */
    public String getString() {
        return string;
    }

    /**
     * Метод добавления новой насчти строки к имеющейся, если она не null
     *
     * @param newString новая строка
     */
    public void putString(String newString) {
        if (newString != null) {
            string += newString;
        }
    }
}
