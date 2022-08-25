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
 * ����� � ������� ���������� �������������� �� ��������� Google
 */
public class GooglePage {

    /**
     * ������� � ����� ������ �� ������� ��������
     */
    private final WebElement searchField = $("input[class='gLFyf gsfi1']");

    /**
     * ��������� ������������ � ����������� ��� Google ������
     */
    private final GoogleConfig config = ConfigFactory.create(GoogleConfig.class, System.getenv());

    /**
     * ����� �������� �������� Google
     */
    public GooglePage openPage() {
        open("/");
        return this;
    }

    /**
     * ����� ����� ������ � ���� ������
     *
     * @param str ����� �����
     * @return ������� ��������
     */
    @Step("����� �� ������ {0}")
    public GooglePage inputStringInSearchField(String str) {
        waitUntilVisible(searchField);
        searchField.sendKeys(str);
        searchField.sendKeys(RETURN);
        return this;
    }

    /**
     * ����� ������ ������ n ������ ���������
     *
     * @param count ���������� ������
     */
    @Step("������ � ������� ������ ������ ����������� �������")
    public void printFirstUrlSpecifiedNumber(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(getSearchResultElementByNumber(i).getAttribute(config.linkAttribute()));
        }
    }

    /**
     * ����� ��������� �������� �� ������
     *
     * @param elementNumber ����� ��������
     * @return ������� ���������� ������
     */
    private WebElement getSearchResultElementByNumber(int elementNumber) {
        return $(By.xpath("//div[@id='search']/div/div/div[" + elementNumber + "]//a"));
    }
}
