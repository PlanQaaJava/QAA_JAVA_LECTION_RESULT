package enums;

public enum StringForSearch {
    Selenium("Selenium\n"),
    GitОпятьВсеСломал("Git опять все сломал\n"),
    ХочуБытьПрограммистом("Хочу быть программистом\n");

    private final String value;

    public String getValue() {
        return value;
    }

    StringForSearch(String value) {
        this.value = value;
    }
}
