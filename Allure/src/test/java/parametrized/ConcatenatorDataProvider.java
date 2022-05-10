package parametrized;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import model.Concatenator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Набор тестов с DataProvider для класса Concatenator
 */
@Epic("Concatenator")
@Feature("Parameterized tests. Добавление строки")
public class ConcatenatorDataProvider {

    /**
     * Создание переменной с классом Concatenator.
     */
    private Concatenator concatenator;

    /**
     * Метод который выполняется перед каждый тестом, создает объект класса.
     */
    @BeforeMethod
    public void setUp() {
        concatenator = new Concatenator();
    }

    /**
     * DataProvider с тестовыми данными и ожидаемым результатом для тестов
     *
     * @return двумерный массив объектвой (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getTestAndExpectedData() {
        return new String[][]{
                {"test", "test"},
                {null, ""}
        };
    }

    /**
     * DataProvider с тестовыми данными и ожидаемым результатом для тестов
     *
     * @return двумерный массив объектвой (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getTestAndExpectedData2() {
        return new String[][]{
                {"test1", "test2", "test1test2"},
        };
    }

    /**
     * Параметризированный тест
     *
     * @param str      тестовые данные из DataProvider
     * @param expected ожидаемый результат из DataProvider
     */
    @Test(dataProvider = "getTestAndExpectedData")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Добавление строки в Concatenator с Data Provider")
    @Description("Тест добавление строки в Concatenator с Data Provider")
    public void testPutStringDataProvider(String str, String expected) {
        concatenator.putString(str);
        assertEquals(concatenator.getString(), expected);
    }

    /**
     * Позитивная проверка добавление двух строк
     */
    @Test(dataProvider = "getTestAndExpectedData2")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Добавление строки в Concatenator с Data Provider")
    @Description("Тест добавление строки в Concatenator с Data Provider")
    public void testPutTwoStringPositive(String str1, String str2, String expected) {
        concatenator.putString(str1);
        concatenator.putString(str2);
        assertEquals(concatenator.getString(), expected);
    }
}
