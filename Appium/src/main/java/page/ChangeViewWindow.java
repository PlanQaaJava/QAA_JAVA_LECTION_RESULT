package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * ���� � ������� ���� ����������� ���������
 */
public class ChangeViewWindow {

    /**
     * ���������� � ������� ������� ���������
     */
    private final AndroidDriver driver;

    /**
     * ���-���� ����������� ��������� �� ������� ���
     */
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/" +
            "android.widget.RadioGroup[1]/android.widget.RadioButton[4]")
    private WebElement yearlyViewCheckbox;

    /**
     * ����������� �������� ��������.
     *
     * @param androidDriver ��������� ��������.
     */
    public ChangeViewWindow(AndroidDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }

    /**
     * ����� ������� �� ���-���� ����������� ��������� �� ������� ���
     */
    public CalendarPage clickYearlyViewCheckbox() {
        yearlyViewCheckbox.click();
        return new CalendarPage(driver);
    }
}
