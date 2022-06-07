import database.SqlConnector;
import database.steps.SqlSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Connection;

/**
 * Базовый тестовый класс
 */
public class BaseTest {

    /**
     * Переменная с шагами SQL
     */
    protected SqlSteps steps;

    /**
     * Экземпляр класса SQL коннектора
     */
    private final SqlConnector connector = new SqlConnector();

    /**
     * Переменная с подключением
     */
    protected Connection connection;

    @BeforeEach
    public void setUp() {
        // Открытие подключения к БД
        connection = connector.openConnection();

        // Создание объекта SqlSteps
        steps = new SqlSteps(connection);
    }

    @AfterEach
    public void tearDown() {
        // Закрытие подключения к БД
        connector.closeConnection(connection);
    }
}
