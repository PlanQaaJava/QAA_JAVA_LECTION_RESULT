package utils;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Класс с методами работы со скриншотами
 */
@UtilityClass
public class ScreenHelper {

    /**
     * Делает скриншот для allure отчета
     */
    @Attachment(value = "Screen by fail", type = "image/png")
    public static byte[] makeScreenshotOnFailure() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}

