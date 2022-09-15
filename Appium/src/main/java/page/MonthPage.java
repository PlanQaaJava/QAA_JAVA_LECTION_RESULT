package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * ����� �������� ������.
 */
public class MonthPage {

    /**
     * ���������� � ������� ������� ���������
     */
    private final AndroidDriver driver;

    /**
     * ������� � ������� 9, 10, 16, 17
     */
    @FindBy(id = "com.simplemobiletools.calendar:id/month_6")
    private WebElement month6Blocks;

    /**
     * ����������� �������� ��������.
     *
     * @param androidDriver ��������� ��������.
     */
    public MonthPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }

    /**
     * ����� ������� 9 ���� ������
     */
    public DayPage click9DayOfMonth() {
        new Actions(driver).moveToElement(month6Blocks, 5, 5).click().perform();
        return new DayPage(driver);
    }
}
