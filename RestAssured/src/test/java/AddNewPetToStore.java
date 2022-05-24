import base.BaseTest;
import dto.PetModel;
import dto.response.ErrorResponse;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ResponseWrapper;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static utils.ExpectedObjectBuilder.getUnknownErrorResponse;
import static utils.TestDataHelper.NOT_VALID_PET_ID;
import static utils.TestDataHelper.STATUS_CODE_ERROR_500;
import static utils.TestDataHelper.STATUS_CODE_OK;
import static utils.TestDataHelper.VALID_PET_ID;
import static utils.TestObjectBuilder.getAddNewPetModel;

/**
 * Тест сьют метода POST /pet
 */
@Epic("Pet контроллер")
@Feature("Add new pet to store")
public class AddNewPetToStore extends BaseTest {

    @Test
    @DisplayName("Add new pet to store. Positive case")
    @Story("Добавление нового питомца, позитивный сценарий")
    public void testAddNewPetToStorePositive() {
        step("Создание тела запроса с валидным ID", () -> {
            request = getAddNewPetModel(VALID_PET_ID);
        });

        step("Выполнение запроса POST /pet", () -> {
            responseWrapper = steps.createNewPetToStore(request);
        });

        step("Проверка результата", () -> {
            int statusCode = responseWrapper.getStatusCode();
            PetModel response = responseWrapper.as(PetModel.class);

            assertSoftly(
                    softAssertions -> {
                        softAssertions
                                .assertThat(statusCode)
                                .withFailMessage("Status code doesn't match")
                                .isEqualTo(STATUS_CODE_OK);
                        softAssertions
                                .assertThat(response)
                                .withFailMessage("Response body doesn't match")
                                .isEqualTo(request);
                    }
            );
        });
    }

    @Test
    @DisplayName("Add new pet to store. Negative case with not valid ID")
    @Story("Добавление нового питомца с не валидным ID, негативный сценарий")
    public void testAddNewPetToStoreNegative() {
        step("Создание тела запроса с не валидным ID", () -> {
            request = getAddNewPetModel(NOT_VALID_PET_ID);
        });

        step("Выполнение запроса POST /pet", () -> {
            responseWrapper = steps.createNewPetToStore(request);
        });

        step("Проверка результата", () -> {
            int statusCode = responseWrapper.getStatusCode();
            ErrorResponse error = responseWrapper.as(ErrorResponse.class);

            assertSoftly(
                    softAssertions -> {
                        softAssertions
                                .assertThat(statusCode)
                                .withFailMessage("Status code doesn't match")
                                .isEqualTo(STATUS_CODE_ERROR_500);
                        softAssertions
                                .assertThat(error)
                                .withFailMessage("Error body doesn't match")
                                .isEqualTo(getUnknownErrorResponse());
                    }
            );
        });
    }
}
