package database;

import config.BaseConfig;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Класс в котором подключение к базе данных
 */
public class SqlConnector {

    /**
     * Экземпляра конфигурации
     */
    private static final BaseConfig config = ConfigFactory.create(BaseConfig.class, System.getenv());

    /**
     * Метод открытия подключения к базе данных
     *
     * @return экземпляр подключения
     */
    @SneakyThrows
    public Connection openConnection(){
        Class.forName(config.driverDb());
        return DriverManager.getConnection(config.urlDb(), config.userDb(), config.passwordDb());
    }

    /**
     * Метод закрытия подключения к базе даных
     *
     * @param connection экземпляр подключения
     */
    @SneakyThrows
    public void closeConnection(Connection connection){
        connection.close();
    }
}
