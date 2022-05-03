package single;

import exception.BadStringValue;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputString;

/**
 * Набор отдельных тестов для класса Validator
 */
public class ValidatorTest {

    /**
     * Проверка валидации строки с латинскими символами в нижнем регистре
     */
    @Test
    public void testValidateInputStringLatinLettersLowerCase() {
        String str = "test";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с русскими символами в нижнем регистре
     */
    @Test
    public void testValidateInputStringRussianLettersLowerCase() {
        String str = "тест";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с латинскими символами в верхнем регистре
     */
    @Test
    public void testValidateInputStringLatinLettersUpperCase() {
        String str = "TEST";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с русскими символами в верхнем регистре
     */
    @Test
    public void testValidateInputStringRussianLettersUpperCase() {
        String str = "ТЕСТ";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с латинскими символами в смешанном регистре
     */
    @Test
    public void testValidateInputStringLatinLettersMixedCase() {
        String str = "TeSt";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с русскими символами в смешанном регистре
     */
    @Test
    public void testValidateInputStringRussianLettersMixedCase() {
        String str = "ТеСт";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с русскими и латинскими символами
     */
    @Test
    public void testValidateInputStringMixedLetters() {
        String str = "TestТест";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации с числами
     */
    @Test(expectedExceptions = BadStringValue.class)
    public void testValidateInputStringWithNumber() {
        String str = "15fddf15";
        validateInputString(str);
    }

    /**
     * Проверка валидации строки с разными символами
     */
    @Test(expectedExceptions = BadStringValue.class)
    public void testValidateInputStringWithSomeSymbols() {
        String str = "/*%$@#$";
        validateInputString(str);
    }

    /**
     * Проверка валидации строки с пробелом
     */
    @Test(expectedExceptions = BadStringValue.class)
    public void testValidateInputStringWithSpace() {
        String str = " ";
        validateInputString(str);
    }

    /**
     * Проверка валидации строки с пустой строкой
     */
    @Test(expectedExceptions = BadStringValue.class)
    public void testValidateInputStringWithEmpty() {
        String str = "";
        validateInputString(str);
    }
}
