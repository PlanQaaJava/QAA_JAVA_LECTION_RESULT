import database.models.QaaModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.TestObjectBuilder.getRandomQaaModel;

public class QaaTest extends BaseTest {

    /**
     * Модель объекта
     */
    private QaaModel qaa;

    private int id;

    @BeforeEach
    public void setUpClass() {
        qaa = getRandomQaaModel();
        steps.createQaa(qaa);
        List<QaaModel> list = steps.getAllQaa();
        for (QaaModel element : list) {
            if (element.getLastName().equals(qaa.getLastName())) {
                id = element.getId();
            }
        }
    }

    @Test
    @DisplayName("Создание QAA в базе данных")
    public void creatingQaaInDataBase() {
        qaa = getRandomQaaModel();
        boolean isCreated = false;
        int id = -1;

        steps.createQaa(qaa);

        List<QaaModel> list = steps.getAllQaa();
        for (QaaModel element : list) {
            id = element.getId();
            isCreated = true;
            if (element.getLastName().equals(qaa.getLastName())) {
                assertThat(element)
                        .isEqualTo(qaa);
            }
        }

        assertThat(isCreated)
                .withFailMessage("Qaa wasn't create")
                .isTrue();

        steps.deleteQaa(id);
    }

    @Test
    @DisplayName("Обновление QAA в базе данных")
    public void updateQaaInDataBase() {
        qaa = getRandomQaaModel();

        steps.updateQaa(qaa, id);

        QaaModel actualQaa = steps.getQaaById(id);

        assertThat(actualQaa)
                .isEqualTo(qaa);
        steps.deleteQaa(id);
    }

    @Test
    @DisplayName("Удаление QAA из базы")
    public void deleteQaaInDataBase() {
        boolean isDeleted = true;

        steps.deleteQaa(id);

        List<QaaModel> listAfterDelete = steps.getAllQaa();
        for (QaaModel element : listAfterDelete) {
            if (element.getLastName().equals(qaa.getLastName())) {
                isDeleted = false;
                break;
            }
        }

        assertThat(isDeleted)
                .withFailMessage("Qaa wasn't delete")
                .isTrue();
    }
}
