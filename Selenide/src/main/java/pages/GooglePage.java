package pages;

import config.GoogleConfig;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.Keys.RETURN;
import static utils.Waiters.waitUntilVisible;

/**
 *  ласс в котором происходит взаимодействие со страницей Google
 */
public class GooglePage {

    /**
     * Ёлемент с полем поиска на главной странице
     */
    private final WebElement searchField = $("input[class='gLFyf gsfi1']");

    /**
     * Ёкземпл€р конфигурации с параметрами дл€ Google тестов
     */
    private final GoogleConfig config = ConfigFactory.create(GoogleConfig.class, System.getenv());

    /**
     * ћетод открыти€ страницы Google
     */
    public GooglePage openPage() {
        open("/");
        return this;
    }

    /**
     * ћетод ввода текста в поле поиска
     *
     * @param str текст ввода
     * @return текуща€ страница
     */
    @Step("ѕоиск по строке {0}")
    public GooglePage inputStringInSearchField(String str) {
        waitUntilVisible(searchField);
        searchField.sendKeys(str);
        searchField.sendKeys(RETURN);
        return this;
    }

    /**
     * ћетод печати первых n ссылок элементов
     *
     * @param count количество ссылок
     */
    @Step("ѕечать в консоль ссылки первых результатов запроса")
    public void printFirstUrlSpecifiedNumber(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(getSearchResultElementByNumber(i).getAttribute(config.linkAttribute()));
        }
    }

    /**
     * ћетод получени€ элемента по номеру
     *
     * @param elementNumber номер элемента
     * @return элемент результата поиска
     */
    private WebElement getSearchResultElementByNumber(int elementNumber) {
        return $(By.xpath("//div[@id='search']/div/div/div[" + elementNumber + "]//a"));
    }
}
