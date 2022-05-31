package cucumber.steps;

import config.BaseConfig;
import config.GoogleTestsConfig;
import enums.StringForSearch;
import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;

import java.time.Duration;

import static utils.ScreenHelper.makeScreenShot;

public class MyStepdefs {

    /**
     * Переменная с экземпляром драйвера
     */
    protected WebDriver driver;

    /**
     * Экземпляр страницы с которой происходит взаимодействие
     */
    private GooglePage googlePage;

    /**
     * Экземпляр конфигурации с общими параметрами
     */
    private final BaseConfig config = ConfigFactory.create(BaseConfig.class, System.getenv());

    @ParameterType(".*")
    public StringForSearch str(String str) {
        return StringForSearch.valueOf(str);
    }

    @Когда("Открыт ресурс Google")
    public void открытРесурсGoogle() {
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

        //Создание объекта страницы
        googlePage = new GooglePage(driver);
    }

    @Тогда("Ввод {str} и жмем найти")
    public void вводСтрокаДляПоискаИЖмемНайти(StringForSearch str) {
        googlePage.inputStringInSearchField(str.getValue());
    }

    @Тогда("Вывод на экран {int} ссылок")
    public void выводНаЭкранКоличествоСсылок(int quantity) {
        googlePage.printFirstUrlSpecifiedNumber(quantity);
    }

    @Тогда("Закрыть браузер")
    public void закрытьБраузер() {

        // остановка работы драйвера
        driver.close();
    }
}
