import io.appium.java_client.android.AndroidDriver;
import lombok.Getter;
import lombok.SneakyThrows;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static utils.DriverFactory.createDriver;

/**
 * Ѕазовый класс дл€ тестовых классов
 */
public class BaseTest {

    /**
     * Ёкземпл€р андроид драйвера
     */
    @Getter
    private AndroidDriver driver;

    /**
     * ћетод выполн€емый перед каждым тестом
     */
    @SneakyThrows
    @BeforeMethod
    public void setUp() {
       driver = createDriver();
    }

    /**
     * ћетод выполн€емый после каждого теста
     */
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
