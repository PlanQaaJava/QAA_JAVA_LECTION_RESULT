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

        switch (browser) {
            case ("chrome"):
                return "chrome";
            case ("firefox"):
                return "firefox";
            case ("edge"):
                return "edge";
            default:
                throw new NotFoundBrowserName("Browser name is wrong");
        }
    }
}
