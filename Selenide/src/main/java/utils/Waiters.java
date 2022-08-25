package utils;

import com.codeborne.selenide.impl.Waiter;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebElement;

/**
 * ����� � �������� ������ ��������
 */
@UtilityClass
public class Waiters {

    /**
     * ������� � ������� 5 ������ ��������� �������� �� ��������.
     *
     * @param element �������
     */
    public static void waitUntilVisible(WebElement element) {
        new Waiter().wait(element, webElement -> element.isDisplayed(), 5, 1);
    }
}