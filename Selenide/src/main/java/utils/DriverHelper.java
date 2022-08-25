package utils;

import exception.NotFoundBrowserName;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

/**
 * Вспомогательный класс для работы с драйвером
 */
@UtilityClass
public class DriverHelper {

    /**
     * Метод возвращает валидное имя браузера
     *
     * @param browser стрка с имененм браузера
     * @return имя браузера для конфигурации Selenide
     */
    @SneakyThrows
    public static String getBrowserName(String browser) {

        return switch (browser) {
            case ("chrome") -> "chrome";
            case ("firefox") -> "firefox";
            case ("edge") -> "edge";
            default -> throw new NotFoundBrowserName("Browser name is wrong");
        };
    }
}
