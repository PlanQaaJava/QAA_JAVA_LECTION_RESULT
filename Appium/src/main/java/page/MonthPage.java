package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  ласс страницы мес€ца.
 */
public class MonthPage {

    /**
     * ѕеременна€ с текущим андроид драйвером
     */
    private final AndroidDriver driver;

    /**
     * Ёлемент с числами 9, 10, 16, 17
     */
    @FindBy(id = "com.simplemobiletools.calendar:id/month_6")
    private WebElement month6Blocks;

    /**
     *  онструктор создани€ страницы.
     *
     * @param androidDriver экземпл€р драйвера.
     */
    public MonthPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }

    /**
     * ћетод нажати€ 9 день мес€ца
     */
    public DayPage click9DayOfMonth() {
        new Actions(driver).moveToElement(month6Blocks, 5, 5).click().perform();
        return new DayPage(driver);
    }
}
