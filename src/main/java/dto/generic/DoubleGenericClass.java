package dto.generic;

/**
 * fileName       : DoubleGenericClass
 * author         : baehyoyeol
 * date           : 2022/12/14
 * description    :
 */
public class DoubleGenericClass<K, V> {
    private K first;
    private V second;

    public void set(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
