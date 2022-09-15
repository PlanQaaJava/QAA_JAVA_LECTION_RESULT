package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * ����� �������� �������� ���������.
 */
public class CalendarPage {

    /**
     * ���������� � ������� ������� ���������
     */
    private final AndroidDriver driver;

    /**
     * ������� ����� ����������� ���������
     */
    @FindBy(id = "com.simplemobiletools.calendar:id/change_view")
    private WebElement changeViewButton;

    /**
     * ������� ����� ����������� ���������
     */
    @FindBy(id = "com.simplemobiletools.calendar:id/month_9")
    private WebElement septemberBlock;

    /**
     * ����������� �������� ��������.
     *
     * @param androidDriver ��������� ��������.
     */
    public CalendarPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }

    /**
     * ����� ������� �� ������ ����� ����������� ���������
     */
    public ChangeViewWindow clickChangeViewButton() {
        changeViewButton.click();
        return new ChangeViewWindow(driver);
    }

    /**
     * ����� ������� �� ���� ��������
     */
    public MonthPage clickSeptemberBlock() {
        septemberBlock.click();
        return new MonthPage(driver);
    }
}
