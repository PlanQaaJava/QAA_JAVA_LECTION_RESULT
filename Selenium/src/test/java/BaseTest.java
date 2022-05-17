import config.BaseConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static utils.ScreenHelper.makeScreenShot;

/**
 * Общий класс с настройками для всех тестов
 */
public class BaseTest {

    /**
     * Переменная с экземпляром драйвера
     */
    protected WebDriver driver;

    /**
     * Экземпляр конфигурации с общими параметрами
     */
    private final BaseConfig config = ConfigFactory.create(BaseConfig.class, System.getenv());

    /**
     * Общие настройки для всех тестов, перед выполнением каждого
     */
    @BeforeMethod
    public void setUp() {
        // Установка настройки с путем к google драйверу
        System.setProperty(config.driverProperty(), config.driverPath());

        // создание экземпляра драйвера
        driver = new ChromeDriver();

        // открытие страницы по url
        driver.get(config.url());

        // разворот страницы на полное окно
        driver.manage().window().maximize();

        //Делаем скриншот
        makeScreenShot(driver);

        //Ожидание по умолчанию 10 секунд
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * Общие настройки для всех тестов, после выполнения каждого
     */
    @AfterMethod
    public void tearDown() {

        // остановка работы драйвера
        driver.close();
    }
}
