package config;

import org.aeonbits.owner.Config;

/**
 * ��������� � ������������� ������� ��� ������ Google ��������
 */
@Config.Sources({"classpath:google_tests_config.properties"})
public interface GoogleConfig extends Config {

    /**
     * ����� ���������� �������� linkAttribute �� google_tests_config.properties
     *
     * @return �������� �������� ������
     */
    String linkAttribute();

    /**
     * ����� ���������� �������� seleniumInput �� google_tests_config.properties
     *
     * @return �������� ������ ������
     */
    String inputSearch();
}
