package utils;

import config.AndroidSettingsConfig;
import dict.AndroidCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * ¬спомогательный класс дл€ установки настроек браузера
 */
public class DriverFactory {

    /**
     * Ёкземпл€р интерфейса с основными настройками драйвера
     */
    private final static AndroidSettingsConfig androidConfig = ConfigFactory.create(AndroidSettingsConfig.class, System.getenv());

    /**
     * ћетод установки настроек драйвера.
     *
     * @return андроид драйвер
     */
    @SneakyThrows
    public static AndroidDriver createDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        String runType = androidConfig.runType();

        switch (runType) {
            case ("cloud"):
                capabilities.setCapability(AndroidCapabilityType.APP, androidConfig.appBrowserStack());
                capabilities.setCapability(AndroidCapabilityType.DEVICE_NAME, androidConfig.deviceNameBrowserStack());
                capabilities.setCapability(AndroidCapabilityType.PLATFORM_VERSION, androidConfig.osVersionBrowserStack());

                return new AndroidDriver(new URL(androidConfig.urlBrowserStack()), capabilities);

            case ("local"):
                capabilities.setCapability(AndroidCapabilityType.DEVICE_NAME, androidConfig.deviceName());
                capabilities.setCapability(AndroidCapabilityType.PLATFORM_NAME, androidConfig.platformName());
                capabilities.setCapability(AndroidCapabilityType.PLATFORM_VERSION, androidConfig.platformVersion());
                capabilities.setCapability(AndroidCapabilityType.UDID, androidConfig.udid());
                capabilities.setCapability(AndroidCapabilityType.APP, androidConfig.app());
                capabilities.setCapability(AndroidCapabilityType.APP_WAIT_ACTIVITY, androidConfig.appWaitActivity());

                return new AndroidDriver(new URL(androidConfig.url()), capabilities);

            default:
                System.out.println("¬ведите корректный тип запуска автотестов");
                return null;
        }
    }
}
