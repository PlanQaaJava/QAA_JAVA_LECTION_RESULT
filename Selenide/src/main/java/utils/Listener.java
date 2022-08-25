package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import static utils.ScreenHelper.makeScreenshotOnFailure;

/**
 * Класс для имплементации интерфейса слушателя
 */

public class Listener implements ITestListener {

    /**
     * Делает screenshot страницы в случае неуспешного теста
     *
     * @param result результат выполнения теста
     */
    @Override
    public void onTestFailure(ITestResult result) {
        makeScreenshotOnFailure();
    }
}
