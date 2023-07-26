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
        Box<Apple> appleBox = new FruitBox<Apple>();

    }
}

class Apple extends Fruit{
    String price;
}

class Fruit {
    private String type;
}

class Box<E> {
    private String type;
}

class FruitBox<E> extends Box {
}