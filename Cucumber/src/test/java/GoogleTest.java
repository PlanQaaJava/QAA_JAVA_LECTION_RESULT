import config.GoogleTestsConfig;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;
import pages.GooglePage;

/**
 * Основной класс с тестами GooglePage
 */
@Epic("Google")
public class GoogleTest extends BaseTest {

    /**
     * Экземпляр конфигурации с параметрами для Google тестов
     */
    private final GoogleTestsConfig config = ConfigFactory.create(GoogleTestsConfig.class, System.getenv());

    @Test(description = "Вывод первых 5 ссылок результатов поиска в консоль")
    @Feature("Вывод результатов поиска")
    public void testSearchGoogle() {
        new GooglePage(driver)
                .inputStringInSearchField(config.inputSearch())
                .printFirstUrlSpecifiedNumber(5);
    }
}
