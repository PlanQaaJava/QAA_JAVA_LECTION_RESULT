package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Класс с методами явного ожидания
 */
public class Waiters {

    /**
     * Ожидает в течении 5 секунд появления элемента на странице.
     *
     * @param driver  экземпляр драйвера браузера
     * @param element элемент
     */
    public static void waitUntilVisible(final WebDriver driver, WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(element));
    }
}
