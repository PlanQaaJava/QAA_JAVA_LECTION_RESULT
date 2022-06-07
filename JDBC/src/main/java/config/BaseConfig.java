package config;

import org.aeonbits.owner.Config;

/**
 * Интерфейс с параметрами основной конфигурации
 */
@Config.Sources({"classpath:config.properties"})
public interface BaseConfig extends Config {

    /**
     * Адрес драйвера подключения
     *
     * @return адрес драйвера
     */
    String driverDb();

    /**
     * Адрес базы данных
     *
     * @return адрес базы данных
     */
    String urlDb();

    /**
     * Пользователь базы данных
     *
     * @return пользователь
     */
    String userDb();

    /**
     * Пароль базы данных
     *
     * @return пароль
     */
    String passwordDb();
}

