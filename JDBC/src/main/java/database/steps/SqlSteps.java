package database.steps;

import database.models.QaaModel;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс с реализацией Sql шагов
 */
@AllArgsConstructor
public class SqlSteps {

    private static final String ID_FIELD = "id";
    private static final String LAST_NAME_FIELD = "last_name";
    private static final String FIRST_NAME_FIELD = "first_name";
    private static final String EMAIL_FIELD = "email";
    private static final String BIRTHDAY_FIELD = "birthdate";
    private static final String IS_MALE_FIELD = "is_male";

    private static final String INSERT_SQL_QUERY = "INSERT INTO qaa (%s, %s, %s, %s, %s)" +
            "VALUES (\"%s\",\"%s\",\"%s\",\"%s\",%b)";

    private static final String UPDATE_SQL_REQUEST = "UPDATE qaa " +
            "SET %s = \"%s\", %s = \"%s\", %s = \"%s\", %s = \"%s\", %s = %b " +
            "WHERE %s = %d";

    private static final String DELETE_SQL_REQUEST = "DELETE FROM qaa WHERE %s = %d";

    private static final String SELECT_ALL_SQL_REQUEST = "SELECT * FROM qaa";
    private static final String SELECT_BY_ID_SQL_REQUEST = "SELECT * FROM qaa WHERE %s = %d";

    /**
     * Переменная с подключением к БД
     */
    private final Connection connection;

    /**
     * Метод создания Qaa в БД
     *
     * @param qaa объект с параметрами для создания
     */
    public void createQaa(QaaModel qaa) {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(String.format(INSERT_SQL_QUERY,
                    LAST_NAME_FIELD, FIRST_NAME_FIELD, EMAIL_FIELD, BIRTHDAY_FIELD, IS_MALE_FIELD,
                    qaa.getLastName(), qaa.getFirstName(), qaa.getEmail(), qaa.getBirthDate(), qaa.isMale()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод обновления Qaa в БД
     *
     * @param qaa объект с параметрами для обновления
     * @param id  идентификатор поля, которое обновляем
     */
    public void updateQaa(QaaModel qaa, int id) {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(String.format(UPDATE_SQL_REQUEST,
                    LAST_NAME_FIELD, qaa.getLastName(),
                    FIRST_NAME_FIELD, qaa.getFirstName(),
                    EMAIL_FIELD, qaa.getEmail(),
                    BIRTHDAY_FIELD, qaa.getBirthDate(),
                    IS_MALE_FIELD, qaa.isMale(),
                    ID_FIELD, id)
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод удаления Qaa в БД
     *
     * @param id идентификатор поля, которое удаляем
     */
    public void deleteQaa(int id) {
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(String.format(DELETE_SQL_REQUEST, ID_FIELD, id)
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод запроса всех Qaa из БД
     *
     * @return список всех Qaa
     */
    public List<QaaModel> getAllQaa() {
        List<QaaModel> list = new ArrayList<>();
        try (Statement stmt = connection.createStatement()) {
            ResultSet result = stmt.executeQuery(SELECT_ALL_SQL_REQUEST);
            while (result.next()) {
                list.add(QaaModel.builder()
                        .id(result.getInt(ID_FIELD))
                        .lastName(result.getString(LAST_NAME_FIELD))
                        .firstName(result.getString(FIRST_NAME_FIELD))
                        .email(result.getString(EMAIL_FIELD))
                        .birthDate(result.getObject(BIRTHDAY_FIELD, LocalDate.class))
                        .isMale(result.getBoolean(IS_MALE_FIELD))
                        .build()
                );
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return list;
        }
    }

    /**
     * Метод запроса Qaa по ID из БД
     *
     * @param id идентификатор поля
     * @return объект Qaa
     */
    public QaaModel getQaaById(int id) {
        try (Statement stmt = connection.createStatement()) {
            ResultSet result = stmt.executeQuery(String.format(SELECT_BY_ID_SQL_REQUEST, ID_FIELD, id));
            if (result.next()) {
                return QaaModel.builder()
                        .id(result.getInt(ID_FIELD))
                        .lastName(result.getString(LAST_NAME_FIELD))
                        .firstName(result.getString(FIRST_NAME_FIELD))
                        .email(result.getString(EMAIL_FIELD))
                        .birthDate(result.getObject(BIRTHDAY_FIELD, LocalDate.class))
                        .isMale(result.getBoolean(IS_MALE_FIELD))
                        .build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
