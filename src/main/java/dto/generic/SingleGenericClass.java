package dto.generic;

/**
 * fileName       : ClassName
 * author         : baehyoyeol
 * date           : 2022/12/14
 * description    :
 */
public class SingleGenericClass<E> {
    private E element;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    //[접근제어자] <제네릭타입> [반환타입] [메소드명] ([제네릭타입] [파라미터(=매개변수명)]) { ... }
    public static <T> T genericMethod1(T o) {
        return o;
    }

    static <E> E genericMethod2(E o) {
        return o;
    }
}
