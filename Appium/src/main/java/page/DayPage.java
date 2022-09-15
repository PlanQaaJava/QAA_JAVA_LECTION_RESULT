package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс страницы дня.
 */
public class DayPage {

    /**
     * Переменная с текущим андроид драйвером
     */
    private final AndroidDriver driver;

    /**
     * Элемент с отображением числа, месяца и дня недели
     */
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.widget.FrameLayout/androidx.viewpager.widget.b[2]/android.widget.RelativeLayout/android.widget.TextView")
    private WebElement monthDayAndDayOfWeekElement;

    /**
     * Конструктор создания страницы.
     *
     * @param androidDriver экземпляр драйвера.
     */
    public DayPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Метод получения текста месяца, числа и дня недели
     */
    public String getTextMonthDayDayByWeek() {
        return monthDayAndDayOfWeekElement.getText();
    }
}
