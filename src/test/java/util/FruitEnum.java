package util;

/**
 * 과일 enum
 */
public enum FruitEnum {
    APPLE("사과"),
    BANANA("바나나"),
    ORANGE("오렌지"),
    MANGO("망고"),
    PINEAPPLE("파인애플"),
    KIWI("키위"),
    WATERMELON("수박"),
    STRAWBERRY("딸기"),
    GRAPE("포도"),
    CHERRY("체리");

    private final String korName;

    FruitEnum(String korName) {
        this.korName = korName;
    }

    public String getKorName() {
        return korName;
    }

    public static String matchByKorName(String korName) {
        for (FruitEnum fruitEnum : FruitEnum.values()) {
            if (fruitEnum.getKorName().equals(korName)) {
                return fruitEnum.name();
            }
        }
        return null;
    }
}
