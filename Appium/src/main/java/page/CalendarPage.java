package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Класс основной страницы календаря.
 */
public class CalendarPage {

    /**
     * Переменная с текущим андроид драйвером
     */
    private final AndroidDriver driver;

    /**
     * Элемент смены отображения календаря
     */
    @FindBy(id = "com.simplemobiletools.calendar:id/change_view")
    private WebElement changeViewButton;

    /**
     * Элемент смены отображения календаря
     */
    @FindBy(id = "com.simplemobiletools.calendar:id/month_9")
    private WebElement septemberBlock;

    /**
     * Конструктор создания страницы.
     *
     * @param androidDriver экземпляр драйвера.
     */
    public CalendarPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Метод нажатия на кнопку смены отображения календаря
     */
    public ChangeViewWindow clickChangeViewButton() {
        changeViewButton.click();
        return new ChangeViewWindow(driver);
    }

    /**
     * Метод нажатия на блок сентября
     */
    public MonthPage clickSeptemberBlock() {
        septemberBlock.click();
        return new MonthPage(driver);
    }
}
