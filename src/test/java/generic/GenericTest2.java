package generic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * fileName       : GenericTest2
 * author         : baehyoyeol
 * date           : 2022/12/18
 * description    :
 */
public class GenericTest2 {

    @Test
    @DisplayName("제네릭 테스트")
    void genericTest1() {
//        Box<Apple> appleBox = new Box<>();
//        Box<Fruit> fruitBox = new Box<Apple>(); // error
//        Box<Apple> appleBox = new FruitBox<Apple>();


    }
}

class Fruit {
    String name;
    String price;
}

class Apple extends Fruit {
    private String type;
}

class Busa extends Apple {
    String size;
}

class Hongro extends Apple {
    String size;
}

class Peach extends Fruit {
    private String type;
}

class Soft extends Peach {
    String size;
}

class Hard extends Peach {
    String size;
}

class Chundo extends Hard {
    String size;
}