package config;

import org.aeonbits.owner.Config;

/**
 * Интерфейс с конфигурацией проекта для тестов Google страницы
 */
@Config.Sources({"classpath:google_tests_config.properties"})
public interface GoogleConfig extends Config {

    /**
     * Метод возвращает параметр linkAttribute из google_tests_config.properties
     *
     * @return параметр атрибута ссылки
     */
    String linkAttribute();

    /**
     * Метод возвращает параметр seleniumInput из google_tests_config.properties
     *
     * @return параметр строки поиска
     */
    String inputSearch();
}
