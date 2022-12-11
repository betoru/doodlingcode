package designpattern.creation.builder.after.standard;

/**
 * fileName       : Student3
 * author         : baehyoyeol
 * date           : 2022/12/10
 * description    :
 */
public class Student {
    private long sequence;
    private String name;
    private int age;
    private String sex;

    public Student(long sequence, String name, int age, String sex) {
        this.sequence = sequence;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student3{" +
              "sequence=" + sequence +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", sex='" + sex + '\'' +
              '}';
    }
}
