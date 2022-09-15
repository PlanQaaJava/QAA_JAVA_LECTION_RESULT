import io.appium.java_client.android.AndroidDriver;
import lombok.Getter;
import lombok.SneakyThrows;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static utils.DriverFactory.createDriver;

/**
 * ������� ����� ��� �������� �������
 */
public class BaseTest {

    /**
     * ��������� ������� ��������
     */
    @Getter
    private AndroidDriver driver;

    /**
     * ����� ����������� ����� ������ ������
     */
    @SneakyThrows
    @BeforeMethod
    public void setUp() {
       driver = createDriver();
    }

    /**
     * ����� ����������� ����� ������� �����
     */
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
