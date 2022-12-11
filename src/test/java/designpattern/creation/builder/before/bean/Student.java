package designpattern.creation.builder.before.bean;

/**
 * fileName       : Student1
 * author         : baehyoyeol
 * date           : 2022/12/09
 * description    : No Annotation ver.
 *                  객체를 생성하여 초기화하는 과정
 *                  옛날에는 getter / setter 로 초기화를 했쥐....
 */
public class Student {

    private long sequence;
    private String name;
    private int age;
    private String sex;

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student1{" +
              "sequence=" + sequence +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", sex='" + sex + '\'' +
              '}';
    }
}
