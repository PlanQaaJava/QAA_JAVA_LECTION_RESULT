package config;

import org.aeonbits.owner.Config;

/**
 * Config класс возвращающий параметры для android driver.
 */
@Config.Sources({"classpath:config/config.properties"})
public interface AndroidSettingsConfig extends Config {

    /**
     * Тип запуска (локально или в облаке)
     */
    String runType();

    /**
     * Адрес для локального запуска
     */
    String url();

    /**
     * Имя устройства
     */
    String deviceName();

    /**
     * Операционная система устройства
     */
    String platformName();

    /**
     * Версия операционной системы
     */
    String platformVersion();

    /**
     * Id эмулятора
     */
    String udid();

    /**
     * Адрес приложения
     */
    String app();

    /**
     *  Пакет из которого грузятся Activity
     */
    String appWaitActivity();

    /**
     * Адрес для запуска в облаке
     */
    String urlBrowserStack();

    /**
     *  Адрес приложения в BrowserStack
     */
    String appBrowserStack();

    /**
     * Имя устройства в облаке
     */
    String deviceNameBrowserStack();

    /**
     * Версия операционной системы в облаке
     */
    String osVersionBrowserStack();
}
