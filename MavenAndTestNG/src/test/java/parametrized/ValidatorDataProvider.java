package parametrized;

import exception.BadStringValue;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputString;

/**
 * Набор тестов с DataProvider для класса Validator
 */
public class ValidatorDataProvider {

    /**
     * DataProvider с тестовыми данными для позитивных тестов
     *
     * @return двумерный массив объектвой (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getTestDataPositive() {
        return new String[][]{
                {"test"},
                {"тест"},
                {"TEST"},
                {"ТЕСТ"},
                {"TeSt"},
                {"ТеСт"},
                {"TestТест"}
        };
    }

    /**
     * DataProvider с тестовыми данными для негативных тестов
     *
     * @return двумерный массив объектвой (стандартный return для DataProvider)
     */
    @DataProvider
    public Object[][] getTestDataNegative() {
        return new String[][]{
                {"15ss15"},
                {"/*%$@#$"},
                {" "},
                {""}
        };
    }

    /**
     * Параметризированный позитивный тест
     *
     * @param str тестовые данные из DataProvider
     */
    @Test(dataProvider = "getTestDataPositive")
    public void testValidateInputStringPositive(String str) {
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Параметризированный негативный тест
     *
     * @param str тестовые данные из DataProvider
     */
    @Test(dataProvider = "getTestDataNegative", expectedExceptions = BadStringValue.class)
    public void testValidateInputStringNegative(String str) {
        validateInputString(str);
    }
}
