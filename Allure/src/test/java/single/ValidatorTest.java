package single;

import exception.BadStringValue;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utils.Validator.validateInputString;

/**
 * Набор отдельных тестов для класса Validator
 */
@Epic("Validator")
@Feature("Single tests. Валидация строки.")
public class ValidatorTest {

    /**
     * Проверка валидации строки с латинскими символами в нижнем регистре
     */
    @Test(description = "Валидация строки с латинскими символами в нижнем регистр")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с латинскими символами в нижнем регистре")
    @Description("Тест проверяет валидацию строки с латинскими символами в нижнем регистре")
    public void testValidateInputStringLatinLettersLowerCase() {
        String str = "test";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с русскими символами в нижнем регистре
     */
    @Test(description = "Валидация строки с русскими символами в нижнем регистр")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с русскими символами в нижнем регистре")
    @Description("Тест проверяет валидацию строки с русскими символами в нижнем регистре")
    public void testValidateInputStringRussianLettersLowerCase() {
        String str = "тест";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с латинскими символами в верхнем регистре
     */
    @Test(description = "Валидация строки с латинскими символами в верхнем регистр")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с латинскими символами в верхнем регистре")
    @Description("Тест проверяет валидацию строки с латинскими символами в верхнем регистре")
    public void testValidateInputStringLatinLettersUpperCase() {
        String str = "TEST";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с русскими символами в верхнем регистре
     */
    @Test(description = "Валидация строки с русскими символами в верхнем регистр")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с русскими символами в верхнем регистре")
    @Description("Тест проверяет валидацию строки с русскими символами в верхнем регистре")
    public void testValidateInputStringRussianLettersUpperCase() {
        String str = "ТЕСТ";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с латинскими символами в смешанном регистре
     */
    @Test(description = "Валидация строки с латинскими символами в смешанном регистре")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с латинскими символами в смешанном регистре")
    @Description("Тест проверяет валидацию строки с латинскими символами в смешанном регистре")
    public void testValidateInputStringLatinLettersMixedCase() {
        String str = "TeSt";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с русскими символами в смешанном регистре
     */
    @Test(description = "Валидация строки с русскими символами в смешанном регистре")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с русскими символами в смешанном регистре")
    @Description("Тест проверяет валидацию строки с русскими символами в смешанном регистре")
    public void testValidateInputStringRussianLettersMixedCase() {
        String str = "ТеСт";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с русскими и латинскими символами
     */
    @Test(description = "Валидация строки с русскими и латинскими символами")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с русскими и латинскими символами")
    @Description("Тест проверяет валидацию строки с русскими и латинскими символами")
    public void testValidateInputStringMixedLetters() {
        String str = "TestТест";
        String result = validateInputString(str);
        assertEquals(result, str);
    }

    /**
     * Проверка валидации строки с числами
     */
    @Test(expectedExceptions = BadStringValue.class, description = "Валидация строки с числами")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с числами")
    @Description("Тест проверяет валидацию строки с числами (Негативная проверка)")
    public void testValidateInputStringWithNumber() {
        String str = "15ss15";
        validateInputString(str);
    }

    /**
     * Проверка валидации строки с разными символами
     */
    @Test(expectedExceptions = BadStringValue.class, description = "Валидация строки с разными символами")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с разными символами")
    @Description("Тест проверяет валидацию строки с разными символами (Негативная проверка)")
    public void testValidateInputStringWithSomeSymbols() {
        String str = "/*%$@#$";
        validateInputString(str);
    }

    /**
     * Проверка валидации строки с пробелом
     */
    @Test(expectedExceptions = BadStringValue.class, description = "Валидация строки с пробелом")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с пробелом")
    @Description("Тест проверяет валидацию строки с пробелом (Негативная проверка)")
    public void testValidateInputStringWithSpace() {
        String str = " ";
        validateInputString(str);
    }

    /**
     * Проверка валидации строки с пустой строкой
     */
    @Test(expectedExceptions = BadStringValue.class, description = "Валидация строки с пустой строкой")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с пустой строкой")
    @Description("Тест проверяет валидацию строки с пустой строкой (Негативная проверка)")
    public void testValidateInputStringWithEmpty() {
        String str = "";
        validateInputString(str);
    }

    /**
     * Проверка валидации строки с пустой строкой
     */
    @Test(expectedExceptions = BadStringValue.class, description = "Валидация строки с пустой строкой")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Валидация строки с пустой строкой")
    @Description("Тест проверяет валидацию строки с пустой строкой (Негативная проверка)")
    public void testValidateInputStringWithEmpty12() {
        String str = null;
        validateInputString(str);
    }
}
