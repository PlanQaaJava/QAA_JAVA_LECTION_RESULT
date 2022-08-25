import config.GoogleConfig;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.GooglePage;
import utils.Listener;

/**
 * �������� ����� � ������� GooglePage
 */
@Epic("Google")
@Listeners(Listener.class)
public class GoogleTest extends BaseTest {

    /**
     * ��������� ������������ � ����������� ��� Google ������
     */
    private final GoogleConfig config = ConfigFactory.create(GoogleConfig.class, System.getenv());

    @Test(description = "����� ������ 5 ������ ����������� ������ � �������")
    @Feature("����� �����������")
    public void testSearchGoogle() {
        new GooglePage()
                .openPage()
                .inputStringInSearchField(config.inputSearch())
                .printFirstUrlSpecifiedNumber(5);
    }
}
