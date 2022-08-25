package utils;

import exception.NotFoundBrowserName;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

/**
 * ��������������� ����� ��� ������ � ���������
 */
@UtilityClass
public class DriverHelper {

    /**
     * ����� ���������� �������� ��� ��������
     *
     * @param browser ����� � ������� ��������
     * @return ��� �������� ��� ������������ Selenide
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
