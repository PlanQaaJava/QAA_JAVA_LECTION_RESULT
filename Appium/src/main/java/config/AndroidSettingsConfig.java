package config;

import org.aeonbits.owner.Config;

/**
 * Config ����� ������������ ��������� ��� android driver.
 */
@Config.Sources({"classpath:config/config.properties"})
public interface AndroidSettingsConfig extends Config {

    /**
     * ��� ������� (�������� ��� � ������)
     */
    String runType();

    /**
     * ����� ��� ���������� �������
     */
    String url();

    /**
     * ��� ����������
     */
    String deviceName();

    /**
     * ������������ ������� ����������
     */
    String platformName();

    /**
     * ������ ������������ �������
     */
    String platformVersion();

    /**
     * Id ���������
     */
    String udid();

    /**
     * ����� ����������
     */
    String app();

    /**
     *  ����� �� �������� �������� Activity
     */
    String appWaitActivity();

    /**
     * ����� ��� ������� � ������
     */
    String urlBrowserStack();

    /**
     *  ����� ���������� � BrowserStack
     */
    String appBrowserStack();

    /**
     * ��� ���������� � ������
     */
    String deviceNameBrowserStack();

    /**
     * ������ ������������ ������� � ������
     */
    String osVersionBrowserStack();
}
