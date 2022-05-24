package utils;

import io.restassured.response.Response;
import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Вспомогательный класс, оболочка для работы с ответами
 */
@AllArgsConstructor
public class ResponseWrapper {

    /**
     * ответ в RestAssured
     */
    private final Response response;

    /**
     * Метод преобразования тела ответа к объекту
     *
     * @param Clazz класс объекта
     * @param <T>   тип данных объекта
     * @return объект
     */
    public <T> T as(Class<T> Clazz) {
        return response.as(Clazz);
    }

    /**
     * Метод преобразования тела ответа к списку объектов
     *
     * @param Clazz массив классов объекта
     * @param <T>   тип данных объекта
     * @return список объектов
     */
    public <T> List<T> asList(Class<T[]> Clazz) {
        return List.of(response.as(Clazz));
    }

    /**
     * Метод получения статус кода ответа
     *
     * @return статус код
     */
    public int getStatusCode() {
        return response.getStatusCode();
    }
}
