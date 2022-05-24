package utils;

/**
 * Вспомагательный класс для формирования ожидаемых результатов
 */
import dto.response.ErrorResponse;

public class ExpectedObjectBuilder {

    /**
     * Код неизвестной ошибки
     */
    private static final int UNKNOWN_CODE = 500;

    /**
     * Тип неизвестной ошибки
     */
    private static final String UNKNOWN_TYPE = "unknown";

    /**
     * Сообщение неизвестной ошибки
     */
    private static final String UNKNOWN_MESSAGE = "something bad happened";

    /**
     * Метод формирования ожидаемого результата неизвестой ошибки
     *
     * @return тело ошибки
     */
    public static ErrorResponse getUnknownErrorResponse(){
        return ErrorResponse.builder()
                .code(UNKNOWN_CODE)
                .type(UNKNOWN_TYPE)
                .message(UNKNOWN_MESSAGE)
                .build();
    }
}
