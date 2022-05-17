package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Класс с методами работы со скриншотами
 */
public class ScreenHelper {

    /**
     * Делает скриншот для allure отчета
     *
     * @param driver экземпляр драйвера
     */
    @Attachment
    public static byte[] makeScreenShot(WebDriver driver) {
        Screenshot screenshot = new AShot().takeScreenshot(driver);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            ImageIO.write(screenshot.getImage(), "PNG", buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toByteArray();
    }
}
