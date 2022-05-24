package steps;

import dto.PetModel;
import io.restassured.specification.RequestSpecification;
import utils.ResponseWrapper;

import static io.restassured.RestAssured.given;

/**
 * Класс с реализацией всех Rest шагов
 */
public class Steps {

    /**
     * Экземпляр спецификации RestAssured
     */
    private final RequestSpecification requestSpecification;

    /**
     * Часть URL для запросов /pet
     */
    private static final String PET_PATH = "pet";

    /**
     * Часть URL для запросов /findByStatus
     */
    private static final String FIND_BY_STATUS_PATH = "pet/findByStatus";

    /**
     * Параметр status, get запроса findByStatus
     */
    private static final String STATUS_PARAMETER = "status";

    /**
     * Конструктор для создания экземпляра класса
     *
     * @param requestSpecification спецификация RestAssured
     */
    public Steps(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    /**
     * Метод создания питомца
     *
     * @param request тело запроса
     * @return оболочка для работы с ответом
     */
    public ResponseWrapper createNewPetToStore(PetModel request) {
        return new ResponseWrapper(given(requestSpecification)
                .when()
                .body(request)
                .post(PET_PATH)
                .andReturn());
    }

    /**
     * Метод поиска питомцев по статусу
     *
     * @param status статус
     * @return оболочка для работы с ответом
     */
    public ResponseWrapper getPetByStatus(String status) {
        return new ResponseWrapper(given(requestSpecification)
                .when()
                .param(STATUS_PARAMETER, status)
                .get(FIND_BY_STATUS_PATH)
                .andReturn());
    }
}
