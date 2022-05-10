package single;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import model.Concatenator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Набор отдельных тестов для класса Concatenator
 */
@Epic("Concatenator")
@Feature("Single tests. Добавление строки")
public class ConcatenatorTest {

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
     * Позитивная проверка добавление строки
     */
    @Test(description = "Добавление строки в пустой Concatenator")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Добавление строки в пустой Concatenator")
    @Description("Тест проверяет добавление новой строки в первый раз")
    public void testPutStringPositive() {
        String str = "test";
        concatenator.putString(str);
        assertEquals(concatenator.getString(), str);
    }

    /**
     * Негативная проверка, если передается null
     */
    @Test(description = "Добавление null в Concatenator")
    @Severity(SeverityLevel.NORMAL)
    @Story("Добавление null в Concatenator")
    @Description("Тест проверяет, что при добавлении null строка конкатенатора не изменяется (Негативная проверка)")
    public void testPutStringWithNullArgument() {
        String str = null;
        concatenator.putString(str);
        assertEquals(concatenator.getString(), "");
    }
}
