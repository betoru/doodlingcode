package dto.array;

import lombok.Data;

/**
 * fileName       : ArrayData
 * author         : baehyoyeol
 * date           : 2022/12/13
 * description    :
 */
@Data
public class ArrayData {
    private String name;
    private int age;
    private String address;
    private String graduation;

    public ArrayData(String name, int age, String address, String graduation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "ArrayData{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", address='" + address + '\'' +
              ", graduation='" + graduation + '\'' +
              '}';
    }
}
