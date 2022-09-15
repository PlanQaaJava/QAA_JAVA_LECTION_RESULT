package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * ����� �������� ���.
 */
public class DayPage {

    /**
     * ���������� � ������� ������� ���������
     */
    private final AndroidDriver driver;

    /**
     * ������� � ������������ �����, ������ � ��� ������
     */
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.widget.FrameLayout/androidx.viewpager.widget.b[2]/android.widget.RelativeLayout/android.widget.TextView")
    private WebElement monthDayAndDayOfWeekElement;

    /**
     * ����������� �������� ��������.
     *
     * @param androidDriver ��������� ��������.
     */
    public DayPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        PageFactory.initElements(driver, this);
    }

    /**
     * ����� ��������� ������ ������, ����� � ��� ������
     */
    public String getTextMonthDayDayByWeek() {
        return monthDayAndDayOfWeekElement.getText();
    }
}
