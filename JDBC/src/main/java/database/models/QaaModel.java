package database.models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * Модель сущность qaa базы данных
 */
@Data
@Builder
@EqualsAndHashCode(exclude = {"id"})
public class QaaModel {

    /**
     * Идентификатор
     */
    private final int id;

    /**
     * Фамилия
     */
    private final String lastName;

    /**
     * Имя
     */
    private final String firstName;

    /**
     * Электронная почта
     */
    private final String email;

    /**
     * Дата рождения
     */
    private final LocalDate birthDate;

    /**
     * Пол
     */
    private final boolean isMale;
}
