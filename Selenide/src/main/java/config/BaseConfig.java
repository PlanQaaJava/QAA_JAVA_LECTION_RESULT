package config;

import org.aeonbits.owner.Config;

/**
 * Интерфейс с основной конфигурацией проекта
 */
@Config.Sources({"classpath:config.properties"})
public interface BaseConfig extends Config {

    /**
     * Метод получения базового url
     *
     * @return базовый url
     */
    String url();

    /**
     * Метод получения конкретного браузера
     *
     * @return браузер
     */
    String browser();

    /**
     * Метод получения размера окна браузера
     *
     * @return размер окна браузера
     */
    String browserSize();
}
