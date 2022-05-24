import base.BaseTest;
import dto.PetModel;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ResponseWrapper;

import java.util.List;

import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static utils.TestDataHelper.STATUS_CODE_OK;
import static utils.TestDataHelper.VALID_STATUS;
import static utils.TestDataHelper.getRandomNotValidStatus;

/**
 * Тест сьют метода GET /pet/findByStatus
 */
@Epic("Pet контроллер")
@Feature("Find pets by status")
public class FindPetsByStatus extends BaseTest {

    @Test
    @DisplayName("Find pets by status. Positive case")
    @Story("Поиск питомцев по статусу, позитивный сценарий")
    public void testFindPetsByStatusPositive(){
        ResponseWrapper responseWrapper = steps.getPetByStatus(VALID_STATUS);

        int statusCode = responseWrapper.getStatusCode();
        List<PetModel> response = responseWrapper.asList(PetModel[].class);

        assertSoftly(
                softAssertions -> {
                    softAssertions
                            .assertThat(statusCode)
                            .withFailMessage("Status code doesn't match")
                            .isEqualTo(STATUS_CODE_OK);
                    softAssertions
                            .assertThat(response)
                            .withFailMessage("Response body is empty")
                            .isNotEmpty();
                }
        );
    }

    @Test
    @DisplayName("Find pets by status. Negative case, if status is not existing")
    @Story("Поиск питомцев с несуществующим статусом, негативный сценарий")
    public void testFindPetsByStatusIfStatusNullNegative(){
        ResponseWrapper responseWrapper = steps.getPetByStatus(getRandomNotValidStatus());

        int statusCode = responseWrapper.getStatusCode();
        List<PetModel> response = responseWrapper.asList(PetModel[].class);

        assertSoftly(
                softAssertions -> {
                    softAssertions
                            .assertThat(statusCode)
                            .withFailMessage("Status code doesn't match")
                            .isEqualTo(STATUS_CODE_OK);
                    softAssertions
                            .assertThat(response)
                            .withFailMessage("Response body is not empty")
                            .isEmpty();
                }
        );
    }
}
