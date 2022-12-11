package designpattern.creation.builder.lombok;

import lombok.Builder;

/**
 * fileName       : Student5
 * author         : baehyoyeol
 * date           : 2022/12/10
 * description    :
 */
@Builder
public class Student {
    private long sequence;
    private String name;
    private int age;
    private String sex;

    @Override
    public String toString() {
        return "Student{" +
              "sequence=" + sequence +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", sex='" + sex + '\'' +
              '}';
    }
}
