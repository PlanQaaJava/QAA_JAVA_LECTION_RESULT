package utils;

import dto.PetModel;

import java.util.List;

import static utils.TestDataHelper.VALID_CATEGORY_ID;
import static utils.TestDataHelper.VALID_STATUS;
import static utils.TestDataHelper.VALID_TAG_ID;
import static utils.TestDataHelper.VALID_TAG_NAME;
import static utils.TestDataHelper.getRandomCategoryName;
import static utils.TestDataHelper.getRandomPetName;
import static utils.TestDataHelper.getRandomUrl;

/**
 * Вспомагательный класс для формирования тестовых объектов
 */
public class TestObjectBuilder {

    /**
     * Метод для формирования тела запроса создания питомца
     *
     * @param id идентификатор питомца
     * @return тело запроса
     */
    public static PetModel getAddNewPetModel(String id) {
        return PetModel.builder()
                .id(id)
                .category(PetModel.CategoryAndTagsItem.builder()
                        .id(VALID_CATEGORY_ID)
                        .name(getRandomCategoryName())
                        .build())
                .name(getRandomPetName())
                .photoUrls(List.of(getRandomUrl()))
                .tags(List.of(PetModel.CategoryAndTagsItem.builder()
                        .id(VALID_TAG_ID)
                        .name(VALID_TAG_NAME)
                        .build()))
                .status(VALID_STATUS)
                .build();
    }
}
