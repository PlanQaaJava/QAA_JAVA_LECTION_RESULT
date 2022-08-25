package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import static utils.ScreenHelper.makeScreenshotOnFailure;

/**
 * ����� ��� ������������� ���������� ���������
 */

public class Listener implements ITestListener {

    /**
     * ������ screenshot �������� � ������ ����������� �����
     *
     * @param result ��������� ���������� �����
     */
    @Override
    public void onTestFailure(ITestResult result) {
        makeScreenshotOnFailure();
    }
}
