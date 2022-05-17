package pages;

import config.GoogleTestsConfig;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.ScreenHelper.makeScreenShot;
import static utils.Waiters.waitUntilVisible;

/**
 * Класс в котором происходит взаимодействие со страницей Google
 */
public class GooglePage {

    /**
     * Экземпляр драйвера для управления браузером
     */
    private final WebDriver driver;

    /**
     * Экземпляр конфигурации с параметрами для Google тестов
     */
    private final GoogleTestsConfig config = ConfigFactory.create(GoogleTestsConfig.class, System.getenv());

    /**
     * Элемент с полем поиска на главной странице
     */
    @FindBy(css = "input[class='gLFyf gsfi']")
    private WebElement searchField;

    /**
     * Конструктор создания GooglePage
     *
     * @param driver драйвер для управления браузером
     */
    public GooglePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Метод ввода текста в поле поиска
     *
     * @param str текст ввода
     * @return текущая страница
     */
    @Step("Поиск по строке")
    public GooglePage inputStringInSearchField(String str) {
        waitUntilVisible(driver, searchField);
        searchField.sendKeys(str);
        makeScreenShot(driver);
        return this;
    }

    /**
     * Метод печати первых n ссылок элементов
     *
     * @param count количество ссылок
     */
    @Step("Печать в консоль ссылки первых результатов запроса")
    public void printFirstUrlSpecifiedNumber(int count){
        for (int i = 1; i <= count; i++){
            System.out.println(getSearchResultElementByNumber(i).getAttribute(config.linkAttribute()));
        }
    }

    /**
     * Метод получения элемента по номеру
     *
     * @param elementNumber номер элемента
     * @return элемент результата поиска
     */
    private WebElement getSearchResultElementByNumber(int elementNumber){
        return driver.findElement(By.xpath("//div[@id='search']/div/div/div[" + elementNumber + "]//a"));
    }
}
