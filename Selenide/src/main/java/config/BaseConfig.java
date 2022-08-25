package config;

import org.aeonbits.owner.Config;

/**
 * ��������� � �������� ������������� �������
 */
@Config.Sources({"classpath:config.properties"})
public interface BaseConfig extends Config {

    /**
     * ����� ��������� �������� url
     *
     * @return ������� url
     */
    String url();

    /**
     * ����� ��������� ����������� ��������
     *
     * @return �������
     */
    String browser();

    /**
     * ����� ��������� ������� ���� ��������
     *
     * @return ������ ���� ��������
     */
    String browserSize();
}
