package generic;

import dto.generic.DoubleGenericClass;
import dto.generic.SingleGenericClass;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * fileName       : ClassNameTest
 * author         : baehyoyeol
 * date           : 2022/12/14
 * description    :
 */
@Slf4j
class GenericTest {
    @Test
    @DisplayName("single generic 'class' test")
    void singleGenericTest() {
        SingleGenericClass<String> singleGenericClass = new SingleGenericClass<>();
        SingleGenericClass<Integer> singleGenericClass2 = new SingleGenericClass<>();
        singleGenericClass.setElement("test");
        singleGenericClass2.setElement(1);

        log.info("genericClass.getElement().getClass() = {}", singleGenericClass.getElement().getClass());
        log.info("genericClass.getElement().getClass().getName() = {}", singleGenericClass.getElement().getClass().getName());

        log.info("genericClass2.getElement().getClass() = {}", singleGenericClass2.getElement().getClass());
        log.info("genericClass2.getElement().getClass().getName() = {}", singleGenericClass2.getElement().getClass().getName());

        assertEquals("test", singleGenericClass.getElement());
        assertEquals(1, singleGenericClass2.getElement());
    }

    @Test
    @DisplayName("double generic 'class' test")
    void doubleGenericTest() {
        DoubleGenericClass<String, Integer> doubleGenericClass = new DoubleGenericClass<>();
        doubleGenericClass.set("test", 1);

        log.info("doubleGenericClass.getFirst().getClass() = {}", doubleGenericClass.getFirst().getClass());
        log.info("doubleGenericClass.getSecond().getClass() = {}", doubleGenericClass.getSecond().getClass());

        assertEquals("test", doubleGenericClass.getFirst());
        assertEquals(1, doubleGenericClass.getSecond());
    }

    /**
     * <p>클래스에서 지정한 제네릭유형과 별도로 메소드에서 독립적으로 제네릭 유형을 선언하여 쓸 수 있다.</p>
     * <p>이러한 방식이 왜 필요한가? 바로 '정적 메소드로 선언할 때 필요'하기 때문이다.</p>
     * <p>앞서 제네릭은 유형을 외부에서 지정해준다고 했다.</p>
     * <p>즉 해당 클래스 객체가 인스턴스화 했을 때(= new 생성자로 클래스 객체를 생성) <> 괄호 사이에 파라미터로 넘겨준 타입으로 지정이 된다는 뜻이다.</p>
     * <p>하지만 static 은 무엇인가? 정적이라는 뜻이다.</p>
     * <p>static 변수, static 함수 등 static이 붙은 것들은 기본적으로 프로그램 실행시 메모리에 이미 올라가있다.</p>
     * <p>이 말은 객체 생성을 통해 접근할 필요 없이 이미 메모리에 올라가 있기 때문에 클래스 이름을 통해 바로 쓸 수 있다는 것이다.</p>
     * <p>근데, 거꾸로 생각해보자면 static 메소드는 객체가 생성되기 전에 이미 메모리에 올라가는데 타입을 어디서 얻어올 수 있을까?</p>
     * <p>때문에 제네릭이 사용되는 메소드를 정적메소드로 두고 싶은 경우 제네릭 클래스와 별도로 독립적인 제네릭이 사용되어야 한다는 것이다.</p>
     */
    @Test
    @DisplayName("generic 'method' test")
    void singleGenericMethodTest() {
        SingleGenericClass<String> singleGenericClass = new SingleGenericClass<>();
        Class<? extends String> result1 = singleGenericClass.genericMethod1("test").getClass();
        log.info("result1 = {}", result1);

        SingleGenericClass<Integer> singleGenericClass2 = new SingleGenericClass<>();
        Class<? extends Integer> result2 = singleGenericClass2.genericMethod1(10).getClass();
        log.info("result2 = {}", result2);
    }
}