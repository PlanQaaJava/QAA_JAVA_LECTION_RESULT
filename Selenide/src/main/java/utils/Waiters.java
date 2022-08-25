package utils;

import com.codeborne.selenide.impl.Waiter;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebElement;

/**
 * Класс с методами явного ожидания
 */
@UtilityClass
public class Waiters {

    /**
     * Ожидает в течении 5 секунд появления элемента на странице.
     *
     * @param element элемент
     */
    public static void waitUntilVisible(WebElement element) {
        new Waiter().wait(element, webElement -> element.isDisplayed(), 5, 1);
    }
}