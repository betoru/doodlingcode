package designpattern.creation.builder.after.standard;

/**
 * fileName       : Student3Builder
 * author         : baehyoyeol
 * date           : 2022/12/10
 * description    :
 */
public interface StudentBuilder {
    StudentBuilder sequence(long sequence);
    StudentBuilder name(String name);
    StudentBuilder age(int age);
    StudentBuilder sex(String sex);
    Student build();
}
