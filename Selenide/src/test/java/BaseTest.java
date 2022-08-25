import com.codeborne.selenide.Configuration;
import config.BaseConfig;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeClass;

import static utils.DriverHelper.getBrowserName;

/**
 * ����� ����� � ����������� ��� ���� ������
 */
public class BaseTest {

    /**
     * ��������� ������������ � ������ �����������
     */
    private final BaseConfig config = ConfigFactory.create(BaseConfig.class, System.getenv());

    /**
     * ����� ��������� ��� ���� ������, ����� ����������� �������
     */
    @BeforeClass
    public void setUp() {

        Configuration.baseUrl = config.url();
        Configuration.browser = getBrowserName(config.browser()); // �� ��������� ����
        Configuration.browserSize = config.browserSize();
    }
}
