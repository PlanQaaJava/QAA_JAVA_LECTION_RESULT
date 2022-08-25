import config.GoogleConfig;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.GooglePage;
import utils.Listener;

/**
 * Основной класс с тестами GooglePage
 */
@Epic("Google")
@Listeners(Listener.class)
public class GoogleTest extends BaseTest {

    /**
     * Экземпляр конфигурации с параметрами для Google тестов
     */
    private final GoogleConfig config = ConfigFactory.create(GoogleConfig.class, System.getenv());

    @Test(description = "Вывод первых 5 ссылок результатов поиска в консоль")
    @Feature("Вывод результатов")
    public void testSearchGoogle() {
        new GooglePage()
                .openPage()
                .inputStringInSearchField(config.inputSearch())
                .printFirstUrlSpecifiedNumber(5);
    }
}
