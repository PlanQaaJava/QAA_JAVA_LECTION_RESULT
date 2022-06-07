package utils;

import database.models.QaaModel;
import lombok.experimental.UtilityClass;

import static utils.GenerateRandomDataHelper.getRandomBirthDate;
import static utils.GenerateRandomDataHelper.getRandomEmail;
import static utils.GenerateRandomDataHelper.getRandomFirstName;
import static utils.GenerateRandomDataHelper.getRandomLastName;
import static utils.GenerateRandomDataHelper.getRandomSex;

/**
 * Класс с методами создания тестовых объектов
 */
@UtilityClass
public class TestObjectBuilder {

    /**
     * Метод генерации случайной Qaa модели
     *
     * @return случайную Qaa модель
     */
    public static QaaModel getRandomQaaModel() {
        return QaaModel.builder()
                .lastName(getRandomLastName())
                .firstName(getRandomFirstName())
                .email(getRandomEmail())
                .birthDate(getRandomBirthDate())
                .isMale(getRandomSex())
                .build();
    }
}
