package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Окно с выбором вида отображения календаря
 */
public class ChangeViewWindow {

    /**
     * Переменная с текущим андроид драйвером
     */
    private final AndroidDriver driver;

    /**
     * Чек-бокс отображения календаря на текущий год
     */
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.RadioGroup[1]/android.widget.RadioButton[4]")
    private WebElement yearlyViewCheckbox;

    /**
     * Конструктор создания страницы.
     *
     * @param androidDriver экземпляр драйвера.
     */
    public ChangeViewWindow(AndroidDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Метод нажатия на чек-бокс отображения календаря на текущий год
     */
    public CalendarPage clickYearlyViewCheckbox() {
        yearlyViewCheckbox.click();
        return new CalendarPage(driver);
    }
}
