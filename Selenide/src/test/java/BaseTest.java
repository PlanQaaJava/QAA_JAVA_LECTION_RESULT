import com.codeborne.selenide.Configuration;
import config.BaseConfig;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeClass;

import static utils.DriverHelper.getBrowserName;

/**
 * Общий класс с настройками для всех тестов
 */
public class BaseTest {

    /**
     * Экземпляр конфигурации с общими параметрами
     */
    private final BaseConfig config = ConfigFactory.create(BaseConfig.class, System.getenv());

    /**
     * Общие настройки для всех тестов, перед выполнением каждого
     */
    @BeforeClass
    public void setUp() {

        Configuration.baseUrl = config.url();
        Configuration.browser = getBrowserName(config.browser()); // По умолчанию хром
        Configuration.browserSize = config.browserSize();
    }
}
