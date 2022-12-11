package designpattern.creation.builder.before.constructor;

/**
 * fileName       : Student2
 * author         : baehyoyeol
 * date           : 2022/12/09
 * description    : constructor ver.
 */
public class Student {
    private long sequence;
    private String name;
    private int age;
    private String sex;

    //필요한 생성자마다 모두 생성해야함
    public Student(long sequence, String name, int age) {
        this.sequence = sequence;
        this.name = name;
        this.age = age;
    }
    //필요한 생성자마다 모두 생성해야함
    public Student(long sequence, String name, int age, String sex) {
        this.sequence = sequence;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student2{" +
              "sequence=" + sequence +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", sex='" + sex + '\'' +
              '}';
    }
}
