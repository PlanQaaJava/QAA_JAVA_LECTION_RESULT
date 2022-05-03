package single;

import model.Concatenator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Набор отдельных тестов для класса Concatenator
 */
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
     * Позитивная проверка добавление одной строки
     */
    @Test
    public void testPutOneStringPositive() {
        String str = "test";
        concatenator.putString(str);
        assertEquals(concatenator.getString(), str);
    }

    /**
     * Позитивная проверка добавление двух строк
     */
    @Test
    public void testPutTwoStringPositive() {
        String firstStr = "test1";
        String secondStr = "test2";
        String result = firstStr + secondStr;
        concatenator.putString(firstStr);
        concatenator.putString(secondStr);
        assertEquals(concatenator.getString(), result);
    }

    /**
     * Негативная проверка, если передается null
     */
    @Test
    public void testPutStringWithNullArgument() {
        String str = null;
        concatenator.putString(str);
        assertEquals(concatenator.getString(), "");
    }
}
