package config;

import org.aeonbits.owner.Config;

/**
 * Интерфейс с основной конфигурацией проекта
 */
@Config.Sources({"classpath:config.properties"})
public interface BaseConfig extends Config {

    /**
     * Метод для возвращения значения параметра baseUrl из config.properties
     *
     * @return базовый URL
     */
    String baseUrl();
}
